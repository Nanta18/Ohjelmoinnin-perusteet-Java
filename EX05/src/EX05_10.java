public class EX05_10 {
    public static void main(String[] args) throws InterruptedException {
        String jono1 = "kissa";
        String jono2 = "kassi";

        onSamojaIndekseissa(jono1, jono2);
    }

    public static void onSamojaIndekseissa(String jono1, String jono2) {
        // Tarkistetaan, että jonot on saman pituisia
        if (jono1.length() != jono2.length()) {
            System.out.println("Merkkijonot eivät ole saman pituisia.");
            return;
        }

        // Käydään läpi merkkijonojen merkit indekseittäin
        for (int i = 0; i < jono1.length(); i++) {
            char merkki1 = jono1.charAt(i);
            char merkki2 = jono2.charAt(i);

        if (merkki1 == merkki2) {
            System.out.println(merkki1 + ":" + i);
            }
        }
    }
}