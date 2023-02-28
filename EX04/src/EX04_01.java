public class EX04_01 {
    public static void main(String[] args) throws InterruptedException {
        int rivit = 3;
        int sarakkeet = 2;

        int[][] taulukko = new int[rivit][sarakkeet];

        taulukko[0][0] = 11;
        taulukko[0][1] = 0;
        taulukko[1][0] = 6;
        taulukko[1][1] = 7;
        taulukko[2][0] = 42;
        taulukko[2][1] = 1;

       System.out.println("Taulukon suurin luku on " + haeMaximi(taulukko));

    }
    public static int haeMaximi(int[][] taulukko) {
        
        int max = taulukko[0][0];   //Luo muuttujan johon taulukon suurin luku tullaan tallentamaan
        
        for (int i = 0; i < taulukko.length; i++) { //Tää kokeilee vuorotellen joka rivin kaikki sarakkeet
            for (int j = 0; j < taulukko[i].length; j++) {  
              if (taulukko[i][j] > max) {
                max = taulukko[i][j];   // Jos arvo on isompi kuin max laitaa se max arvon tilalle
                }
            }
        }
        return max;  
    }
}
