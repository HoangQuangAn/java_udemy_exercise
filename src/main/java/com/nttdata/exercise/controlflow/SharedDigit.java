package com.nttdata.exercise.controlflow;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (9, 99, 999));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        } else {
            return (number1 % 10 == number2 % 10 || number1 % 10 == number2 / 10 || number1 / 10 == number2 % 10 || number1 / 10 == number2 / 10);
        }

    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(a%10==b%10 && b%10==c%10){
            return false;
        }if(a<10 || b<10 ||c<10 || a>1000 ||c>1000 || b>1000){
            return false;
        }
        return (a%10==b%10) || (c%10==b%10) || (a%10==c%10);
    }
}
