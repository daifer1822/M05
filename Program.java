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
package gitTerminal02;

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
		*Aqui esta el codigo para poner una coma en lugar de un punto.
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
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the radius in radiua: ");
		double radi = in.nextDouble();

		in.close();

		System.out.println("\nThe area is: " + area(radi));

		System.out.println("\nThe perimeter is: " + perimeter(radi));

	}
}
