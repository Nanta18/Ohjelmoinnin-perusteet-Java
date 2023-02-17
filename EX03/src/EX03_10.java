import java.util.Scanner;

public class EX03_10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner kyselija = new Scanner(System.in);
 
        int minuutit = getMinuutit(kyselija);
        int sekunnit = getSekunnit(kyselija);

        int[] aika = tarkistaAika(minuutit, sekunnit);
        minuutit = aika[0];
        sekunnit = aika[1];

        while (true) {  
            if (sekunnit == 0 && minuutit == 0) {       //Katkaisee loopin kun aika on 0:00
                System.out.println("Aika kului loppuun.");
                break;
            } else if (sekunnit == 0 && minuutit != 0) {
                minuutit -= 1;
                sekunnit += 60;
            }
            sekunnit -= 1;
            aikaaJaljella(minuutit, sekunnit);
            Thread.sleep(1000);
        }
    }
    
    static int getMinuutit(Scanner kyselija) {          //Pyytää käyttäjältä minuutit
        System.out.println("Anna minuutit ");
        return kyselija.nextInt();
    }

    static int getSekunnit(Scanner kyselija) {          //Pyytää käyttäjältä sekunnit
        System.out.println("Anna sekunnit ");
        return kyselija.nextInt();
    }

    static int[] tarkistaAika(int minuutit, int sekunnit) {         //Tarkistaa että aikaformaatti noudattaa kaikkia sääntöjä
        if(sekunnit < 0 || minuutit < 0) {      // Jos aika on negatiivinen se muutetaan 0:00
            sekunnit = 0;
            minuutit = 0;
        } else if(sekunnit >= 60) {             //Jos sekuntteja on yli 60 ne muutetaan minuuteiksi
            minuutit += sekunnit / 60;
            sekunnit %= 60;
        } else if(minuutit > 5) {               //Jos minuutteja on yli 6 tai enemmän aika muutetaan 0:00
            sekunnit = 0;
            minuutit = 0;
        } else if(minuutit == 5 && sekunnit > 0) {                  //Jos aika on 5 minuuttia ja sekunnteja yli muutetaan se muotoon 0:00
            sekunnit = 0;
            minuutit = 0;
        }
        return new int[] {minuutit, sekunnit};
    }

    static void aikaaJaljella(int minuutit, int sekunnit) {
        String tuloste = String.format("%d:%02d", minuutit, sekunnit);
         // % käytetään formatoinnissa. d = digits 2d on sama kuin 2 digits. 0 ennen 2 tarkottaa että jos siinä ei ole nollaa laita nolla     
        System.out.println(tuloste);
    }

    static int[] lisaaMinuutti(int minuutit, int sekunnit) {        //Lisää aikaan minuutin
        minuutit += 1;
        return new int[] {minuutit, sekunnit};
    }

    static int[] vahennaSekuntti(int minuutit, int sekunnit) {      //Poistaa ajasta sekunnin
        sekunnit -= 1;
        return new int[] {minuutit, sekunnit};
    }
}