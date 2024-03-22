package org.example.projecthw;

public class Hw9 {

    public static void main(String[] args) {

        int[] array = {5, 8, 2, 1, 9, 4};

        int max = array[0];
        int secondMax = array[0];

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second largest number: " + secondMax);

    }
}
