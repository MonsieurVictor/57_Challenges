package com.collections.java8Optional;
import java.util.Optional;

public class Java8Optional {

    public static void main(String[] args) {

//        To avoid the abnormal termination, we use Optional class. In the following example, we are using Optional. So, our program can execute without crashing.
//        Java Optional Example: If Value is not Present
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){  // It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("String value is not present");


//        Java Optional Example: If Value is Present
        String[] str2 = new String[10];
        Optional<String> checkNull2 = Optional.ofNullable(str2[5]);
        if(checkNull2.isPresent()){  // check for value is present or not
            String lowercaseString = str2[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("string value is not present");

        String[] str3 = new String[10];
        str3[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str3[5]);
        // If value is present, it returns an Optional otherwise returns an empty Optional
        System.out.println("Filtered value: "+value.filter((s)->s.equals("Abc")));
        System.out.println("Filtered value: "+value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException
        System.out.println("Getting value: "+value.get());
        // It returns hashCode of the value
        System.out.println("Getting hashCode: "+value.hashCode());
        // It returns true if value is present, otherwise false
        System.out.println("Is value present: "+value.isPresent());
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional
        System.out.println("Nullable Optional: "+Optional.ofNullable(str3[5]));
        // It returns value if available, otherwise returns specified value,
        System.out.println("orElse: "+value.orElse("Value is not present"));
        System.out.println("orElse: "+empty.orElse("Value is not present"));
        value.ifPresent(System.out::println);   // printing value by using method reference
    }
}
