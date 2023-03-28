import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX07_08{
    public static void main(String[] args) {
        File tiedosto = new File("D:/Ohjelmoinnin-perusteet-Java/EX07/src/ankka.txt");
        int sanalaskuri = 0;
        String pisinSana = "";
        int pisinSanaPituus = 0;

        try {
            Scanner lukija = new Scanner(tiedosto);

            while (lukija.hasNext()) {
                String sana = lukija.next();
                sanalaskuri++;

                if (sana.length() > pisinSanaPituus) {
                    pisinSana = sana;
                    pisinSanaPituus = sana.length();
                }
            }

            lukija.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tiedosto hukas.");
        }

        System.out.println("Tiedostossa on " + sanalaskuri + " sanaa.");
        System.out.println("Pisin sana on \"" + pisinSana + "\" ja sen pituus on " + pisinSanaPituus + ".");
        }
    }