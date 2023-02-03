import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
	
	public class EX01_04 {
	
		public static void main(String[] args) {
	
			Scanner kayttajaNumero = new Scanner(System.in);				//Luo kyselijän
			System.out.println("Anna numero");
			int numero_01 = kayttajaNumero.nextInt();						//Kysyy ensimmäisen luvun
			
			System.out.println("Anna toinen numero");
			int numero_02 = kayttajaNumero.nextInt();						//Kysyy toisen luvun
			
			System.out.println("Anna Kolmaski numero");					//Kysyy kolmannen luvun
			int numero_03 = kayttajaNumero.nextInt();
			
			final ArrayList<Integer> numerot = new ArrayList<Integer>();	//Luo Arraylistan
			numerot.add(numero_01);											//Lisää numerot
			numerot.add(numero_02);
			numerot.add(numero_03);
			
			Collections.sort( numerot );									// Lajittelee numerot

			System.out.println(numerot);									//Tulostaa lajitellun listan
			kayttajaNumero.close();											//Sulkee kyselijän
		}
	
	}












