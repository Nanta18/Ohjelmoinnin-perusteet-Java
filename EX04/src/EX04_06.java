public class EX04_06 {
    public static void main(String[] args) throws InterruptedException {
        int rivit = 3;
        int sarakkeet = 2;

        int[][] taulukko = new int[rivit][sarakkeet];

        taulukko[0][0] = 0;
        taulukko[0][1] = 2;
        taulukko[1][0] = 5;
        taulukko[1][1] = 7;
        taulukko[2][0] = 12;
        taulukko[2][1] = 17;

        int tutkittuNumero = 2;
        if(onkoTaulukossa(taulukko, tutkittuNumero)) {
            System.out.println("Taulukossa on " + tutkittuNumero);
        } else{
            System.out.println("Taulukossa ei ole " + tutkittuNumero);
        }
        
    }
    public static boolean onkoTaulukossa(int[][] taulukko ,int tutkittuNumero) {

        for (int i = 0; i < taulukko.length; i++) { //Tää kokeilee vuorotellen joka rivin kaikki sarakkeet
            for (int j = 0; j < taulukko[i].length; j++) {  
              if (taulukko[i][j] == tutkittuNumero) {
                return true;
                } else if(taulukko[i][j] > tutkittuNumero) {
                    return false;
                }
                
            }
        }
        return false;
    }
}