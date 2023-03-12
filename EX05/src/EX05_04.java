import java.lang.String;
import java.util.Scanner;

public class EX05_04 {
public static void main(String[] args) throws InterruptedException {
    Scanner kyselija = new Scanner(System.in);
    String lause = kyselija.nextLine();
    alkukirjainTulostaja(lause);
    kyselija.close();
    }

    public static void alkukirjainTulostaja(String lause) {
        String[] sanat = lause.split(" ");
        for (String sana : sanat) {
            char ekaKirjain = sana.charAt(0);
            System.out.println("Sanan " + sana + " ensimmäinen kirjain on " + ekaKirjain);
        }
    }
}