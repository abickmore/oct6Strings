package main.java;



public class Exercises {
    public static String lengthValid(String str) {

        //Exercise 1: write a method to check the number of chars , it returns “Error message ” if it exceeds 500 !!

        return str.length() > 500 ? "Error, must be under 500 characters" : "Yay";

    }

    //Exercise 2: write a method to replace a specified char with another one only one char should be replaced

    /**
     *
     * @param str
     * @param oldLetter
     * @param newLetter
     * @return
     */
    public static String exercise2 (String str, char oldLetter, char newLetter){
        System.out.println(exercise2());

    StringBuilder newSentence = new StringBuilder(str);
    int startIndex = str.indexOf(oldLetter);
    newSentence.replace(startIndex,startIndex+1, String.valueOf(newLetter));
    return newSentence.toString();

    }



}
