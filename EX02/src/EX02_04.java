public class EX02_04 {
    public static void main(String[] args) {
        luetteleLukuja();
    }

    static void luetteleLukuja() {
        int jaollinenNeljällä = 1;

        while(jaollinenNeljällä < 1000) {
            if(jaollinenNeljällä % 4 == 0) {
                System.out.println(jaollinenNeljällä);
                jaollinenNeljällä++;
            } else{
                jaollinenNeljällä++;
            }
        }
    }
}
