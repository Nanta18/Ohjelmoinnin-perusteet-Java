public class EX01_10 {
    public static void main(String[] args) {
        testi();
    }

    public static void testi() {

        int i = 20;
        if ( i > 10 && ( 1 / ( 20 - i )) > 1 ) {
            System.out.println("Tämä?");
        } else {
            System.out.println("Vai tämä?");
        }  
    }
}
