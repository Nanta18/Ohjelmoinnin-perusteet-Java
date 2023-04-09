import java.util.*;
public class EX08_06 {
    public static void main(String[] args) throws InterruptedException {
 
              // talletetaan maat ja pääkaupungit HashMap-olioon
              HashMap<String, String> paaKaupungit = new HashMap<String, String>();
              paaKaupungit.put("Suomi", "Helsinki");
              paaKaupungit.put("Ruotsi", "Tukholma");
              paaKaupungit.put("Norja", "Oslo");
              paaKaupungit.put("Tanska", "Kööpenhamina");
              paaKaupungit.put("Venäjä", "Moskova");
              paaKaupungit.put("Israel", "Jerusalem");
              paaKaupungit.put("Ukraina", "Kiev");
              paaKaupungit.put("USA", "Washington");
              paaKaupungit.put("Saksa", "Berlin");
              paaKaupungit.put("UK", "Lontoo");
              
              // aloitetaan peli
              Scanner kyselija = new Scanner(System.in);
              int correctAnswers = 0;
              
              System.out.println("Tervetuloa pelaamaan pääkaupunkipeliä!");
              System.out.println("Arvaa maan pääkaupunki.");
          
              // kysytään käyttäjältä viisi kysymystä
              for (int i = 0; i < 5; i++) {
                // arvotaan maa
                List<String> maat = new ArrayList<String>(paaKaupungit.keySet());
                Collections.shuffle(maat);
                String maa = maat.get(0);
          
                // kysytään käyttäjältä pääkaupunki
                System.out.println(maa + " pääkaupunki?");
                String answer = kyselija.nextLine();
          
                // tarkistetaan vastaus
                if (answer.equalsIgnoreCase(paaKaupungit.get(maa))) {
                  System.out.println("Oikein!");
                  correctAnswers++;
                } else {
                  System.out.println("Väärin. Oikea vastaus on " + paaKaupungit.get(maa) + ".");
                }
              }
          
              // näytetään pelin tulos
              System.out.println("Peli on päättynyt. Saavutit " + correctAnswers + "/5 pistettä.");
              kyselija.close();
    }
}
