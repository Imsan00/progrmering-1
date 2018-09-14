import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Läxa1 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.println("Namn?");
		String name = Input.nextLine();

		System.out.println("age?");
		String age = Input.nextLine();

		System.out.println("Addres");
		String Addres = Input.nextLine();

		System.out.println("postnummer");
		String postnummer = Input.nextLine();

		System.out.println("ort?");
		String ort = Input.nextLine();

		System.out.println("Telefonnummer?");
		String Telefon = Input.nextLine();

		System.out.println("Namn:" + " " + name);
		System.out.println("Ålder:" + " " + age);
		System.out.println("Addres:" + " " + Addres);
		System.out.println("\t" + postnummer + " " + ort);
		System.out.println("Telefonnummer:" + " " + Telefon);

	}

}
