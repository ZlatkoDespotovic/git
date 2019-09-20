package domaci_08152019;

import java.util.Scanner;

public class zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Uneti zakljucnu vrednost N do koje treba prikazati Fibernacijev niz:");
		int n=sc.nextInt();
		int i1=0, i2=1, i3;
		System.out.println(i1+" ");
		System.out.println(i2+" ");
		for(int i=1; i<=n-2; i++) {
			i3=i1+i2;
		System.out.println(i3+" ");
		i1=i2;
		i2=i3;
		}
	}

}
