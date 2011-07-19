package es.osoco.grails.plugins;

import org.spockframework.runtime.extension.ExtensionAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@ExtensionAnnotation(IgnoreForEnvironmentExtension.class)
public @interface IgnoreForEnvironment {
	String[] value();
}
