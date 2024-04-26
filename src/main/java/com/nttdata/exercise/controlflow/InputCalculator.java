package com.nttdata.exercise.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

    }
    public static void  inputThenPrintSumAndAverage(){
        int sum = 0;
        long average = 0;
        int count = 1;
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                sum = sum + number;
                average = Math.round( (double)(sum / count));
                count++;
            } catch(InputMismatchException e) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}
