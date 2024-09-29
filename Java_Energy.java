/*
 * This program calculates the energy an object can release
 *
 * @author  Justin Lavoie
 * @version 1.0
 * @since   2024-09-23
 */

import java.util.Scanner;
import java.util.InputMismatchException;

final class FindEnergy {

    /**
     * Speed of light in meters per second (m/s).
     * This constant is used in the energy calculation.
     */
    public static final int LIGHTSPEED = 299792458;

    /**
     * Private constructor to prevent instantiation of the class.
     * Throws an IllegalStateException if an attempt is made to instantiate.
     *
     * @throws IllegalStateException if this is ever called.
     */
    private FindEnergy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Main method to execute the energy calculation.
     * Takes mass input from the user, calculates energy using E=mc^2,
     * and prints the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {
        try {
            // Create a Scanner object to take user input.
            final Scanner input = new Scanner(System.in);

            // Prompt the user to enter the mass of an object in kilograms.
            System.out.print("Enter the mass of an object in kilograms: ");
            final double mass = input.nextDouble();

            // Calculate the energy using the formula E = mc^2.
            final double energy = mass * Math.pow(LIGHTSPEED, 2);

            // Print the calculated energy in Joules.
            System.out.println(mass + " kg of mass would produce "
                    + String.format("%.6e", energy) + " J of energy.");

            // Close the scanner object.
            input.close();
        } catch (InputMismatchException ex) {
            // Handle invalid input from the user.
            System.out.println("Invalid input. Please enter a valid number.");
        }

        // Indicate that the program has finished executing.
        System.out.println("\nDone.");
    }
}
