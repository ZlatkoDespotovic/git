package domaci_09092019;

import java.util.Scanner;

public class zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a, b, p, o, r;
		System.out.println("Uneti rec kvadrat, krug ili pravugaonik:");
		String c;
		c=sc.nextLine();
		switch (c) {
		case "kvadrat":
		System.out.println("Stranica kvadrata je:");
		a=sc.nextDouble();
		p = a * a;
		System.out.println("Povrsina kvadrata je:" +p);
		break;
		case "krug":
		System.out.println("Poluprecnik kruga je:");
		r=sc.nextDouble();
		p = r * r * 3.14;
		System.out.println("Povrsina kruga je:" +p);
		break;
		case "pravougaonik":
		System.out.println("Unesi stranicu a:");
		a=sc.nextDouble();
		System.out.println("Unesi stranicu b:");
		b=sc.nextDouble();
		p = a * b;
		System.out.println("Povrsina pravougaonika je:" +p);
		break;
		default:
			System.out.println("Pogresan unos");
		
		}
		
	}

}
