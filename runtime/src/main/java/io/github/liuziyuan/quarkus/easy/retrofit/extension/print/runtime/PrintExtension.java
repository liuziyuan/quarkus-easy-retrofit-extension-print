package io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime;

import io.github.easyretrofit.core.RetrofitInterceptorExtension;
import io.github.easyretrofit.core.delegate.BaseExceptionDelegate;
import io.github.easyretrofit.core.exception.RetrofitExtensionException;
import io.github.easyretrofit.core.extension.BaseInterceptor;

import java.lang.annotation.Annotation;

public class PrintExtension implements RetrofitInterceptorExtension {
    @Override
    public Class<? extends Annotation> createAnnotation() {
        return PrintInfo.class;
    }

    @Override
    public Class<? extends BaseInterceptor> createInterceptor() {
        return PrintInterceptor.class;
    }

    @Override
    public Class<? extends BaseExceptionDelegate<? extends RetrofitExtensionException>> createExceptionDelegate() {
        return null;
    }
}
