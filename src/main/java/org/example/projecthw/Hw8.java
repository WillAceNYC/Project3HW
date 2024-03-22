package org.example.projecthw;

public class Hw8 {

    public static void main(String[] args) {

        int[] array = {5, 8, 2, 1, 9, 4};

        int max = array[0];
        int min = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }


        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);

    }
}
