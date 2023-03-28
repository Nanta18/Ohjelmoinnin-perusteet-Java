import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;

public class EX07_10 {

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä salasana:");
        String salasana = lukija.nextLine();

        boolean pituus = salasana.length() >= 8; //Kokeilee onko salasana yli 8 merkkiä pitkä
        boolean monimutkaisuus = salasana.matches(".*[A-Z].*") && //Kokeilee onko salasanassa kaikkia: Isot kirjaimet
                                salasana.matches(".*[a-z].*") && //Pienet kirjaimet
                                salasana.matches(".*[0-9].*") && // Numerot
                                salasana.matches(".*[!@#$%^&*()-_=+\\|\\[{\\]};:'\",<.>/?].*"); //Erikoismerkit
        boolean satunnaisuus = !containsFromFile(salasana, "D:/Ohjelmoinnin-perusteet-Java/EX07/src/DictionaryAttackTestWords.txt"); //Kokeilee englanninkielisen sanakirjan ensimmäistä 500k sanaa vastaan salasanaa
        boolean käyttöhistoria = !containsFromFile(salasana, "D:/Ohjelmoinnin-perusteet-Java/EX07/src/Top10MillionPasswords.txt");   //Kokeilee 10 miljoonaa suosituinta salasanaa vastaan salasanaa
        boolean onAnkka = !salasana.matches("ankka");
        boolean onKarhu = !salasana.matches("karhu");
        boolean onKolmio = !salasana.matches("kolmio");
        boolean blender = salasana.matches("blenderOnSuperior3DSofta");

        System.out.println("Kriteeri 1: Salasanan pituus vähintään 8 merkkiä: " + pituus);
        System.out.println("Kriteeri 2: Salasana sisältää erilaisia merkkejä (isoja ja pieniä kirjaimia, numeroita ja erikoismerkkejä): " + monimutkaisuus);
        System.out.println("Kriteeri 3: Salasana on riittävän satunnainen (ei ole yleinen sana): " + satunnaisuus);
        System.out.println("Kriteeri 4: Salasanan käyttöhistoria: " + käyttöhistoria);
        System.out.println("Kriteeri 5: Salasana ei ole ankka: " + onAnkka);
        System.out.println("Kriteeri 5: Salasana ei ole karhu: " + onKarhu);
        System.out.println("Kriteeri 5: Salasana ei ole kolmio: " + onKolmio);
        System.out.println("Kriteeri 5: Salasana on blenderOnSuperior3DSofta: " + blender);
    }

    public static boolean containsFromFile(String salasana, String tiedosto) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(tiedosto))) {
            return stream.anyMatch(salasana::equals);
        }
    }
}