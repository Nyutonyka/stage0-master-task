package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength; i > 0; i--){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int k = cathetusLength; k >= i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
