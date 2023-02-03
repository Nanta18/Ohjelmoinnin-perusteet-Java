import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
	
	public class EX01_05 {
	
		public static void main(String[] args) {                            //Vois toteutttaa kivemmin for loopilla
	
			Scanner kayttajaNumero = new Scanner(System.in);				//Luo kyselijän
			System.out.println("Anna numero");
			int numero_01 = kayttajaNumero.nextInt();						//Kysyy ensimmäisen luvun
			
			System.out.println("Anna toinen numero");
			int numero_02 = kayttajaNumero.nextInt();						//Kysyy toisen luvun
			
			System.out.println("Anna Kolmaski numero");					//Kysyy kolmannen luvun
			int numero_03 = kayttajaNumero.nextInt();

            System.out.println("Anna ny viel nejäski numero");			//Kysyy neljännen luvun
			int numero_04 = kayttajaNumero.nextInt();
			
			final ArrayList<Integer> numerot = new ArrayList<Integer>();	//Luo Arraylistan
			numerot.add(numero_01);											//Lisää numerot
			numerot.add(numero_02);
			numerot.add(numero_03);
            numerot.add(numero_04);
			
			
			Collections.sort( numerot );									// Lajittelee numerot

			System.out.println("Numerot pienestä suurimpaan" + numerot);	//Tulostaa numerot						
			kayttajaNumero.close();											//Sulkee kyselijän
		}
	
	}












