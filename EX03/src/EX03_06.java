import java.util.Scanner;
import java.util.Random;

public class EX03_06 {
public static void main(String[] args) {
	Scanner kyselija = new Scanner(System.in);
    Random satunnainenLuku = new Random(); 		
    boolean jatketaanko = true;

    while(jatketaanko) {
    kiviSaksetPaperi(kayttajanValinta(kyselija), koneenValinta(satunnainenLuku));
    jatketaanko = jatketaankoKyselija(kyselija);
    }
    kyselija.close();    
}

    static int kayttajanValinta(Scanner kyselija) {
        System.out.println("Kivi, sakset vai paperi?");
        System.out.println("1. Kivi");
        System.out.println("2. Sakset");
        System.out.println("3. Paperi");
        int valinta = kyselija.nextInt() ;                                                //Kysyy käyttäjän valinnan
        
        System.out.println("Valintasi oli " + valintaTekstina(valinta) + ".");           //Kertoo käyttäjälle mitä hän valitsi
        return valinta;                                                                   //Palauttaa käyttän valinnan return metodilla
    } 

    static int koneenValinta(Random satunnainenLuku) {
        int koneenValinta = satunnainenLuku.nextInt(3) + 1;                        //Antaa luvun 1-3 väliltä
        System.out.println("Koneen valinta oli " + valintaTekstina(koneenValinta));
        return koneenValinta;                                                             //Palauttaa koneen valinnan return metodilla
    }

    static String valintaTekstina(int valinta) {                                          //Muuttaa valinnan numerosta tekstiksi ja palauttaa tekstin return metodilla
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

    static boolean kiviSaksetPaperi(int kayttajanValinta, int koneenValinta) {
        while(true) {
        //Tasapelit
        if (kayttajanValinta == koneenValinta) {
            System.out.println("Tasapeli :/");
            return false;
        }

        //Käyttäjä voittaa
        if ((kayttajanValinta == 1 && koneenValinta == 2) ||
        (kayttajanValinta == 2 && koneenValinta == 3) ||
        (kayttajanValinta == 3 && koneenValinta == 1)) {
            System.out.println("Voitit d:)");
            return true;
        }

        //Käyttäjä häviää jos kumpikaan ylemmistä ei ollut totta
        System.out.println("Hävisit :(");
        return false;
    }
}

    static boolean jatketaankoKyselija(Scanner kyselija) {
        while(true) {
            System.out.println("Jatketaanko?");
            System.out.println("1. Jatketaan.?");
            System.out.println("2. Ei jatketa.?");

            int valinta = kyselija.nextInt();

            if(valinta == 2) {
                return false;
            }

            return true;
        }
    }
}