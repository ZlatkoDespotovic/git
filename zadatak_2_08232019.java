package domaci_08232019;

import java.util.Scanner;

public class zadatak_2_08232019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi broj a:");
		int a=sc.nextInt();
		System.out.println("Unesi broj b:");
		int b=sc.nextInt();
		System.out.println("Unesi broj c:");
		int c=sc.nextInt();
		brojevi(a, b, c);
	}
	public static void brojevi(int a, int b, int c) {
		while (a<=b) {
			if (a%c==0) {
				System.out.print(a+" ");
			}
			a=a+1;
		}
	}

}
