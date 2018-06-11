package com.collections.java9Features;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

    public class Java9Features {
        static class Resource{
            private Resource(String str){


            }
        }


        private interface Card {

            //    Private methods in Interfaces
            // In Java 8, we can provide method implementation in Interfaces using Default and Static methods.
            // However we cannot create private methods in Interfaces.
            // To avoid redundant code and more re-usability, Oracle Corp is going to introduce private methods in Java SE 9 Interfaces.
            // From Java SE 9 on-wards, we can write private and private static methods too in an interface using ‘private’ keyword.
            // These private methods are like other class private methods only, there is no difference between them.

            private Long createCardID() {
            // Method implementation goes here.
                return null;
            }

            private static void displayCardDetails() {
            // Method implementation goes here.
            }
        }

        public static void main(String[] args) throws IOException, InterruptedException {
            Java9Features java9Features = new Java9Features();
            //shows package name;
            java9Features.showPackageName();


//            Language and syntax improvements
//            Now it will be easier to write the try with resources statement. Previously all the resources that that have to be closed after the execution had to be initialized in the try clause as in this example:


    /*        try(Resource res = new Resource("res")){
                //Code using res object
            }*/
//            From Java 9 we can use final and effectively final resources in the try clause just like that:

/*            Resource res1 = new Resource("res1");
            final Resource res2 = new Resource("res2");
            try(res1;res2){
                //Code using resource objects
            }*/


            // The Streams API is arguably one of the best improvements to the Java standard library in a long time.
            // It allows you to create declarative pipelines of transformations on collections. With Java 9, this only gets better.
            // There are four new methods added to the Stream interface: dropWhile, takeWhile, ofNullable.
            // The iterate method gets a new overload, allowing you to provide a Predicate on when to stop iterating:
            // The second argument is a lambda that returns true until the current element in the IntStream becomes 100.
            // This simple example therefore prints the integers 1 until 99 on the console.

            IntStream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);

            // Besides these additions on Stream itself, the integration between Optional and Stream has been improved.
            // It's now possible to turn an Optional object into a (possibly empty) Stream with the new `stream` method on Optional:
            // Turning an Optional into a Stream is especially useful when composing complex Stream pipelines.

            Stream<Integer> s = Optional.of(1).stream();

     /*       // A new way of performing HTTP calls arrives with Java 9.
            // This much overdue replacement for the old `HttpURLConnection` API also supports WebSockets and HTTP/2 out of the box.
            // One caveat: The new HttpClient API is delivered as a so-called _incubator module_ in Java 9.
            // This means the API isn't guaranteed to be 100% final yet.
            // Still, with the arrival of Java 9 you can already start using this API:


            HttpClient client = HttpClient.newHttpClient();

            HttpRequest req =
                    HttpRequest.newBuilder(URI.create("http://www.google.com"))
                            .header("User-Agent","Java")
                            .GET()
                            .build();


            HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandler.asString());*/

            //    Empty List Example

            List immutableList = List.of();
            //    Non-Empty List Example

            List immutableList2 = List.of("one", "two", "three");
            System.out.println("List immutableList2 = List.of(\"one\", \"two\", \"three\"): " + immutableList2);

            //    Stream API Improvements
            //    In Java SE 9, Oracle Corp has added four useful new methods to java.util.Stream interface. As Stream is an interface, all those new implemented methods are default methods. Two of them are very important: dropWhile and takeWhile methods
            //    If you are familiar with Scala Language or any Functions programming language, you will definitely know about these methods. These are very useful methods in writing some functional style code. Let us discuss about takeWhile utility method here.
            //    This takeWhile() takes a predicate as an argument and returns a Stream of subset of the given Stream values until that Predicate returns false for the first time. If first value does NOT satisfy that Predicate, it just returns an empty Stream.

            Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).takeWhile(i -> i < 5)
                    .forEach(System.out::println);
            }



            //    Try With Resources Improvement
            //    We know, Java SE 7 has introduced a new exception handling construct: Try-With-Resources to manage resources automatically.
            //    The main goal of this new statement is “Automatic Better Resource Management”.
            //    Java SE 9 is going to provide some improvements to this statement to avoid some more verbosity and improve some Readability.
            //
            //    Java SE 7 example

        void testARM_Before_Java9() throws IOException {
            BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));
            try (BufferedReader reader2 = reader1) {
                System.out.println(reader2.readLine());
            }
        }
//    Java 9 example

        void testARM_Java9() throws IOException {
            BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));

            try (reader1) {
                System.out.println(reader1.readLine());
            }
        }
        void showPackageName(){
            System.out.println("Package name is" + this.getClass().getPackageName());
        }
    }


