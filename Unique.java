package com.company;

public class Unique {

    public static void main(String[] args) {

        String[] strings = new String[5];
        strings[0] = "New";
        strings[1] = "Neww";
        strings[2] = "Newww";
        strings[3] = "www";
        strings[4] = "Neww";

        System.out.println(IsUnique(strings));

    }

    public static boolean IsUnique( String[] a ){

        for ( int i = 0; i < a.length; i++ ){
            for ( int b = i + 1; b < a.length; b++){
                if ( a[i] == a[b]){
                    return false;
                }
            }
        }
        return true;
    }

}
