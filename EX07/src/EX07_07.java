import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EX07_07 {
public static void main(String[] args) throws InterruptedException {
    luoIkkuna();
}
      
public static void luoIkkuna() {
    String yhteystiedot = lueTiedosto("yhteystiedot.txt");

    JFrame ikkuna = new JFrame(yhteystiedot);

    ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea tekstialue = new JTextArea(yhteystiedot);
    tekstialue.setEditable(false);

    JScrollPane rullausJutu = new JScrollPane(tekstialue);
    ikkuna.getContentPane().add(rullausJutu);

    ikkuna.setSize(400, 400);
    ikkuna.setVisible(true);
    ikkuna.setTitle("yhteystiedot");
}

public static String lueTiedosto(String osoite) {
    String yhteystiedot = "";
    try {
        File tiedosto = new File(osoite);
        Scanner lukija = new Scanner(tiedosto);
        while (lukija.hasNextLine()) {
            yhteystiedot += lukija.nextLine() + "\n";
        }
        lukija.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("tiedosto hukassa");
        }
        return yhteystiedot;
    }
}               