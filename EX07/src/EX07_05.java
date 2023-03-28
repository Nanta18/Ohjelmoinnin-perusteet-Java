import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX07_05 {
public static void main(String[] args) throws InterruptedException {
    tulostaLuvut("D:/Ohjelmoinnin-perusteet-Java/EX07/src/lukutiedosto.txt");
    laskeKeskiarvo("D:/Ohjelmoinnin-perusteet-Java/EX07/src/lukutiedosto.txt");  
}
      
public static void tulostaLuvut(String osoite) {
    try{
        BufferedReader lukija = new BufferedReader(new FileReader(osoite));
        String rivi = "";
        while ((rivi = lukija.readLine()) != null) {
            System.out.println(rivi);
        }
        lukija.close();
    } catch (IOException e) {
        e.printStackTrace();
        }
    }

public static void laskeKeskiarvo(String osoite) { 
    try (BufferedReader br = new BufferedReader(new FileReader(osoite))) {
        int summa = 0;
        int riviMaara = 0;

        String rivi;
        while ((rivi = br.readLine()) != null) {
            riviMaara++;
            summa += Integer.parseInt(rivi.trim());
        }

        int keskiarvo = summa / riviMaara;
        System.out.println("Keskiarvo: " + keskiarvo);

    } catch (IOException e) {
        e.printStackTrace();
        }
    }    
}