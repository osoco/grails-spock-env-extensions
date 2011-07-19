package es.osoco.grails.plugins;

import grails.util.Environment;
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.SpecInfo;

public class IgnoreForEnvironmentExtension extends AbstractAnnotationDrivenExtension<IgnoreForEnvironment> {
    @Override
    public void visitSpecAnnotation(IgnoreForEnvironment annotation, SpecInfo spec) {
        spec.setSkipped(isSkipped(annotation));
    }

    @Override
    public void visitFeatureAnnotation(IgnoreForEnvironment annotation, FeatureInfo feature) {
        feature.setSkipped(isSkipped(annotation));
    }

    private boolean isSkipped(IgnoreForEnvironment annotation) {
        for (String enviroment : annotation.value()) {
            if (Environment.getCurrent().getName().equals(enviroment)) {
                return true;
            }
        }

        return false;
    }
}
