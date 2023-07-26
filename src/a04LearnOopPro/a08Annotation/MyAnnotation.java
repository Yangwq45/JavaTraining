package a04LearnOopPro.a08Annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/*
@author YwQ
@version 1.0
*/

//元注解
//@target标注此注解可注解什么类型

@Target({ANNOTATION_TYPE,CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})

@Retention(RetentionPolicy.CLASS)

@Inherited
public @interface MyAnnotation {
   // String value();
    String value() default"helllo";
}
