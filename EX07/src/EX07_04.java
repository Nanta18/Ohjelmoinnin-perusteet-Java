import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EX07_04 {
public static void main(String[] args) throws InterruptedException {
    lueTiedosto("D:/Ohjelmoinnin-perusteet-Java/EX07/src/lukutiedosto.txt", 1);    
}

public static void lueTiedosto(String osoite, int kysyttyRivi) {
    try (BufferedReader br = new BufferedReader(new FileReader(osoite))) {
        String testattavaRivi;
        int rivi = 1;
        while ((testattavaRivi = br.readLine()) != null) {
            if (rivi == kysyttyRivi) {
                int numberOnLine = Integer.parseInt(testattavaRivi.trim());
                System.out.println("Numero rivillä " + kysyttyRivi + " on: " + numberOnLine);
                break;
            }
            rivi++;
        }
    } catch (IOException e) {
        e.printStackTrace();
        }
    }    
}