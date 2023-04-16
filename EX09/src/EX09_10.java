import java.text.DecimalFormat;

public class EX09_10 {
    public static void main(String[] args) {
        int[] kotiehtäväTehdyt = {10, 10, 10, 10, 10, 10, 10, 8, 10};
        int tehtyYhteensa = 0;
        int maximiMaara = kotiehtäväTehdyt.length * 10;
        for (int tehty: kotiehtäväTehdyt) {
            tehtyYhteensa += tehty;
        }

        double prosentteina = ((double) tehtyYhteensa / maximiMaara) * 100;
        DecimalFormat df = new DecimalFormat("#.#");
        String prosentteinaKorjattu = df.format(prosentteina);
        System.out.println("Tehtäviä tehty yhteensä " + tehtyYhteensa);
        System.out.println("Prosentteina se on " + prosentteinaKorjattu + "%");
    }
}
