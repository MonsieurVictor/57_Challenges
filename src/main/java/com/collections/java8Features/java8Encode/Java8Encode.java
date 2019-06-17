package com.collections.java8Features.java8Encode;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ForkJoinPool;

public class Java8Encode {
        public static void main(String[] args) {

            // Getting encoder
            Base64.Encoder encoder = Base64.getEncoder();
            // Creating byte array

            byte byteArr[] = {1,2};
            // encoding byte array
            byte byteArr2[] = encoder.encode(byteArr);

            System.out.println("Encoded byte array: "+byteArr2);

            byte byteArr3[] = new byte[5];                // Make sure it has enough size to store copied bytes

            int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written
            System.out.println("Encoded byte array written to another array: "+byteArr3);
            System.out.println("Number of bytes written: "+x);

            Base64.Decoder decoder = Base64.getDecoder();
            byte decodedArr[]= decoder.decode(byteArr2);
            System.out.println("Decoded byte array: " + Arrays.toString(decodedArr));

            // Encoding string
            String str = encoder.encodeToString("JavaTpoint".getBytes());

            System.out.println("Encoded string: "+str);
            // Getting decoder


            // Decoding string
            String dStr = new String(decoder.decode(str));
            System.out.println("Decoded string: "+dStr);

           /**
            *  Java Base64 Example: URL Encoding and Decoding
            **/

            // Getting encoder
            Base64.Encoder encoder2 = Base64.getUrlEncoder();
            // Encoding URL
            String eStr = encoder2.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
            System.out.println("Encoded URL: "+eStr);
            // Getting decoder
            Base64.Decoder decoder2 = Base64.getUrlDecoder();
            // Decoding URl
            String dStr3 = new String(decoder2.decode(eStr));
            System.out.println("Decoded URL: "+dStr3);

            System.out.println("Threads available: " + ForkJoinPool.commonPool().getParallelism());



           /**
            *
            * Java Base64 Example: MIME Encoding and Decoding
            **/
            // Getting MIME encoder
            Base64.Encoder encoder3 = Base64.getMimeEncoder();
            String message = "Hello, You are informed regarding your inconsistency of work";
            String eStr3 = encoder3.encodeToString(message.getBytes());
            System.out.println("Encoded MIME message: "+eStr3);

            // Getting MIME decoder
            Base64.Decoder decoder3 = Base64.getMimeDecoder();
            // Decoding MIME encoded message
            String dStr4 = new String(decoder3.decode(eStr3));
            System.out.println("Decoded message: "+dStr4);
        }
}
