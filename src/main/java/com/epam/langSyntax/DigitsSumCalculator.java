package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum= 0;
        while (number !=0){
            int s = number%10;
            sum = sum + s;
            number/=10;
        }
        System.out.println(sum);
    }
}
