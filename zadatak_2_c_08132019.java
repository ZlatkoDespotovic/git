package domaci_08132019;

import java.util.Scanner;

public class zadatak_2_c_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Program sabira sve brojeve od k do n:");
		int k;
		int n;
		int sum=0;
		System.out.println("Uneti vrednost k:");
		k=sc.nextInt();
		System.out.println("Uneti vrednost n:");
		n=sc.nextInt();
		while (k<=n) {
			sum=sum+k;
			k++;
		}
		System.out.println("Zbir brojeva od k do n je:" + sum);
	}
}
