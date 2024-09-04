package io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime;

import io.github.easyretrofit.core.RetrofitResourceContext;
import io.github.easyretrofit.core.extension.BaseInterceptor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;

import java.io.IOException;

@Slf4j
@ApplicationScoped
public class PrintInterceptor extends BaseInterceptor {

    @Inject
    RetrofitResourceContext context;

    @Override
    protected Response executeIntercept(Chain chain) throws IOException {
        PrintInfo printInfoAnnotation = (PrintInfo) super.getExtensionAnnotation(PrintInfo.class);
        String value = printInfoAnnotation.value();
        log.info("{}{}", value, chain.request().method());
        return chain.proceed(chain.request());
    }

    @Override
    protected RetrofitResourceContext getInjectedRetrofitResourceContext() {
        return this.context;
    }
}
