import java.util.Locale;
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner SC = new Scanner (System.in);
		
		String x;
		int y;
		double z;
		
		x = SC.next();
		y = SC.nextInt();
		z = SC.nextDouble();
		
		System.out.println("dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//Sysout ( Ctrl + espaço : faz o system.out... automatico.
		
		SC.close();
	}
}
