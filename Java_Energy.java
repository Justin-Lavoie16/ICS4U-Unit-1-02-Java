/*
* This program calculates the energy an object can release
*
* @author  Justin Lavoie
* @version 1.0
* @since   2024-09-23
*/

import java.util.Scanner;

final class FindEnergy {

    /**
     * Constants.
     */
    public static final int LIGHTSPEED = 299792458;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException
    * if this is ever called.
    *
    * @throws IllegalStateException if this is ever called
    */
    private FindEnergy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    public static void main(String[] args) {
        try {
            final Scanner input = new Scanner(System.in);
            System.out.print("Enter the mass of an object in kilograms: ");
            final double mass = input.nextDouble();
            final double energy = mass * Math.pow(LIGHTSPEED, 2);
            System.out.println(mass + "kg of mass would produce "
                            + String.format("%.6e", energy) + "J of energy.");
            input.close();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input");
        }

        // Shows program is done
        System.out.println("\nDone.");
    }
}
