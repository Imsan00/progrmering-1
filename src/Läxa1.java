import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Läxa1 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Vad heter du?");
		
		String name = Input.nextLine();
		
		System.out.println("age?");
		
		String age = Input.nextLine();
	}
}
