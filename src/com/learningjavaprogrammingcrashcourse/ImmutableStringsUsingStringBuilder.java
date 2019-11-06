package com.learningjavaprogrammingcrashcourse;

public class ImmutableStringsUsingStringBuilder {

    public static void main(String[] args) {

//Begin Append, Delete and Method Chaining
        StringBuilder first = new StringBuilder("This is a String");
        StringBuilder second = new StringBuilder("This is a String");

        System.out.printf("firstString  : %s %n", first);

        System.out.println("clearing first");
        if (first.delete(0, first.length()) == first){
            System.out.println("the references to first are the same");
        };


//        System.out.println("clearing first");
//        first.delete(0, first.length());
//        System.out.printf("first  : *%s* %n", first);

        first.append("Another String");
        System.out.printf("first  : *%s* %n", first);

        System.out.println("clearing first again");
        System.out.printf("first  : *%s* %n", first.delete(0, first.length())
                .append("this is another string using Method Chaining")
                .append(" ").append(second));


//        System.out.printf("secondString : %s %n", secondString);
//        System.out.printf("firstString is the same as secondString: %s %n", firstString == secondString);
//        System.out.printf("firstString is the same as secondString: %s %n", firstString.equals(secondString));
//End Append, Delete and Method Chaining


////Begin Equality with Reference Type
//        StringBuilder first = new StringBuilder("This is a String");
//        StringBuilder second = new StringBuilder("This is a String");
//
//        String firstString  = first.toString();
//        String secondString = second.toString();
//
//        System.out.printf("firstString  : %s %n", firstString);
//        System.out.printf("secondString : %s %n", secondString);
//        System.out.printf("firstString is the same as secondString: %s %n", firstString == secondString);
//        System.out.printf("firstString is the same as secondString: %s %n", firstString.equals(secondString));
////End Equality with Reference Type

////Begin First examples
//        StringBuilder first = new StringBuilder("This is a String");
//        StringBuilder second = first;
//
//        System.out.printf("first  : %s %n", first);
//        System.out.printf("second : %s %n", second);
//        System.out.printf("first is the same as second: %s %n", first == second);
//
//        System.out.println();
//
//        first = first.replace(4, 5,"_");
////        first = first.replace("_", " ");
//        System.out.printf("first  : %s %n", first);
//        System.out.printf("second : %s %n", second);
//        System.out.printf("first is the same as second: %s %n", first == second);
//        System.out.printf("first is the same as second: %s %n", first.equals(second));
////End First examples
    }
}
