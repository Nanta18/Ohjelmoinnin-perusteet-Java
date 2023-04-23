import java.util.Scanner;
/*
Ohjelma kysyy käyttäjältä pituuden ja yksikön missö pituus on ja konvertoi luvun muihin yksiköihin.
Ohjelmalla voi konvertoida sentit, jalat sekä tuumat. 
 */
public class EX10_03 {
    public static void main(String[] args) {
        Scanner kyselija = new Scanner(System.in);

      double pituus = kysyNumero(kyselija);
      int tyyppi = kysyTyyppi(kyselija);

      muutaMuiksi(pituus, tyyppi);
      
    }

    /**
    Kysyy käyttäjältä double numeron ja palauttaa sen return metodilla
    Parametriin odotetaan Scanner
    @param kyselija scanner objekti
    */ 
    public static double kysyNumero(Scanner kyselija) {
        System.out.println("Anna pituus");
        String numeroStr = kyselija.nextLine();
        double numeroInt = Integer.parseInt(numeroStr);
        return numeroInt;
    }

    /* 
     Kysyy käyttäjältä mittayksikön ja palauttaa sen return metodilla
     parametriin odotetaan Scanner
    */
    public static int kysyTyyppi (Scanner kyselija) {
        System.out.println("Missä muodossa pituus on?");
        System.out.println("1. Sentteinä (cm)");
        System.out.println("2. Jalkoina (ft)");
        System.out.println("3. Tuumina (in)");
        String tyyppiStr = kyselija.nextLine();
        int tyyppiInt = Integer.parseInt(tyyppiStr);
        return tyyppiInt;
    }

    /**
    Muuttaa sentit jaloiksi ja tuumiksi, 
    parametrina odotetaan double jonka arvo on tarkoitus muutta
    @param pituus käyttäjän antama double joka muutetaan muihin mittayksikköihin
    */
    public static void muutaSenteistä (double pituus) {
        double jaloiksi = pituus *  0.032808;
        double tuumiksi = pituus * 0.3937;
        System.out.println("Annettu luku " + pituus + "cm");
        System.out.println("Jalkoina: " + jaloiksi);
        System.out.println("Tuumina: " + tuumiksi);
        }

    /**
    Muuttaa tuumat jaloiksi ja senteiksi,
    parametrina odotetaan double jonka arvo on tarkoitus muutta
    @param pituus käyttäjän antama double joka muutetaan muihin mittayksikköihin
    */
    public static void muutaTuumista (double pituus) {
        double jaloiksi = pituus * 0.083333;
        double senteiksi = pituus / 0.3937;
        System.out.println("Annettu luku " + pituus + "in");
        System.out.println("Jalkoina: " + jaloiksi);
        System.out.println("Sentteinä: " + senteiksi );
        }

    /**
    Muuttaa jalat tuumiksi ja senteiksi,
    parametrina odotetaan double jonka arvo on tarkoitus muutta
    @param pituus käyttäjän antama double joka muutetaan muihin mittayksikköihin
    */
    public static void muutaJaloista (double pituus) {
        double tuumiksi = pituus * 12.000;
        double senteiksi = pituus * 30.48;
        System.out.println("Annettu luku " + pituus + "ft");
        System.out.println("Sentteinä: " + senteiksi);
        System.out.println("Tuumina: " + tuumiksi );
        }

    /**
    Valitsee mittayksikön perusteella mitä metodia konversioon käytetään,
    ja integer josta selviää käyttäjän alkuperäinen yksikkö
    @param pituus on käyttäjän antama double 
    @param tyyppi on käyttäjän antama yksikkö merkattuna integerina
    */
    public static void muutaMuiksi(double pituus, int tyyppi) {
        if(tyyppi == 1) {
            muutaSenteistä(pituus);
        } else if (tyyppi == 2) {
            muutaJaloista(pituus);
        } else if (tyyppi == 3) {
            muutaTuumista(pituus);
        }
    }
}
