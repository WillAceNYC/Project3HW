package org.example.projecthw;

public class Hw1 {

    public static void main(String[] args) {



        int[] temperatures = {70, 55, 60, 42, 88, 90, 20};


        int highestTemperature = temperatures[0];
        int lowestTemperature = temperatures[0];


        for (int temperature : temperatures) {

            if (temperature > highestTemperature) {
                highestTemperature = temperature;
            }

            if (temperature < lowestTemperature) {
                lowestTemperature = temperature;
            }
        }


        System.out.println("The highest temperature for the week is: " + highestTemperature + " degrees");
        System.out.println("The lowest temperature for the week is: " + lowestTemperature + " degrees");


    }
}
