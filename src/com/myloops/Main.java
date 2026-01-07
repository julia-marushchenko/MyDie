/**
 *  Java program to simulate the roll of a die.
 */

package com.myloops;

import java.util.Random;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a random number generator.
        Random randomGenerator = new Random();

        // Generate a number between 1 and 6.
        int dieRoll = randomGenerator.nextInt(6) + 1;

        // Repeat while roll isn't 3.
        while (dieRoll != 3) {

            System.out.println(dieRoll);
            dieRoll = randomGenerator.nextInt(6) + 1;

        }
    }
}