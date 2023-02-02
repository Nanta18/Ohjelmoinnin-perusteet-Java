public class EX02_08 {

public static void main(String[] args) {
    lukuArpoja();
}
    static void lukuArpoja() {
        
        int lukujenMaara = 0;
        int summa = 0;
        int parilliset = 0;
        int parittomat = 0;

        while(true) {
            int randomLuku = (int)(Math.random() *100 + 1);         //Antaa random numeron

            if(randomLuku > 9){                                           //Tarkistaa onko luku pienempi kuin 9
                lukujenMaara++;                                     //Lisää yhden lukujen määrään
                summa = summa + randomLuku;                         //Laskee lukujen summan

                if(randomLuku % 2 == 0) {                                 //Tarkistaa onko luku parillinen
                    parilliset++;                                   //Lisää yhden parillisten määrään
                } else {
                    parittomat++;                                   //Lisää yhden parittomien määrään
                }

            } else {
                System.out.println("");
                System.out.println("Lukujen määrä " + lukujenMaara);
                System.out.println("Lukujen summa " + summa);
                System.out.println("Lukujen keskiarvo " + (summa / lukujenMaara));

                if(randomLuku % 2 == 0) {                    // Jos parillinen tulostaa nämä
                    System.out.println("Parlillisten lukujen määrä " + parilliset);
                    break;
                } else {
                    System.out.println("Parittomien lukujen määrä " + parittomat);
                    break;
                }
            }
        }
    }
} 
