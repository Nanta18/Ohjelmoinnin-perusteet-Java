import java.util.Scanner;

public class EX01_06 {
    public static void main(String[] args) {
        lukuSanaksi();
    }      

    public static void lukuSanaksi() {
        Scanner kyselija = new Scanner(System.in);

        System.out.println("Kerro luku 1-3 väliltä");

        while(true) {
            int kayttajaLuku = kyselija.nextInt();

            if(kayttajaLuku == 1) {
                System.out.println("yksi");
                break;
            } else if(kayttajaLuku == 2) {
                System.out.println("kaksi");
                break;
            } else if(kayttajaLuku == 3) {
                System.out.println("kolme");
                break;
            } else {
                System.out.println("Väärä luku");
            }
        }
        kyselija.close();
    }
}


