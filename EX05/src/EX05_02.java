import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class EX05_02 {
public static void main(String[] args) throws InterruptedException {
    Scanner kyselija = new Scanner(System.in);
    String jono1 = kysyKayttajanJono(kyselija);
    String jono2 = kysyKayttajanJono(kyselija);
    tulostaja(jono1, jono2);
   
    }
    public static String kysyKayttajanJono(Scanner kyselija) {
        System.out.println("Anna merkkijono.");
        String jono = kyselija.nextLine();
        return jono;
    }

    public static void tulostaja(String jono1, String jono2) {
        if(jono1.length() > jono2.length()) {
            System.out.println(jono1);
        } else if (jono2.length() > jono1.length()) { 
            System.out.println(jono2);
        } else if (jono1.length() == jono2.length()) {
            System.out.println(jono1);
        }
    }
}
