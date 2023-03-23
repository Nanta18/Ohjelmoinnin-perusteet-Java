import java.util.Scanner;

public class EX06_10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner kyselija = new Scanner(System.in);

        System.out.print("Anna taulukon koko: ");
        int koko = kyselija.nextInt();
    
        char[] taulukko = new char[koko];   //Luodaan taulukko
    
        System.out.print("Anna lause: ");
        String lause = kyselija.next();
        
        try {
            // Tallennetaan lause taulukkoon
            for (int i = 0; i < lause.length(); i++) {
              taulukko[i] = lause.charAt(i);
            }
            System.out.println("Taulukko: " + new String(taulukko));
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lause on liian pitkä taulukolle.");
        }
    }
}