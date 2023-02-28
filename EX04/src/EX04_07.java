import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class EX04_07 {
    public static void main(String[] args) throws InterruptedException {
    Scanner kyselija = new Scanner(System.in);

    // Luodaan lista jolle luvut tallennetaan
    List<Integer> luvut = new ArrayList<>();

     // Kysytään käyttäjältä lukuja
     int luku;
     for (int i = 0; i < 20; i++) {
         System.out.print("Syötä luku (tai -1 lopettaaksesi): ");
         luku = kyselija.nextInt();
         if (luku == -1) {
             break;
         }
         luvut.add(luku);
     }

     Collections.sort(luvut); // Järjestetään luvut pienestä isoon

      // Tulostetaan syötetyt luvut pienimmästä suurimpaan
      System.out.println("Syötit seuraavat luvut:");
      for (int l : luvut) {
          System.out.println(l);
        }
    }
}
