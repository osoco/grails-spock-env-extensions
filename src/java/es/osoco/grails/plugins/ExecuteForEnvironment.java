package es.osoco.grails.plugins;

import org.spockframework.runtime.extension.ExtensionAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@ExtensionAnnotation(ExecuteForEnvironmentExtension.class)
public @interface ExecuteForEnvironment {
	String[] value();
}
