/*

*este es el mayor cambio que hare a la humanidad
 * Program.java        20.10.2020
 *Daifer es el rey del copyright tu sabe ma nigga
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

<<<<<<< HEAD

	/**
		*Aqui esta el codigo para poner una coma en lugar de un punto.
	 * Calculates the perimeter of a circle
	 * 
	 * @param radius is a double numbers
	 * @return a double: the perimeter of a circle
	 */
	public static double perimeter(double radius) {
=======
        /**
	*Modifica el programa perquè el perímetre també es mostri amb dos decimals i el indicador de
metres al final del nombre.
         * Calculates the perimeter of a circle
         *
         * @param radius is a double numbers
         * @return a double: the perimeter of a circle
         */
        public static double perimeter(double radius) {
>>>>>>> java-radius

                return (2 * Math.PI) * radius;
        }

        /**
         * TUI = Terminal User Interface
         *
         * @param args not used.
         */

                System.out.println("\nThe area is: ");System.out.println("profe ponme un 10 ");System.out.println("te compro un bugatti en monopoli");


              

}
