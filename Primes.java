package com.company;

public class Primes {
    public static void main(String[] args) {

        //Array to hold 1000 primes
        int[] primeNumbers = {};

        //Number to be checked for Prime-ness
        int number = 1;

        //Prime count and array position
        int primeCount = 0;

        //Declare new primeNumbers array
        primeNumbers = new int[1000];

        //Increases Prime Count and number if isPrime is true
        do {
            if (isPrime(number)){
                primeNumbers[primeCount] = number;
                primeCount++;
                number++;
            }

        //Increase only number if isPrime is false
            else {
                number++;
            }
        }while(primeCount <= 999);

        //Displays 1000th prime number
        System.out.println(primeNumbers[999]);

    }

    public static boolean isPrime(int n){
        //Check if n is 2 or a multiple of 2
        if ( n%2 == 0 ) return false;
        //If not even, Check odds for Prime
        for ( int i = 3 ; i * i <= n ; i += 2){
            if ( n%i == 0)
                return false;
        }
        return true;
    }
}
