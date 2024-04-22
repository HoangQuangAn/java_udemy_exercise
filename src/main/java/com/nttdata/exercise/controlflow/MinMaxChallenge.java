package com.nttdata.exercise.controlflow;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        double min= 0.0;
        double max= 0.0;
        int loopCount = 0;
        while (true){
            System.out.println("Enter a number, or any character to exit: ");
            Scanner sc = new Scanner(System.in);
            try {
                String nextEntry = sc.nextLine();
                double validNum = Double.parseDouble(nextEntry);
                if(loopCount == 0){
                    min =validNum;
                }
                if(validNum >max){
                    max= validNum;
                }
                if (validNum < min){
                    min = validNum;
                }
                loopCount ++;

            }catch (Exception ex){
                break;
            }
        }
        if (loopCount > 0){
            System.out.println("Min: " + min + "\nMax: " +max);
        }else {
            System.out.println("No valid data enter!!!");
        }
    }

}
