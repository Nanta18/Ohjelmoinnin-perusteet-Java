import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class EX03_07 {
public static void main(String[] args) {
	Scanner kyselija = new Scanner(System.in);
    Random satunnainenLuku = new Random(); 		

    ArrayList<Integer> pisteet = new ArrayList<Integer>(3);         //Luo listan jonne voitot, häviöt ja tasapelit säilötään
    pisteet.add(0);
    pisteet.add(0);
    pisteet.add(0);

    for(int i = 0; i != 10; i++) {
    pisteLaskuri(pisteet, kiviSaksetPaperi(kayttajanValinta(kyselija), koneenValinta(satunnainenLuku)));
    }

    tulostaPisteet(pisteet);
}

    static int kayttajanValinta(Scanner kyselija) {                                         //Kysyy käyttäjän valinnan
        System.out.println("Kivi, sakset vai paperi?");
        System.out.println("1. Kivi");
        System.out.println("2. Sakset");
        System.out.println("3. Paperi");
        int valinta = kyselija.nextInt() ;                                                
        
        System.out.println("Valintasi oli " + valintaTekstina(valinta) + ".");              
        return valinta;                                                                     
    } 

    static int koneenValinta(Random satunnainenLuku) {                                      //Arpoo koneen valinnan
        int koneenValinta = satunnainenLuku.nextInt(3) + 1;                           //Antaa luvun 1-3 väliltä
        System.out.println("Koneen valinta oli " + valintaTekstina(koneenValinta));
        return koneenValinta;                                                             
    }

    static String valintaTekstina(int valinta) {                                             //Muuttaa valinnan numerosta tekstiksi ja palauttaa tekstin return metodilla
        String valintaTekstina = "";
        if(valinta == 1) {
            valintaTekstina = "Kivi";
        } else if(valinta == 2) {
            valintaTekstina = "Sakset";
        } else if(valinta == 3) {
            valintaTekstina = "Paperi";
        }
        return valintaTekstina;
    }

    static int kiviSaksetPaperi(int kayttajanValinta, int koneenValinta) {                      //tarkastaa tuloksen
        while(true) {
        //Tasapelit
        if (kayttajanValinta == koneenValinta) {
            System.out.println("Tasapeli :/");
            return 0;
        }

        //Käyttäjä voittaa
        if ((kayttajanValinta == 1 && koneenValinta == 2) ||
        (kayttajanValinta == 2 && koneenValinta == 3) ||
        (kayttajanValinta == 3 && koneenValinta == 1)) {
            System.out.println("Voitit d:)");
            return 1;
        }

        //Käyttäjä häviää jos kumpikaan ylemmistä ei ollut totta
        System.out.println("Hävisit :(");
        return 2;
        }
    }

    static void pisteLaskuri(ArrayList<Integer> pisteet, int tulos) {                           //Lisää tuloksen laskuriin
        pisteet.set(tulos, pisteet.get(tulos) + 1);
    }

    static void tulostaPisteet(ArrayList<Integer> pisteet) {                                    //tulostaa käyttäjälle pisteet
        System.out.println("-------------------------");
        System.out.println("Voittoja: " + pisteet.get(1));
        System.out.println("Häviöitä: " + pisteet.get(2));
        System.out.println("Tasapelejä: " + pisteet.get(0));
        System.out.println("-------------------------");
    }
}