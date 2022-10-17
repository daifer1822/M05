/*
 * Program.java        20.10.2020
 *
 * Program to calculate the area and the perimeter
 * of a circle knowing the radius in meter.
 *
 * Copyright 2020 Daifer Ramirez <dramirez20@ilg.cat>
 *Primer cambio
*segundo cambio
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.Scanner;

public class Program {
	 /**
         * Calculates the area of a circle
         *
         * @param radius is a double numbers
         * @return a double: the area of a circle
         */
        public static double area(double radius) {

                return Math.PI * Math.pow(radius, 2);
        }

        /**
         * Calculates the perimeter of a circle
         *
         * @param radius is a double numbers
         * @return a double: the perimeter of a circle
         */
        public static double perimeter(double radius) {

                return (2 * Math.PI) * radius;
        }

        /**
         * TUI = Terminal User Interface
         *
         * @param args not used.
         */

                System.out.println("\nThe area is: ");System.out.println("profe ponme un 10 ");System.out.println("te compro un bugatti en monopoli");


              

}
