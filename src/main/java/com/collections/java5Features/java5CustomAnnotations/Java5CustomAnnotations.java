package com.collections.java5Features.java5CustomAnnotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Java Custom annotations or Java User-defined annotations are easy to create and use.
 * The @interface element is used to declare an annotation. For example:

@interface MyAnnotation{}
Here, MyAnnotation is the custom annotation name.

        There are few points that should be remembered by the programmer:

        -Method should not have any throws clauses
        -Method should return one of the following: primitive data types, String, Class, enum or array of these data types.
        -Method should not have any parameter.
        -We should attach @ just before interface keyword to define annotation.
        -It may assign a default value to the method.

        There are three types of annotations:

        Marker Annotation
        Single-Value Annotation
        Multi-Value Annotation


 **/


//        1) Marker Annotation
//        An annotation that has no method, is called marker annotation. For example:

@interface MyAnnotation{}

/*2) Single-Value Annotation
        An annotation that has one method, is called single-value annotation. For example:*/

@interface MyAnnotation2{
    int value();
}

//    We can provide the default value also. For example:

@interface MyAnnotation3{
    int value() default 0;
}

//    How to apply Single-Value Annotation
//        Let's see the code to apply the single value annotation.

@MyAnnotation3(value=10)
//The value can be anything.



//3) Multi-Value Annotation
//        An annotation that has more than one method, is called Multi-Value annotation. For example:

@interface MyAnnotation4{
    int value1();
    String value2();
    String value3();
}

//        We can provide the default value also. For example:

@interface MyAnnotation5{
    int value1() default 1;
    String value2() default "";
    String value3() default "xyz";
}
//    How to apply Multi-Value Annotation
//        Let's see the code to apply the multi-value annotation.

@MyAnnotation5(value1=10,value2="Arun Kumar",value3="Ghaziabad")
/**
Built-in Annotations used in custom annotations in java
@Target
@Retention
@Inherited
@Documented
@Target
@Target tag is used to specify at which type, the annotation is used.
 **/

//        The java.lang.annotation.ElementType enum declares many constants to specify the type of element where annotation is to be applied such as TYPE, METHOD, FIELD etc.
//Example to specify annoation for a class

@Target(ElementType.TYPE)

@interface MyAnnotation6{
    int value1();
    String value2();
}
//    Example to specify annotation for a class, methods or fields

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})

@interface MyAnnotation7{
    int value1();
    String value2();
}

/**
   @Retention annotation is used to specify to what level annotation will be available.
**/


//        Example to specify the RetentionPolicy
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

@interface MyAnnotation8{
    int value1();
    String value2();
}

public class Java5CustomAnnotations {

    public static void main(String[] args) throws Exception {

//        test 1
    AnnotationCreator annotationCreator = new AnnotationCreator();
    annotationCreator.createAnnotation();


    }
}
