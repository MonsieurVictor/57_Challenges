package com.collections.java5Features.java5CustomAnnotations;

import java.lang.annotation.Inherited;
       /**
        *  How built-in annotaions are used in real scenario?
        In real scenario, java programmer only need to apply annotation.
        He/She doesn't need to create and access annotation.
        Creating and Accessing annotation is performed by the implementation provider.
        On behalf of the annotation, java compiler or JVM performs some additional operations.
        */

//By default, annotations are not inherited to subclasses. The @Inherited annotation marks the annotation to be inherited to subclasses.

@Inherited

@interface ForEveryone { }
class Superclass{}

class Subclass extends Superclass{}


public class SuperClass {
}
