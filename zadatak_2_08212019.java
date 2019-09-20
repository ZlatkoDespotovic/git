package domaci_08212019;

import java.util.Scanner;

public class zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n=sc.nextInt();
		int[]niz=new int[n];
		for (int i=0; i<niz.length; i++) {
			System.out.println("Unesi element niza" +i);
			niz[i]=sc.nextInt();
			}
		System.out.println("Uspesno ste uneli niz");
		System.out.println("Inverzni niz u odnosu na uneti niz je:");
		for (int i=n-1; i>=0; i--) {
			System.out.print(" " +niz[i]);
		}
	}

}
