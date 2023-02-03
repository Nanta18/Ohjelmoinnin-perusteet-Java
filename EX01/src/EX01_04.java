import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
	
	public class EX01_04 {
	
		public static void main(String[] args) {
	
			Scanner kayttajaNumero = new Scanner(System.in);
			System.out.println("Anna numero");
			int numero_01 = kayttajaNumero.nextInt();
			
			System.out.println("Anna toinen numero");
			int numero_02 = kayttajaNumero.nextInt();
			
			System.out.println("Anna Kolmaski numero");
			int numero_03 = kayttajaNumero.nextInt();
			
			final ArrayList<Integer> numerot = new ArrayList<Integer>();
			numerot.add(numero_01);
			numerot.add(numero_02);
			numerot.add(numero_03);

			System.out.println(numerot);
			
			Collections.sort( numerot );

			System.out.println(numerot);
			kayttajaNumero.close();
		}
	
	}












