package com.nttdata.exercise.expression;

public class EqualSumCheck {
    public static boolean hasTeen(int num1, int num2, int num3){
        return (isTeen(num1) || isTeen(num2) || isTeen(num3)) ;
    }

    public static boolean isTeen(int x){
        return x>=13 && x<=19;
    }
}
