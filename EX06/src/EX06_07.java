public class EX06_07 {
public static void main(String[] args) throws InterruptedException {
    int tähtienLkm = 1;
    String mjono = "Ankka nimeltä  Anselmi  aloittelee  uintia  lammella.";

   for (String sana : mjono.split(" ")) {   //Jakaa lauseen space merkkien avulla sanoihin ja käy jokaisen niistä läpi
       if (sana.toLowerCase().startsWith("a")) {    //muuttaa alkukirjaimen pieneksi ja jatkaa jos se on a
           System.out.print("*".repeat(tähtienLkm) + sana.substring(1));    //tulostaa * ja sanan loppuosan 
           tähtienLkm++;
       } else {
           System.out.print(sana);
       }
        System.out.print(" "); //Lisää space merkit sanojen väliin takaisin
        }
    }
}