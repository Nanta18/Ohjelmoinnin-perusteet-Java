import java.util.Scanner;

public class EX08_09 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int oikeatVastaukset = 0;

        System.out.println("Tervetuloa kertolaskutaitotestiin!");
        System.out.println("Testissä kysytään kertolaskuja 10-kertotaulusta.");

        while (true) {
            int kerroin = 10;
            int kysLuku = (int) (Math.random() * 10) + 1;
            System.out.print(kysLuku + " x " + kerroin + " = ");
            String vastausStr = lukija.nextLine();

            try {
                int vastaus = Integer.parseInt(vastausStr);

                if (vastaus == kysLuku * kerroin) {
                    System.out.println("Oikein!");
                    oikeatVastaukset++;
                } else {
                    System.out.println("Väärin, camaan, tää on kymmenen kertotaulu. Vastaus oli siis " + kysLuku * kerroin);
                }
                System.out.println("Haluuks jatkaa y/n");
                vastausStr = lukija.nextLine();
                if(vastausStr == "n") {
                    break;
                }
            } 
            
            catch (NumberFormatException e) {
                System.out.println("Syötäthän numeron tai kirjoita 'lopeta'.");
            }
            System.out.println("Testi päättyi. Sait " + oikeatVastaukset + " / 10 pistettä.");
        }
    }
}