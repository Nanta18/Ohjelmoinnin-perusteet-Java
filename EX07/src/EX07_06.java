import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX07_06 {
public static void main(String[] args) throws InterruptedException {
    yhteystiedot();
}
      
public static void yhteystiedot() {
    Scanner kyselija = new Scanner(System.in);
    String nimi;
    int ika;
    String sahkoposti;
    FileWriter tiedosto = null;

    try{
       tiedosto = new FileWriter("yhteystiedot.txt");

    for (int i = 1; i <= 3; i++ ) {
        System.out.println("Syötä henkilön " + i + " nimi:");
        nimi = kyselija.nextLine();

        System.out.println("Syötä henkilön " + i + " ikä:");
        ika = kyselija.nextInt();
        kyselija.nextLine();

        System.out.println("Syötä henkilön " + i + " sähköpostiosoite:");
        sahkoposti = kyselija.nextLine();

        tiedosto.write("Henkilö " + i + ":\n");
        tiedosto.write("Nimi: " + nimi + "\n");
        tiedosto.write("Ikä: " + ika + "\n");
        tiedosto.write("Sähköposti: " + sahkoposti + "\n\n");
       }
       System.out.println("Yhteystiedot tallennettu");
       kyselija.close();
       tiedosto.close();
    } catch (IOException e) {
        System.out.println("Tiedoston tallentaminen epäonnistui.");
        e.printStackTrace();
        }
    }
}               