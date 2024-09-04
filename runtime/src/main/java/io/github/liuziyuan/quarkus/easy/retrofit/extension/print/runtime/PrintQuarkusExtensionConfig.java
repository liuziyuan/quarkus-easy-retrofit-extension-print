package io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime;

import io.quarkus.arc.DefaultBean;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;

@Dependent
public class PrintQuarkusExtensionConfig {

    @Produces
    @DefaultBean
    public PrintInterceptor printInterceptor() {
        return new PrintInterceptor();
    }
}
