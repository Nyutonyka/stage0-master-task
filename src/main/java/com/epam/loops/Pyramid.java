package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j > 1; j--) {
                if (i == j || i > j) {
                    System.out.print(j);
                    continue;
                }
                System.out.print(" ");
            }
            for (int j = 1; j <= cathetusLength; j++) {
                if (i == j || i > j) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
