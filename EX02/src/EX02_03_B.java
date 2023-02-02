import java.util.Scanner;

public class EX02_03_B {
    public static void main(String[] args) {
        luotteleLukuja();
    }

    static void luotteleLukuja() {
        int tuplaavaLuku = 2;

        for(int i  = 0; i < 15; i++) {
            if(tuplaavaLuku < 10000) {
                System.out.println(tuplaavaLuku);
                tuplaavaLuku = tuplaavaLuku * 2;
            }
        }
    }
}
