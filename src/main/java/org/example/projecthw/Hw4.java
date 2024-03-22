package org.example.projecthw;

public class Hw4 {

    public static void main(String[] args) {

        int[][] num = {{10, 21, 32, 43},
                {54, 65, 76, 87},
                {98, 109, 110, 121}
        };

        int even = 0;
        int odd = 0;

        for (int[] i : num) {
            for (int number : i) {
                if (number % 2 == 0) {
                    even += number;
                } else {
                    odd += number;
                }

            }

        }
        System.out.println(even);
        System.out.println(odd);

    }
}
