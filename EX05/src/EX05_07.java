public class EX05_07 {
    public static void main(String[] args) throws InterruptedException {
        String jono1 = "Kissa";
        String jono2 = "kassi";
        
        if(onAnagrammit(jono1, jono2)) {
            System.out.println(jono1 + " ja " + jono2 + " ovat anagrammit.");
        } else {
            System.out.println(jono1 + " ja " + jono2 + " eivät ole anagrammit.");
        }
        
    }   

    public static boolean onAnagrammit(String jono1, String jono2) {
        if(jono1.length() != jono2.length()) {  //eripituiset sanat eivät voi olla anagrammeja
            return false;
        }
        
        int[] kirjaimet = new int[256]; //Lasektaa kirjainten määrän
        for (int i = 0; i < jono1.length(); i++) {
            jono1 = jono1.toLowerCase();    //Muuntaa kaikki merkit lowercase merkeiksi
            jono2 = jono2.toLowerCase();

            kirjaimet[jono1.charAt(i)]++;
            kirjaimet[jono2.charAt(i)]--;
        }

        for (int lukumaara : kirjaimet) {
            if (lukumaara != 0) {         //Jos joku ei ole 0 tiettyä kirjainta ei ole yhtä montaa molemmissa sanoissa
                return false;
        }
    }
        return true;
    }
}
