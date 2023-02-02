import java.util.Arrays;
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
			
			System.out.println("Anna Kolmaski numero");
			int numero_04 = kayttajaNumero.nextInt();
			
			int[] numerot = {numero_01, numero_02, numero_03, numero_04};
			
			Arrays.sort(numerot);
			System.out.println(Arrays.asList(numerot));
			kayttajaNumero.close();
		}
	
	}












