	import java.util.Scanner;
	
	public class EX01_03 {
	
		public static void main(String[] args) {
	
			Scanner kayttajaNumero = new Scanner(System.in);
			System.out.println("Anna numero");
			
			int numero_01 = kayttajaNumero.nextInt();
			
			System.out.println("Anna toinen numero");
			
			int numero_02 = kayttajaNumero.nextInt();
			
			System.out.println("Isompi numero on " + Math.max(numero_01, numero_02));
			
			System.out.println("Tulostetaanko myos pienempi luku?");
			
			//Ei käsketty tehdä mitään tolla tuloksella
		}
	
	}












