package version.info;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface VersionInfo {
    String author();
    String version() default "1.0";
    String description();
}