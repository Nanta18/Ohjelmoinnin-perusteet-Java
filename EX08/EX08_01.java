import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX08_01 {
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

        //String matriisiSana = "joonatan";
        //int matriisiPituus = 3;

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
        for (int i = 0; i < pituus; i++) {
            for (int j = 0; j < pituus; j++) {
                System.out.print(matriisi[i][j]);
            }
            System.out.println();
        }
    }
}
