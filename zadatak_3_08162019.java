package domaci_08162019;

import java.util.Scanner;

public class zadatak_3_08162019 {

	public static void main(String[] args) {
		//Napisati program za prebrojavanje prirodnih brojeva od k do n.
	
		Scanner sc=new Scanner(System.in);
        int n, k, i, br=0;
        System.out.println("Od broja ");
        k=sc.nextInt();
        System.out.println("Do broja ");
        n=sc.nextInt();
        i=k;
        do
        {
            br=br+1;
            i++;
        } while (i<=n);
        System.out.println(br);
}
	}


