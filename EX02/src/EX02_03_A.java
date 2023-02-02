public class EX02_03_A {
    public static void main(String[] args) {
        luotteleLukuja();
    }

    static void luotteleLukuja() {
        int tuplaavaLuku = 2;

        for(int i  = 0; i < 15; i++) {
            System.out.println(tuplaavaLuku);
            tuplaavaLuku = tuplaavaLuku * 2;
        }
    }
}
