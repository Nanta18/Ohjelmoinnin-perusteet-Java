import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EX07_03 {
public static void main(String[] args) throws InterruptedException {
    lueTiedosto("D:/Ohjelmoinnin-perusteet-Java/EX07/src/GameStats.csv");    
    kirjoitaTiedostoon("D:/Ohjelmoinnin-perusteet-Java/EX07/src/GameStats.csv");   
    lueTiedosto("D:/Ohjelmoinnin-perusteet-Java/EX07/src/GameStats.csv"); //Lukee muokatun tiedoston
}

public static void lueTiedosto(String osoite) {
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
    

public static void kirjoitaTiedostoon(String osoite) {
    Scanner kyselija = new Scanner(System.in);
    FileWriter kirjoittaja = null;

    try {
        System.out.println("Pelin nimi:");
        String peli = kyselija.nextLine();

        System.out.println("Tunnit pelissä:");
        String peliTunnit = kyselija.nextLine();

        System.out.println("Saavutettujen saavutusten määrä:");
        String peliSaavutuksetSaadut = kyselija.nextLine();

        System.out.println("Saavutusten maksimimäärä:");
        String peliSaavutuksetMax = kyselija.nextLine();

        kirjoittaja = new FileWriter(osoite, true);
        kirjoittaja.write(peli + ";" + peliTunnit + ";" + peliSaavutuksetSaadut+ ";" + peliSaavutuksetMax + "\n");
        }
        catch(Exception e) {
            System.out.println("Jotaki hajos");
        }
        finally {
            if(kyselija != null) {
                kyselija.close();
            }
            if(kirjoittaja != null) {
                try {
                    kirjoittaja.close();
                } catch (IOException e) {
                    System.out.println("Kirjoittaja hajos");
                }
                
            }
           
        }
    }
}