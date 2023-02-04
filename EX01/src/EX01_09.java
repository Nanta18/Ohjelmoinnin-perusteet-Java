import java.util.Scanner;

public class EX01_09 {
    public static void main(String[] args) {
        karkausvuosiTarkastaja();
    }      

    public static void karkausvuosiTarkastaja() {
       Scanner kyselija = new Scanner(System.in);              //Luo uuden scannerin

       System.out.println("Kerro vuosi");

       int vuosi = kyselija.nextInt();                         //Kysyy vuoden käyttäjältä

       System.out.println("kerro kuukausi (numero)");

       int kuukausi = kyselija.nextInt();
        
       int jaettuNeljällä = vuosi % 4;                         
       int jaettuYhdellä = jaettuNeljällä % 1;                 

       if(jaettuNeljällä == 0) {
            if(jaettuYhdellä == 0) {
                System.out.println("Vuosi " + vuosi + " on karkausvuosi.");
            }
       } else {
        System.out.println("Vuosi " + vuosi + " ei ole karkausvuosi.");
       }

       if(kuukausi == 2 && jaettuNeljällä == 0 && jaettuYhdellä == 0) {     //Jos on karakusvuosi helmikuu on päivän pidempi
            System.out.println("Kuukaudessa on 29 päivää");
       }else if(kuukausi == 2) {
        System.out.println("Kuukaudessa on 28 päivää");
       }

       if(kuukausi == 1 || kuukausi == 3 || kuukausi == 5 || kuukausi == 7 || kuukausi == 8 || kuukausi == 10 || kuukausi == 12) { //Kuukaudet joissa on 31 päivää
        System.out.println("Kuukaudessa on 31 päivää");
       }

       if(kuukausi == 4 || kuukausi == 6 || kuukausi == 9 || kuukausi == 11) { //Kuukaudet joissa on 30 päivää
        System.out.println("Kuukaudessa on 30 päivää");
       }
        kyselija.close();
    }
}


