import java.util.Scanner;

public class EX06_08 {
    public static void main(String[] args) throws InterruptedException {
        Scanner kyselija = new Scanner(System.in);
        int luku = 0;
        boolean hyvaksyttyNumero = false;
        
        while (!hyvaksyttyNumero) {
            System.out.print("Syötä kokonaisluku väliltä [1, 6]: ");
            String kayttajanSyote = kyselija.nextLine();
            
            try {
                luku = Integer.parseInt(kayttajanSyote);
                if (luku >= 1 && luku <= 6) {
                    hyvaksyttyNumero = true;
                } else {
                    System.out.println("Virheellinen syöte. Syötä kokonaisluku väliltä [1, 6].");
                }
            } catch (NumberFormatException e) {
                System.out.println("Virheellinen syöte. Syötä kokonaisluku väliltä [1, 6].");
            }
        }
        
        System.out.println("Syötit luvun " + luku + ".");
        kyselija.close();
        }
    }