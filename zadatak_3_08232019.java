package domaci_08232019;

import java.util.Scanner;

public class zadatak_3_08232019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi n:");
		int n=sc.nextInt();
		int[]niz=new int[n];
		for (int i=0; i<niz.length; i++) {
			System.out.println("Unesi element niza" +i);
			niz[i]=sc.nextInt();
		}
		System.out.println("Uspesno unet niz");
		System.out.println("Proizvod elemenata na neparnim pozicijama je:" +neparnaPozicija(niz));
		System.out.println("Zbir parnih elemenata je:" +parniElementi(niz));
	}
	public static int neparnaPozicija(int[]a) {
		int proizvod=1;
		for (int i=0; i<a.length; i++) {
			if (i%2!=0) {
				proizvod=proizvod*a[i];
			}
		}
		return proizvod;
    }
	public static int parniElementi(int[]b) {
		int zbir=0;
		for (int i=0; i<b.length; i++) {
			if (b[i]%2==0) {
				zbir=zbir+b[i];
			}
		}
		return zbir;
	}
}
	
       