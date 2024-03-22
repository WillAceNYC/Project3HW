package org.example.projecthw;

public class Hw10 {

    public static void main(String[] args) {

        String[] array = {"nba", "wnba", "nfl", "nba", "nfl", "nba", "wnba"};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[j]);
                    break;
                }
            }
        }

    }
}
