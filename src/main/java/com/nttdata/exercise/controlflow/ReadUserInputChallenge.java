package com.nttdata.exercise.controlflow;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadUserInputChallenge {
    public static void main(String[] args) {
        int num=0;
        int sum= 0;
        int i=1;
        do {
            try {
                System.out.println("Number "+ i);
                Scanner sc = new Scanner(System.in);
                num=sc.nextInt();
                sum += num;
                i++;
            }catch (InputMismatchException exception){
                System.err.println("Invalid value, input again");
            }
        }while (i<=5);

        System.out.println(sum);
    }
}
