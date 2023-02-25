package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int count;
        if((year%4 == 0 && year% 100 != 0)|| year%400 == 0){
            count = 1;
        }else{
            count = 0;
        }

        switch (month){
            case 1,3,5,7,9,11 -> System.out.println(31);
            case 2 -> System.out.println(28 + count);
            case 4,6,8,10,12 -> System.out.println(30);
            default -> System.out.println("invalid date");
        }
    }
}
