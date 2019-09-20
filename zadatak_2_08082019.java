package sintaksa_08082019;

import java.util.Scanner;

public class zadatak_2_08082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double p, o, a, b;		
    System.out.println("Ucitaj stranicu a:");
    a = sc.nextDouble();
    System.out.println("Ucitaj stranicu b:");
    b = sc.nextDouble();
    o=2*(a+b);
    p=a*b;		
    System.out.println("Obim je:"+o);
    System.out.println("Povrsina je:"+p);
	}

}
