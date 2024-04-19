package com.nttdata.exercise.controlflow;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1234));
    }

    public static int sumFirstAndLastDigit(int num){
        if(num< 0){
            return -1;
        } else if (num==0) {
            return 0;
        }
        int lastDigit = num %10;
        String number = Integer.toString(num).trim();
        int firstDigit = Integer.valueOf(number.substring(0,1));
        return  lastDigit + firstDigit;
    }
}
