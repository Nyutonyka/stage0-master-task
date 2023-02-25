package com.epam.algorithms;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = new String[4];
        seasons[0] = "winter";
        seasons[1] = "spring";
        seasons[2] = "summer";
        seasons[3] = "autumn";
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
         numbers[i] = i+1;
        }
        return numbers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            sum = number + sum;
            System.out.println(sum);
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] revers = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            revers[i] = arr[arr.length-(i+1)];
        }
        return revers;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int posit = 0;
        for (int j : arr) {
            if (j > 0) {
                posit++;
            }
        }
        int[] positive = new int[posit];
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                positive[count] = j;
                count++;
            }
        }
        return positive;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public static int[][] sortRaggedArray(int[][] arr) {

        int sort;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 1; k < (arr[i].length - j); k++) {
                    if (arr[i][k - 1] > arr[i][k]) {
                        sort = arr[i][k];
                        arr[i][k] = arr[i][k - 1];
                        arr[i][k - 1] = sort;
                    }
                }
            }
        }

        int[] sorted;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 1; k < (arr.length - i); k++) {
                if (arr[k - 1].length > arr[k].length) {
                    sorted = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = sorted;
                }
            }
        }
        for (int[] i : arr) {
            for (int k : i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        return arr;
    }
}
