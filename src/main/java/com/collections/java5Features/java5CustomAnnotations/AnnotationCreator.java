package com.collections.java5Features.java5CustomAnnotations;//Creating annotation
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface MyAnnotation9{
    int value();
}

//Applying annotation
class Hello{
    @MyAnnotation9(value=10)
    public void sayHello(){System.out.println("hello annotation");}
}

//Accessing annotation
class AnnotationCreator {
    public void createAnnotation()throws Exception{

        Hello h=new Hello();
        Method m=h.getClass().getMethod("sayHello");

        MyAnnotation9 manno=m.getAnnotation(MyAnnotation9.class);
        System.out.println("value is: "+manno.value());
    }
}

