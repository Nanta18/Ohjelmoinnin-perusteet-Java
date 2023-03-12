public class EX05_06 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(onAnagrammit("kissa", "kassi"));
    }   

    public static boolean onAnagrammit(String jono1, String jono2) {
        if(jono1.length() != jono2.length()) {  //eripituiset sanat eivät voi olla anagrammeja
            return false;
        }
        
        int[] kirjaimet = new int[256]; //Lasektaa kirjainten määrän
        for (int i = 0; i < jono1.length(); i++) {
            kirjaimet[jono1.charAt(i)]++;
            kirjaimet[jono2.charAt(i)]--;
        }

        for (int lkm : kirjaimet) {
            if (lkm != 0) {         //Jos joku ei ole 0 tiettyä kirjainta ei ole yhtä montaa molemmissa sanoissa
                return false;
        }
    }
        return true;
    }
}
