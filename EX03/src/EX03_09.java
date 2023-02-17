import java.util.Scanner;

public class EX03_09 {
    public static void main(String[] args) {
        Scanner kyselija = new Scanner(System.in);
 
        int minuutit = getMinuutit(kyselija);
        int sekunnit = getSekunnit(kyselija);

        int[] aika = tarkistaAika(minuutit, sekunnit);
        minuutit = aika[0];
        sekunnit = aika[1];
       
        aikaaJaljella(minuutit, sekunnit);
        
        aika = lisaaMinuutti(minuutit, sekunnit);
        minuutit = aika[0];
        sekunnit = aika[1];
        aikaaJaljella(minuutit, sekunnit);

        aika = vahennaSekuntti(minuutit, sekunnit);
        minuutit = aika[0];
        sekunnit = aika[1];
        aikaaJaljella(minuutit, sekunnit);

    }

    static int getMinuutit(Scanner kyselija) {
        System.out.println("Anna minuutit ");
        return kyselija.nextInt();
    }

    static int getSekunnit(Scanner kyselija) {
        System.out.println("Anna sekunnit ");
        return kyselija.nextInt();
    }

    static int[] tarkistaAika(int minuutit, int sekunnit) {
        if(sekunnit < 0 || minuutit < 0) {
            sekunnit = 0;
            minuutit = 0;
        } else if(sekunnit >= 60) {
            minuutit += sekunnit / 60;
            sekunnit %= 60;
        } else if(minuutit > 5) {
            sekunnit = 0;
            minuutit = 0;
        } else if(minuutit == 5 && sekunnit > 0) {
            sekunnit = 0;
            minuutit = 0;
        }
        return new int[] {minuutit, sekunnit};
    }

    static void aikaaJaljella(int minuutit, int sekunnit) {

        int sekunnitTuloste = sekunnit;
        if(Math.floor(Math.log10(sekunnit) + 1) == 1) {
            System.out.println(minuutit + ":0" + sekunnitTuloste);
        } else {
            System.out.println(minuutit + ":" + sekunnitTuloste);
        }   
    }

    static int[] lisaaMinuutti(int minuutit, int sekunnit) {
        minuutit += 1;
        return new int[] {minuutit, sekunnit};
    }

    static int[] vahennaSekuntti(int minuutit, int sekunnit) {
        sekunnit -= 1;
        return new int[] {minuutit, sekunnit};
    }
}