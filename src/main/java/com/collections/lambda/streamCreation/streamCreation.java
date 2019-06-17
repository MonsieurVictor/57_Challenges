package com.collections.lambda.streamCreation;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamCreation {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream
        .limit(SIZE + 1)
        .collect(Collectors.toList());
        System.out.print(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.print(", ");
            if (i < SIZE) System.out.print(firstElements.get(i));
            else System.out.print("...");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        Stream<String> song =
                Stream.of("gently", "down", "the", "stream");
        show("song", song);
        Stream<String> silence = Stream.empty();
        show("silence", silence);
                    Stream<String> echos = Stream.generate(() -> "Echo");
        show("echos", echos);
        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE,
                n -> n.add(BigInteger.ONE));
        show("integers", integers);

    }
}


