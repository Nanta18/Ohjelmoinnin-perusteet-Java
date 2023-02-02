import java.util.Scanner;


public class EX02_07 {

public static void main(String[] args) {
    arvaaLuku();
}
    static void arvaaLuku() {
        Scanner kyselija = new Scanner(System.in); 
        int randomLuku = (int)(Math.random() *100 + 1);

        while(true) {
            System.out.println("Arvaa luku 1-100 väliltä");
            int arvaus = kyselija.nextInt();

            if(arvaus == randomLuku) {
                System.out.println("Oikein Meni!");
                System.out.println("Valitse toiminto");
                System.out.println("1. Arvaa uusi numero");
                System.out.println("2. Lopeta");
                int vastaus = kyselija.nextInt();
                if(vastaus == 1){                                   //Vastaus 1: Antaa uuden luvun
                    randomLuku = (int)(Math.random() *100 + 1);
                }else if(vastaus == 2){                             //Vastaus 1: Lopettaa kyselyn
                    kyselija.close();
                    break;
                }
            } else{
                if(arvaus < randomLuku) {
                    System.out.println("Luku on isompi kuin arvauksesi");
                } else{
                    if(arvaus > randomLuku) {
                        System.out.println("Luku on pienempi kuin arvauksesi");
                    }
                }
            }
        }
    }
} 
