public class EX05_09 {
    public static void main(String[] args) throws InterruptedException {
        String merkkijono = "moi mitä kuulu, onko ulkona kiva sää vai ei?";
        tulostaVokaaliAlkuiset(merkkijono);
        }
     

    public static void tulostaVokaaliAlkuiset(String mjono) {
        String[] sanat = mjono.split(" "); // jaetaan lause sanoiksi

        for (String sana : sanat) {
            if (!sana.isEmpty()) {
                char ekaKirjain = Character.toLowerCase(sana.charAt(0)); // otetaan eka kirjain ja muutetaan pieneksi
                if (ekaKirjain == 'a' || ekaKirjain == 'e' || ekaKirjain == 'i' || ekaKirjain == 'o' || ekaKirjain == 'u' || ekaKirjain == 'y' || ekaKirjain == 'ä' || ekaKirjain == 'ö') {
                    System.out.println(sana);
                }
            }
        }
    }
}