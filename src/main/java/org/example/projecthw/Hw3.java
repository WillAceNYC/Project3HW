package org.example.projecthw;

public class Hw3 {

    public static void main(String[] args) {

        int[][] num = {{10, 21, 32, 43},
                {54, 65, 76, 87},
                {98, 109, 110, 121}
        };

        for (int[] i : num) {
            for (int number : i) {
                if (number % 2 == 0)
                    System.out.print(number + " ");
            }

        }

    }
}
