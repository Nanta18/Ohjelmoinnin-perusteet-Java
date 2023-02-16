import java.util.Scanner;

public class EX03_02 {
    public static void main(String[] args) { 
        Scanner kyselija = new Scanner(System.in);      //Luo uuden scannerin
        int luku1 = lueLuku(kyselija);
        int luku2 = lueLuku(kyselija);
        int summa =laskeSumma(luku1, luku2);
        int erotus = laskeErotus(luku1, luku2);
        int osamaara = laskeOsamaara(luku1, luku2);
        int tulo = lasketulo(luku1, luku2);

        System.out.println("Summa: " + summa);
        System.out.println("Erotus: " + erotus);
        System.out.println("Osamäärä: " + osamaara);
        System.out.println("Tulo: " + tulo);

        kyselija.close();   //Sulkee scannerin
    }

    public static int lueLuku(Scanner kyselija) {    //Ottaa käyttäjän syötteen ja palauttaa sen return-metodilla
        System.out.println("Anna numero");
        int kaytajanLuku = kyselija.nextInt();
        return kaytajanLuku;
    }

    public static int laskeSumma(int luku1, int luku2) {     //Laskee summan ja palauttaa sen return-metodilla
        int summa = luku1 + luku2;
        return summa;
    }

     public static int laskeErotus(int luku1, int luku2) {    //Laskee erotuksen ja palauttaa sen return-metodilla
        int erotus = luku1 - luku2;
        return erotus;
     }

    public static int laskeOsamaara(int luku1, int luku2) {    //Laskee osamäärän ja palauttaa sen return-metodilla. Jos toinen luku on 0 ohjelma kaatuu tässä kohtaa
        int osamaara = luku1 / luku2;
        return osamaara;
    }

    public static int lasketulo(int luku1, int luku2) {    //Laskee tulon ja palauttaa sen return-metodilla
        int tulo = luku1 * luku2;
        return tulo;
    }
}
