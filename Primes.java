package com.company;

public class Primes {
    public static void main(String[] args) {

        int[] primeNumbers = {};
        int number = 1;
        int primeCount = 0;

        primeNumbers = new int[1000];

        do {
            if (isPrime(number)){
                primeNumbers[primeCount] = number;
                primeCount++;
                number++;
            }
            else {
                number++;
            }
        }while(primeCount <= 999);
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
