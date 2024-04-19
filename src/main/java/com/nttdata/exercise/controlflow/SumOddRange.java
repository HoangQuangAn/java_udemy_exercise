package com.nttdata.exercise.controlflow;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(-1, 100));
    }

    public static boolean isOdd(int num){
        if(num > 0 && (num %2==1)){
            return true;
        }
        return false;
    }

    public static int sumOdd(int num1, int num2){
        if(num1 < 0 || num2 <0 || num1 > num2){
            return -1;
        }
        int sumOfOdd= 0 ;
        for (int i=num1;i<=num2; i++ ){
            if(isOdd(i)){
                sumOfOdd +=i;
            }
        }
        return sumOfOdd;
    }
}
