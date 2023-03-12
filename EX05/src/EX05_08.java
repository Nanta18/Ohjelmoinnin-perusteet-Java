public class EX05_08 {
    public static void main(String[] args) throws InterruptedException {
        String merkkijono = "hello world, how are you doing?";
        System.out.println(kapitalisoi(merkkijono));
    }  

    public static String kapitalisoi(String merkkiJono) {
        String[] sanat = merkkiJono.split(" "); // jaetaa lause sanoiksi
        StringBuilder uusiMerkkiJono = new StringBuilder();
        for (int i = 0; i < sanat.length; i++) {
            String sana = sanat[i];
            if (!sana.isEmpty()) {
                char[] kirjaimet = sana.toCharArray();
                kirjaimet[0] = Character.toUpperCase(kirjaimet[0]); // kapitalisoidaan eka kirain
                uusiMerkkiJono.append(new String(kirjaimet)); // lisätään kapitalisoitu sana uuteen merkkijonoon
                if (i < sanat.length - 1) {
                    uusiMerkkiJono.append(" "); // lisätään välilyönti takas sanojen väliin
                }
            }
        }
        return uusiMerkkiJono.toString();
    }
}
