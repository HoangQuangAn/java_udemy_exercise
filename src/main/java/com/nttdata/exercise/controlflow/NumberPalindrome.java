package com.nttdata.exercise.controlflow;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(1234567);
    }

    public static boolean isPalindrome(int number){
        if(number < 0){
            number = number * (-1);
        }
        int oldNumber = number;
        int newNumber= 0;
        int remainder=0;
        while (number > 0){
            remainder = number %10;
            number= number / 10;
            newNumber =newNumber*10+ remainder;
        }
        if(oldNumber == newNumber){
            return true;
        }
        return false;
    }
}
