package es.osoco.grails.plugins;

import grails.util.Environment;
import org.spockframework.runtime.extension.AbstractAnnotationDrivenExtension;
import org.spockframework.runtime.model.FeatureInfo;
import org.spockframework.runtime.model.SpecInfo;

public class ExecuteForEnvironmentExtension extends AbstractAnnotationDrivenExtension<ExecuteForEnvironment> {
    @Override
    public void visitSpecAnnotation(ExecuteForEnvironment annotation, SpecInfo spec) {
        spec.setSkipped(isSkipped(annotation));
    }

    @Override
    public void visitFeatureAnnotation(ExecuteForEnvironment annotation, FeatureInfo feature) {
        feature.setSkipped(isSkipped(annotation));
    }

    private boolean isSkipped(ExecuteForEnvironment annotation) {
        return !isExecuted(annotation);
    }

    private boolean isExecuted(ExecuteForEnvironment annotation) {
        for (String enviroment : annotation.value()) {
            if (Environment.getCurrent().getName().equals(enviroment)) {
                return true;
            }
        }

        return false;
    }
}
