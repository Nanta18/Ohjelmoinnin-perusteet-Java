public class EX05_01 {
    public static void main(String[] args) throws InterruptedException {
        String jono = "Hello wordl!";
        char merkki = 'l';
        System.out.println("kirjain " + merkki + " esiintyy " + laskeKirjaimet(jono, merkki) + " kertaa.");;
    }

    public static int laskeKirjaimet(String jono, char merkki) {
        int esiintyy = 0;
        for(int i = 0; i < jono.length(); i++) {
            if(jono.charAt(i) == merkki) {
                esiintyy++;
            }
        }
        return esiintyy;
    }
}