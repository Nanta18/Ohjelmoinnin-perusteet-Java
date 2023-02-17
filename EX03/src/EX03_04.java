import java.util.Scanner;

public class EX03_04 {
public static void main(String[] args) {
	Scanner kyselija = new Scanner(System.in); 							//Luo uuden scannerin
	
    int luku1 = lueLuku(kyselija);
    int luku2 = lueLuku(kyselija);
    int luku3 = lueLuku(kyselija);
    int luku4 = lueLuku(kyselija);

    int min = tulostaMin(luku1, luku2, luku3, luku4);                       
    int max = tulostaMax(luku1, luku2, luku3, luku4);
    
    System.out.println("Suurin luku on " + max);                            
    System.out.println("Pienin luku on " + min);                           

	kyselija.close();												    	
}

	static int lueLuku(Scanner kyselija) {				                    //Kysyy syötteen käyttäjältä ja palauttaa sen return metodilla				
		int syote = kyselija.nextInt();	
        return syote;	
    }

    static int tulostaMin(int luku1, int luku2, int luku3, int luku4) {     //Palauttaa pienmmän arvon return metodilla 
        return Math.min(Math.min(luku1, luku2), Math.min(luku3, luku4));
    }

    static int tulostaMax(int luku1, int luku2, int luku3, int luku4) {     //Palauttaa suurimman arvon return metodilla 
        return Math.max(Math.max(luku1, luku2), Math.max(luku3, luku4));
    }
}