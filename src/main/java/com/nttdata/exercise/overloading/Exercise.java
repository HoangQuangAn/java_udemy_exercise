package com.nttdata.exercise.overloading;

public class Exercise {
    public static void main(String[] args) {
        printEqual(-1, -1, -1);
    }

    public static void printEqual1(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        }else if(a==b && b==c){
            System.out.println("All numbers are equal");
        }else if(a!=b && b!=c && a!=c){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber >= 0 && secondNumber >= 0 && thirdNumber >= 0){
            if (firstNumber == secondNumber && secondNumber == thirdNumber){
                System.out.println("All numbers are equal");
            } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber) {
                System.out.println("All numbers are different");
            }else {
                System.out.println("Neither all are equal or different");
            }
        }else{
            System.out.println("Invalid Value");
        }
    }
}
