public class EX04_04 {
    public static void main(String[] args) throws InterruptedException {
        int rivit = 3;
        int sarakkeet = 2;

        int[][] taulukko = new int[rivit][sarakkeet];

        taulukko[0][0] = 11;
        taulukko[0][1] = 0;
        taulukko[1][0] = 7;
        taulukko[1][1] = 6;
        taulukko[2][0] = 42;
        taulukko[2][1] = 1;

       System.out.println("Taulukon suurin luku on " + haeMaximi(taulukko));
       System.out.println("Taulukon nelioiden summa on " + haeNelioidenSummat(taulukko));

       int tutkittuNumero = 0;
       if(onkoTaulukossa(taulukko, tutkittuNumero)) {
            System.out.println("Taulukossa on " + tutkittuNumero);
       } else {
            System.out.println("Taulukossae ei ole " + tutkittuNumero);
       }

       if(esiintyykoUseasti(taulukko)) {
        System.out.println("Taulukossa on arvo joka esiinty useasti");
       } else{
        System.out.println("Taulukossa ei ole arvoa joka esiinty useasti");
       }

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

    public static int haeNelioidenSummat(int[][] taulukko) {
        int nelioidenSumma = 0;

        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
              int alkio = taulukko[i][j];
              int nelio = alkio * alkio;
              nelioidenSumma += nelio;
            }
          }

        return nelioidenSumma;
    }

    public static boolean onkoTaulukossa(int[][] taulukko, int tutkittuNumero) {
        boolean sisaltaa = false;

        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                if (taulukko[i][j] == tutkittuNumero) {
                    sisaltaa = true;
                    break;
                }
            }
        }
        return sisaltaa;
    }

    public static boolean esiintyykoUseasti(int[][] taulukko) {
        boolean esiintyyUseasti = false;

        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
            int currentNumber = taulukko[i][j];
            int count = 0;
            for (int k = 0; k < taulukko.length; k++) {
                for (int l = 0; l < taulukko[k].length; l++) {
                    if (taulukko[k][l] == currentNumber) {
                        count++;
                        }
                    if (count >= 2) {
                        esiintyyUseasti = true;
                        break;
                        }
                    }
                if (esiintyyUseasti) {
                    break;
                    }
                }
            }
        if (esiintyyUseasti) {
            break;
            }
        }
        return esiintyyUseasti;
    }
}