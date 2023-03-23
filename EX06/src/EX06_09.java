import java.util.Scanner;

public class EX06_09 {
    public static void main(String[] args) throws InterruptedException {
        Scanner kyselija = new Scanner(System.in);
        
        System.out.print("Syötä ensimmäinen luku: ");
        int luku1 = kyselija.nextInt();
        
        System.out.print("Syötä toinen kokonaisluku: ");
        int luku2 = kyselija.nextInt();
        
        long tulo = (long) luku1 * luku2;
        if (tulo > Integer.MAX_VALUE) {
            System.out.println("Tulo ei mahdu int-tyyppiseen muuttujaan.");
        } else {
            int result = (int) tulo;
            System.out.println("Kertolaskun tulos on: " + result);
        }
    }
}