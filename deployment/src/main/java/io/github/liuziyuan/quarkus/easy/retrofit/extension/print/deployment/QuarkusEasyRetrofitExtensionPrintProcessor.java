package io.github.liuziyuan.quarkus.easy.retrofit.extension.print.deployment;

import io.github.liuziyuan.quarkus.easy.retrofit.extension.print.runtime.PrintInterceptor;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class QuarkusEasyRetrofitExtensionPrintProcessor {

    private static final String FEATURE = "quarkus-easy-retrofit-extension-print";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    public AdditionalBeanBuildItem registerMyCustomBean() {
        return AdditionalBeanBuildItem.unremovableOf(PrintInterceptor.class);
    }
}
