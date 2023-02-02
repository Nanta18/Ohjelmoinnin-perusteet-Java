import java.util.Scanner;

public class EX02_02 {
public static void main(String[] args) {
	lukuKysyja();
}
	
	static void lukuKysyja() {
		
		Scanner kyselija = new Scanner(System.in); 
		System.out.println("Anna numero, -1 lopettaa");

		int i = 0;
		int summa = 0;
		int edellinen = 5;
		int syote = 0000;
		
		while (true) {
			if(i != edellinen) {
			edellinen = syote;
			syote = kyselija.nextInt(); 
			summa = summa + syote;
			i = syote;
			} else {
				System.out.println("Toimii");
				break;
			}
			
			
		}
		System.out.println(summa);
		kyselija.close();
		
	}	
}

