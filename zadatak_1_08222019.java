package domaci_08222019;

import java.util.Scanner;

public class zadatak_1_08222019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		System.out.println("Unesi broj a:");
		a=sc.nextDouble();
		System.out.println("Unesi broj b:");
		b=sc.nextDouble();
		System.out.println("Unesi broj c:");
		c=sc.nextDouble();
		System.out.println("Proizvod brojeva je:" +brojevi(a, b, c));
		System.out.println("Najmanji uneti broj je:" +noviBrojevi(a, b, c));

	}
	public static double brojevi(double a, double b, double c) {
		double d=a*b*c;
		return d;
	}
	public static double noviBrojevi(double a, double b, double c) {
		double najmanji;
		if (a<=b && a<=c) {
			najmanji=a;
		} else if (b<=c && b<=a) {
			najmanji=b;
		} else {
			najmanji=c;
			
		}
		return najmanji;
		}

}
