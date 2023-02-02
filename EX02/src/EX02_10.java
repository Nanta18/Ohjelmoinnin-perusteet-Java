import java.util.Scanner;

public class EX02_10 {
    public static void main(String[] args) {
        fibonaccinLuku();
    }

    public static void fibonaccinLuku() {
        Scanner kyselija = new Scanner(System.in);                          //Luo skanneri
        
        System.out.println("Anna luku ja lasken Fibonaccin luvun");
        int luku = kyselija.nextInt();                                      //kysy luku joka lasketaan
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for(int i = luku - 1; i != 0; i--) {                                //Laske lasku
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        System.out.println("Vastaus: " + n3);                               //Tulosta vastaus
        kyselija.close();

    }
}
