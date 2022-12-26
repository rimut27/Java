package oop.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(RetentionPolicy.RUNTIME)
@Retention(ElementType.TYPE)

public class notBlank {
}
