package io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime;


import io.github.easyretrofit.core.annotation.RetrofitInterceptor;
import io.github.easyretrofit.core.annotation.RetrofitInterceptorParam;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@RetrofitInterceptor(handler = PrintInterceptor.class)
public @interface PrintInfo {

    String value() default "info: ";

    RetrofitInterceptorParam extensions() default @RetrofitInterceptorParam();
}
