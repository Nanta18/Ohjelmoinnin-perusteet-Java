import java.util.Scanner;

public class EX01_08 {
    public static void main(String[] args) {
        karkausvuosiTarkastaja();
    }      

    public static void karkausvuosiTarkastaja() {
       Scanner kyselija = new Scanner(System.in);              //Luo uuden scannerin

       System.out.println("Kerro vuosi");

       int vuosi = kyselija.nextInt();                         //Kysyy vuoden käyttäjältä
        
       int jaettuNeljällä = vuosi % 4;                         
       int jaettuYhdellä = jaettuNeljällä % 1;                 

       if(jaettuNeljällä == 0) {
            if(jaettuYhdellä == 0) {
                System.out.println("Vuosi " + vuosi + " on karkausvuosi.");
            }
       } else {
        System.out.println("Vuosi " + vuosi + " ei ole karkausvuosi.");
       }
        kyselija.close();
    }
}


