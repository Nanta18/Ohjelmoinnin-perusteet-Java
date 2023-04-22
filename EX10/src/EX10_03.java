import java.util.Scanner;

public class EX10_03 {
    public static void main(String[] args) {
        Scanner kyselija = new Scanner(System.in);

      double pituus = kysyNumero(kyselija);
      int tyyppi = kysyTyyppi(kyselija);

      muutaMuiksi(pituus, tyyppi);
      
    }

    public static double kysyNumero(Scanner kyselija) {
        System.out.println("Anna pituus");
        String numeroStr = kyselija.nextLine();
        double numeroInt = Integer.parseInt(numeroStr);
        return numeroInt;
    }

    public static int kysyTyyppi (Scanner kyselija) {
        System.out.println("Missä muodossa pituus on?");
        System.out.println("1. Sentteinä (cm)");
        System.out.println("2. Jalkoina (ft)");
        System.out.println("3. Tuumina (in)");
        String tyyppiStr = kyselija.nextLine();
        int tyyppiInt = Integer.parseInt(tyyppiStr);
        return tyyppiInt;
    }

    public static void muutaSenteistä (double pituus, int tyyppi) {
        double jaloiksi = pituus *  0.032808;
        double tuumiksi = pituus * 0.3937;
        System.out.println("Annettu luku " + pituus + "cm");
        System.out.println("Jalkoina: " + jaloiksi);
        System.out.println("Tuumina: " + tuumiksi);
        }

    public static void muutaTuumista (double pituus, int tyyppi) {
        double jaloiksi = pituus * 0.083333;
        double senteiksi = pituus / 0.3937;
        System.out.println("Annettu luku " + pituus + "in");
        System.out.println("Jalkoina: " + jaloiksi);
        System.out.println("Sentteinä: " + senteiksi );
        }

    public static void muutaJaloista (double pituus, int tyyppi) {
        double tuumiksi = pituus * 12.000;
        double senteiksi = pituus * 30.48;
        System.out.println("Annettu luku " + pituus + "ft");
        System.out.println("Sentteinä: " + senteiksi);
        System.out.println("Tuumina: " + tuumiksi );
        }

    public static void muutaMuiksi(double pituus, int tyyppi) {
        if(tyyppi == 1) {
            muutaSenteistä(pituus, tyyppi);
        } else if (tyyppi == 2) {
            muutaJaloista(pituus, tyyppi);
        } else if (tyyppi == 3) {
            muutaTuumista(pituus, tyyppi);
        }
    }
}
