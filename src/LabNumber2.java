import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String cont;


		System.out.println("Please enter the length of your classroom in feet: ");
		length = scnr.nextDouble();
		System.out.println("Please enter the width of your classroom in feet: ");
		width = scnr.nextDouble();
		System.out.println("Please enter the height of your classroom in feet: ");
		height = scnr.nextDouble();
		scnr.nextLine();

		System.out.println("Length entered is: " + length + " feet");
		System.out.println("Width entered is: " + width + " feet");
		System.out.println("Height entered is: " + height + " feet");

		area = length * width;
		perimeter = (2 * length) + (2 * width);
		volume = length * width * height;

		System.out.println("The area of your classroom is: " + area + " square feet");
		System.out.println("The perimeter of your classroom is: " + perimeter + " feet");
		System.out.println("The volume of your classroom is: " + volume + " cube feet");

		System.out.println("Continue? Hit Y for Yes and N for No");
		cont = scnr.nextLine();

		while (cont.length() >= 0) {
			if (cont.equals("y") || cont.equals("Y")) {
				System.out.println("Please enter the length of your classroom: ");
				double length2 = scnr.nextDouble();
				System.out.println("Please enter the width of your classroom: ");
				double width2 = scnr.nextDouble();
				System.out.println("Please enter the height of your classroom: ");
				double height2 = scnr.nextDouble();
				scnr.nextLine();

				System.out.println("Length entered is: " + length2 + " feet");
				System.out.println("Width entered is: " + width2 + " feet");
				System.out.println("Height entered is: " + height2 + " feet");

				double area2 = length2 * width2;
				double perimeter2 = (2 * length2) + (2 * width2);
				double volume2 = length2 * width2 * height2;

				System.out.println("The area of your classroom is: " + area2 + " square feet");
				System.out.println("The perimeter of your classroom is: " + perimeter2 + " feet");
				System.out.println("The volume of your classroom is: " + volume2 + " cube feet");
				System.out.println("Continue? Hit Y for Yes and N for No");
				cont = scnr.nextLine();
			} else if (cont.equals("n") || cont.equals("N")) {
				System.out.println("no problem ");
				break;
			}
			else {
				System.out.println("please enter again invalid");
				cont = scnr.next();
			}
		}


	}

}
