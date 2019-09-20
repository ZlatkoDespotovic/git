package domaci_08132019;

import java.util.Scanner;

public class zadatak_2_b_08132019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Program sabira sve brojeve od 1 do n:");
		int a=1;
		int s=0;
		int n;
		System.out.println("Upisati vrednost n:");
		n=sc.nextInt();
		while (a<=n) {
		s=s+a;
		a++;
	}
		System.out.println("Zbir brojeva do n:" + s);
	}

}
