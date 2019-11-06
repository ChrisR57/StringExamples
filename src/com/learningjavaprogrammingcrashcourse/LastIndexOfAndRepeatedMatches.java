package com.learningjavaprogrammingcrashcourse;

public class LastIndexOfAndRepeatedMatches {

    public static void main(String[] args) {
        //                             1         2         3
        //                   0123456789012345678901234567890123456
        String courseName = "Learn Java for Beginners Crash Course";

        int position = -1;

        do {
            position = indexOfIgnoreCase(courseName, " c", position + 1);
            System.out.println(position);
        } while (position != -1);
    }

    private static int indexOfIgnoreCase(String text, String searchText, int fromIndex) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase, fromIndex);
    }
}

