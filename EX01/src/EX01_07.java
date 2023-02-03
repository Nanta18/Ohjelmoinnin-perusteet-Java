import java.util.Scanner;

public class EX01_07 {
    public static void main(String[] args) {
        arvosanaLaskuri();
    }      

    public static void arvosanaLaskuri() {
        Scanner kyselija = new Scanner(System.in);              //Luo uuden scannerin

        System.out.println("Kerro pisteet");

        while(true) {
            int pisteet = kyselija.nextInt();                   //Kysyy käyttäjän pisteet

            if(pisteet <= 0 && pisteet <= 11) {                 //Tarkastaa on pisteet välillä 1-11
                System.out.println("Hylätty");
                break;
            } else if(pisteet <= 12 && pisteet <= 16) {         //Tarkastaa on pisteet välillä 12-16
                System.out.println("Arvosana: 1");
                break;
            } else if(pisteet <= 17 && pisteet <= 21) {         //Tarkastaa on pisteet välillä 17-21
                System.out.println("Arvosana: 2");
                break;
            } else if(pisteet <= 22 && pisteet <= 24) {         //Tarkastaa on pisteet välillä 22-24
                System.out.println("Arvosana: 3");
                break;
            } else {
                System.out.println("Pistemäärä ei mahdollinen, kerro pisteet uudestaan");    //Käyttäjän antama pistemäärä ei ollut rajojen sisällä
            }
        }
        kyselija.close();
    }
}


