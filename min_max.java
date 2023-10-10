package desicion_structure2;

import java.util.Scanner;

public class min_max {

	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		System.out.println("Enter first number");

		double numb1 = numb.nextDouble();

		System.out.println("Enter second number");

		double numb2 = numb.nextDouble();

		if (numb1 > numb2) {

			System.out.printf("The larger number is %.2f \nThe smallest is %.2f", numb1, numb2);

		} else if (numb1 == numb2) {

			System.out.printf("The two numbers are equal");

		} else {

			System.out.printf("The larger number is %.2f \nThe smallest is %.2f", numb2, numb1);

		}
		numb.close();
	}

}
