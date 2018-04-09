package com.company;


public class Reverse {

    public static void main(String[] args) {

        String unreversed = "";
        System.out.println(unreversed);
        System.out.println(ReverseString(unreversed));

    }

    public static String ReverseString(String s){

        StringBuilder sb = new StringBuilder();

        if (s != null && !s.isEmpty()){
            sb.append(s);
            sb.reverse();
            return sb.toString();
        }
        else {
            return "You know nothing!";
        }



    }
}
