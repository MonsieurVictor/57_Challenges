package com.collections.java9Features;

public class Java9Features {
   /* Changes to Stream:

    ofNullable, iterate, takeWhile, dropWhile
    primitive specializations got the last three
    I wrote a post about Java 9 improvements to the stream API, where you can see them in action.

    Other stream related changes:

    Matcher (for regex) got a method results that returns a Stream<MatchResult>
    Scanner (for regex) got three new methods returning streams:
    Stream<String> tokens()
    Stream<MatchResult> findAll(Pattern pattern)
    Stream<MatchResult> findAll(String patString)
    Collection Factories
    on List: List<E> of(E e) with overloads for zero to ten elements and varargs
    on Set: Set<E> of(E e) with overloads for zero to ten elements and varargs
    on Map:
    Map<K, V> of(K k1, V v1) with overloads for zero to ten key-value alternations
    Map<K, V> ofEntries(Entry<K, V>... entries) for variable number of map entries
    Entry<K, V> entry(K k, V v) to quickly create a map entry
    Here's a good article explaining collection factory methods.

    Arrays
    The Arrays class got a ton of new methods. Most of them are primitive specializations of the following, generic methods.

    Equality checks
    The Comparator is only used to determine equality, which is assumed if cmp.compare(e1, e2) == 0.

    boolean equals(T[] a, T[] a2, Comparator<? super T> cmp)
    boolean equals(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex, Comparator<? super T> cmp)
    boolean equals(Object[] a, int aFromIndex, int aToIndex, Object[] b, int bFromIndex, int bToIndex)
    Finding first mismatch
    The Comparator is only used to determine equality, which is assumed if cmp.compare(e1, e2) == 0.

    int mismatch(Object[] a, Object[] b)
    int mismatch(Object[] a, int aFromIndex, int aToIndex, Object[] b, int bFromIndex, int bToIndex)
    int mismatch(T[] a, T[] b, Comparator<? super T> cmp)
    int mismatch(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex, Comparator<? super T> cmp)
    Comparing
    int compare(T[] a, T[] b) (for comparable T)
    int compare(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex) (for comparable T)
    int compare(T[] a, T[] b, Comparator<? super T> cmp)
    int compare(T[] a, int aFromIndex, int aToIndex, T[] b, int bFromIndex, int bToIndex, Comparator<? super T> cmp)
    Optional
    ifPresentOrElse, stream (yay!), or
    primitive specializations got the last three
    I wrote a post about Java 9 improvements to the Optional API, where you can see them in action.

            Misc
    Enumeration got a default method Iterator<E> asIterator()
    Objects got a number of new checks like T requireNonNullElse(T obj, T defaultObj)*/
}
