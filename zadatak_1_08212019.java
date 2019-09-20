package domaci_08212019;

import java.util.Scanner;

public class zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n=sc.nextInt();
		int[] niz=new int[n];
		System.out.println("Unesi broj:");
		int br=sc.nextInt();
		for (int i=0; i<niz.length; i++) {
			System.out.println("Unesi element niza:" +i);
			niz[i]=sc.nextInt();
		}
		System.out.println("Uspesno unet niz");
		for (int i=0; i<niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.println("Brojevi deljivi sa unetim brojem" + br + "su" +niz[i]);
			}
		}

	}

}
