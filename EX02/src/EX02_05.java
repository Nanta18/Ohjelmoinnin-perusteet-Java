import java.util.Scanner;

public class EX02_05 {
    public static void main(String[] args) {
        kokeileLukualue();
    }

    static void kokeileLukualue() {
        Scanner kyselija = new Scanner(System.in); 
		System.out.println("Kerro lukualueen yläraja");
        int ylaraja = kyselija.nextInt();                       //Kysytään yläraja
        System.out.println("Kerro lukualueen alaraja");
        int alaraja = kyselija.nextInt();                       //Kysytään alaraja


        while(true) {
            System.out.println("Kerro joku luku");      
            int jokuLuku = kyselija.nextInt();                  //kysytään joku luku
            if(jokuLuku < ylaraja && jokuLuku > alaraja) {      //jos luku on rajojen välissä jatketaan eteenpäin
                if(jokuLuku < ((ylaraja + alaraja) / 2)) {       //jos luku on lähempänä alarajaa jatketaan
                    System.out.println("Anna kolme negatiivista numeroa");
                    int luku1 = kyselija.nextInt();
                    int luku2 = kyselija.nextInt();
                    int luku3 = kyselija.nextInt();

                    int summa = luku1 + luku2 + luku3;
                    System.out.println("Lukujen summa on" + summa);  //Tulostetaan lukujen summa
                    kyselija.close();
                    break;
                } else {
                    kyselija.close();
                    break;
                } 
            }
        }
    }
}
