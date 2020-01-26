package com.javamultiplex.string;

public class StringReversalUsingRecursion {

    public static final String BLANK = "";

    public static void main(String[] args) {
        String string="Rohit";
        System.out.format("Reverse of %s is %s", string, reverse(string));
    }

    private static String reverse(String string) {
        if (string.length()==0){
            return BLANK;
        }else{
            int lastIndex = string.length() - 1;
            return string.charAt(lastIndex)+reverse(string.substring(0, lastIndex));
        }
    }
}
