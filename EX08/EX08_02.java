import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class EX08_02 {
    public static void main(String[] args) throws InterruptedException {
        String rivi = "";
        String tiedosto = "EX1.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(tiedosto))) {
            String line;
            while ((line = br.readLine()) != null) {
                rivi += line + " ";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] sanat = rivi.split(" ");
            String sana1 = sanat[0];
            String sana2 = sanat[1];
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