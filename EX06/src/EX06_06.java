public class EX06_06 {
    public static void main(String[] args) throws InterruptedException {    
        String jono = "djlasihjfgopåmasncaccccacccccacccccaccccacccccccac";
        char merkki = 'a';
        int lkm = 2;
        String aakkosto = "abcdefghijklmnopqrstuvwxyzåäö";
        int maara = laskeSeuraavatKirjaimet(jono, merkki, lkm, aakkosto);
        System.out.println(maara);;
    }

    public static int laskeSeuraavatKirjaimet(String  jono,  char  merkki,  int  lkm,  String aakkosto) {
        int indexi = 0;
        int maara = 0;

        while (indexi < jono.length() - lkm) {
            if (jono.charAt(indexi) == merkki) {
                String substring = jono.substring(indexi + 1, indexi + lkm + 1);
                for (int i = 0; i < aakkosto.length(); i++) {
                    if (substring.indexOf(aakkosto.charAt(i)) != -1) {
                        maara++;
                    }
                }
            }
            indexi++;
        }
        return maara;
    }
}