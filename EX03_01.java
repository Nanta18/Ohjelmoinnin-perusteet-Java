import java.util.Scanner;

public class EX03_01 {
    public static void main(String[] args) {
        Scanner kyselija = new Scanner(System.in);      //Luo uuden scannerin
        int luku1 = lueLuku(kyselija);
        int luku2 = lueLuku(kyselija);
        int summa = laskeSumma(luku1, luku2);
        boolean parillinen = onParillinen(summa);
        kyselija.close();   //Sulkee scannerin

        if(parillinen) {
            System.out.println("Lukujen " + luku1 + " ja " + luku2 + " summa " + summa + " on parillinen.");            //Tulostaa tämän jos on parillinen
        } else {
            System.out.println("Lukujen " + luku1 + " ja " + luku2 + " summa " + summa + " ei ole parillinen.");        //Tulostaa tämän jose ei ole parillinen
        }
    }

    public static int lueLuku(Scanner kyselija) {    //Ottaa käyttäjän syötteen ja palauttaa sen return:illa
       
        int kaytajanLuku = kyselija.nextInt();
        return kaytajanLuku;
    }

    public static int laskeSumma(int luku1, int luku2) {    //Laskee saatujen lukujen summan ja palauttaa sen return:illa
        int summa = luku1 + luku2;
        return summa;
    }

    public static boolean onParillinen(int summa) {     //Tarkistaa onko saatu luku parillinen ja palauttaa joko true tai false
        return summa % 2 == 0;
    }
}
