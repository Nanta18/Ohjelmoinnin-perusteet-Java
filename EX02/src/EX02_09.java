public class EX02_09 {
    public static void main(String[] args) {
        kymmenenKertotaulu();
    }

    public static void kymmenenKertotaulu() {
        int kerroin = 1;

        for(int i = 0; i < 10; i++){
            System.out.println(kerroin + "*10=" + kerroin*10);
            kerroin++;
        }
    }
}
