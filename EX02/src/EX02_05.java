import java.util.Scanner;

public class EX02_05 {
    public static void main(String[] args) {
        kokeileLukualue();
    }

    static void kokeileLukualue() {
        Scanner kyselija = new Scanner(System.in); 
		System.out.println("Kerro lukualueen yläraja");
        int ylaraja = kyselija.nextInt();
        System.out.println("Kerro lukualueen alaraja");
        int alaraja = kyselija.nextInt();


        while(true) {
            System.out.println("Kerro joku luku");
            int jokuLuku = kyselija.nextInt();
            if(jokuLuku < ylaraja && jokuLuku > alaraja) {
                System.out.println("toimii se");
            }
        }
    }
}
