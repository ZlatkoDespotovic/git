package domaci_08212019;

import java.util.Scanner;

public class zadatak_3_08212019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		System.out.println("Unesi n za duzinu niza:");
		int n=sc.nextInt();
		int[]niz=new int[n];
		for (int i=0; i<niz.length; i++) {
			System.out.println("Unesi element niza" +i);
			niz[i]=sc.nextInt();
        }
		System.out.println("Uspesno unet niz");
		boolean rastuci=true;
		for (int i=0; i<n-1; i++) {
			if (niz[i]>=niz[i+1]) {
				rastuci=false;
				break;
			}
		}

		if (rastuci==true) {
			System.out.println("Niz je rastuci");
		} else
			System.out.println("Niz nije rastuci");
	}
}
