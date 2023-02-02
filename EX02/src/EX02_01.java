import java.util.Scanner;

public class EX02_01 {
public static void main(String[] args) {
	lukuKysyja();
}
	
	static void lukuKysyja() {
		
		Scanner kyselija = new Scanner(System.in); 
		System.out.println("Anna numero, -1 lopettaa");

		int i = 0;
		int summa = 0;
		
		while (i != -1) {
			int syote = kyselija.nextInt(); 
			i = syote;
			
			if(syote != -1) {
			summa = summa + syote;
			}
		}
		System.out.println(summa);
		kyselija.close();
		
	}	
}

