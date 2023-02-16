import java.util.Scanner;

public class EX03_03 {
public static void main(String[] args) {
	Scanner kyselija = new Scanner(System.in); 							//Luo uuden scannerin
	
	int summa = lueLuku(kyselija);										//kutsuu  lueLuku metodin ja palauttaa lukujen summan
	tulosta(summa);														//Tulostaa summan käyttäjälle
	kyselija.close();													//sulkee kyselija scannerin
}

	static int lueLuku(Scanner kyselija) {								//Kyselee käyttäjältä lukuja kunnes käyttäjä syöttää -1, palauttaa lukujen summan return metodilla
		int summa = 0;

		while(true) {
			System.out.println("Anna luku, -1 lopettaa");
			int syote = kyselija.nextInt();
			if(syote == -1) {											//Tarkistaa onko käyttäjän luku -1
				break;
			} else{
				summa = summa + syote;									//Jos syöte ei ole -1 lisää syötteen summaan 
			}
		}	
		return summa;			
	}

	static void tulosta(int tulostus) {									//Tulostaa integertin tulostus käyttäjälle
		System.out.println("Lukujen summa on " + tulostus);
	}
}