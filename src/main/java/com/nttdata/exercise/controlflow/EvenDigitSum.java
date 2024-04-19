package com.nttdata.exercise.controlflow;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2000));
        System.out.println(2/10);
    }

    public  static int getEvenDigitSum(int num){
        int sumEvenDigit = 0;
        int remainder =1;
        if(num< 0){
            return -1;
        } else if (num==0) {
            return 0;
        }
        while (num > 0){
            remainder = num % 10;
            num = num /10;
            if(remainder % 2 ==0){
                sumEvenDigit +=remainder;
            }
        }
        return sumEvenDigit;
    }

    public static void printFactors(int number){
        int a=2;
        if(number < 1){
            System.out.println("Invalid Value");
        }
        String result = "";
        do {
                
        }while (a==1);
    }
}
