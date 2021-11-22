package com.bribgelabz.AlgorithmProgrames;

public class PrimeNuminRange {

    /**
     * Take a range and print prime numbers from that range.
     */

    public static void main(String[] args) {
        int num = 0;
        while (num <= 1000){
            int i = 2;
            int count = 0;
            while(i<=num/2){
                if(num%i == 0) {
                    count++;
                    break;
                }
                i++;
            }
            if(count == 0 && num!=0 && num!=1){
                System.out.print(num +" ");
            }
            num++;
        }
    }
}