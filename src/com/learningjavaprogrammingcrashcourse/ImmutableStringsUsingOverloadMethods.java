package com.learningjavaprogrammingcrashcourse;

public class ImmutableStringsUsingOverloadMethods {

    public static void main(String[] args) {
        StringBuilder first = new StringBuilder("This is a String");
        int a =12, b = 34, c = 56;
        first.append(' ');
        first.append(a);
        first.append(' ');
        first.append(3.45);
        first.append(' ');
        first.append(a == 12);
        first.append(' ');
        first.append(b > c);
        first.append(' ');
        first.append("Java is great", 8,  13);

        System.out.println(first);

    }
}
