import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EX08_03 {
    public static void main(String[] args) throws InterruptedException {
        Scanner kyselija = new Scanner(System.in);
        System.out.println("Anna sana.");
        String sana1 = kyselija.nextLine();
        System.out.println("Anna pituus.");
        String sana2 = kyselija.nextLine();

        int pituus = Integer.parseInt(sana2);  

        String[][] matriisi = taytaMatriisi(sana1, pituus);
        tulostaMatriisi(matriisi, pituus);
    }

    public static String[][] taytaMatriisi(String sana, int pituus) {
        int indeksiMatriisissa = -1;

        String[][] matriisi = new String[pituus][pituus];
        for(int i = 0; i < pituus; i++) {
            for(int j = 0; j < pituus; j++) {
                indeksiMatriisissa++;
                if(indeksiMatriisissa == sana.length()) {
                    indeksiMatriisissa = 0;
                }
                char seuraavaKirjain = sana.charAt(indeksiMatriisissa);
                matriisi[i][j] = String.valueOf(seuraavaKirjain);
            } 
        }
        return matriisi;
    }

    public static void tulostaMatriisi(String[][] matriisi, int pituus) {
        PrintWriter tulostaja;
        try {
            tulostaja = new PrintWriter("tulosteEX02.txt", "UTF-8");
    
            for (int i = 0; i < pituus; i++) {
                for (int j = 0; j < pituus; j++) {
                    tulostaja.print(matriisi[i][j]);
                }
                // add newline character after printing each row
                tulostaja.println();
            }
            // close the PrintWriter
            tulostaja.close();
    
        } catch (FileNotFoundException e) {
            System.out.println("Tiedosto hukassa");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Encoding tais hajota");
        }
    }
}