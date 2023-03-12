public class EX05_05 {
    public static void main(String[] args) throws InterruptedException {
        String sana1 = "saippuakauppias";
        String sana2 = "kalakauppias";

        tulostaSanat(sana1);
        tulostaSanat(sana2);
    }   

    public static boolean onPalindromi(String sana) {
        String takaperin = new StringBuilder(sana).reverse().toString();
        return sana.equals(takaperin);
    }

    public static void tulostaSanat(String sana) {
        if(onPalindromi(sana)) {
            System.out.println(sana + " on palindromi.");
        } else {
            System.out.println(sana + " ei ole palindromi.");
        }
    }
}
