package io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime;

import io.github.easyretrofit.core.RetrofitResourceContext;
import io.github.easyretrofit.core.extension.BaseInterceptor;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import okhttp3.Response;
import org.jboss.logging.Logger;

import java.io.IOException;

@ApplicationScoped
public class PrintInterceptor extends BaseInterceptor {
    private static final Logger LOG = Logger.getLogger(PrintInterceptor.class);
    @Inject
    RetrofitResourceContext context;

    @Override
    protected Response executeIntercept(Chain chain) throws IOException {
        PrintInfo printInfoAnnotation = (PrintInfo) super.getExtensionAnnotation(PrintInfo.class);
        String value = printInfoAnnotation.value();
        LOG.info(value + chain.request().method());
        return chain.proceed(chain.request());
    }

    @Override
    protected RetrofitResourceContext getInjectedRetrofitResourceContext() {
        return this.context;
    }
}
