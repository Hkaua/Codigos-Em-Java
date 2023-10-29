
package course;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite 3 números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("Maior = " + a);
		} else if (b > c) {
			System.out.println("Maior = " + b);
		} else {
			System.out.println("Maior = " + c);
		}
		sc.close();
	}
}