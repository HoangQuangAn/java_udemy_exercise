package com.nttdata.exercise.controlflow;

public class NumberOfDayInMonth {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year){
        if (year<1 || year>9999){
            return false;
        }else{
            return (year%4==0) && (year%100!=0) || year%400==0;
        }
    }

//    public static int getDaysInMonth(int month, int year){
//        if(year<1 || year>9999 || month <=1 || month >=12){
//            return -1;
//        }
//        if(isLeapYear(year) && month ==2){
//            return 29;
//        }
//        return switch(month){
//            case 1,3,5,7,8,10,12->31;
//            case 2->28;
//            case 4,6,9,11 -> 30;
//            default ->-1;
//        }
//    }
}
