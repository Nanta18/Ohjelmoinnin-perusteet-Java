import java.util.Scanner;


public class EX02_06 {

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
                kyselija.close();
                break;
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
