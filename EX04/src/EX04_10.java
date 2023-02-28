import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EX04_10 {
public static void main(String[] args) throws InterruptedException {

List<Integer> lottoLuvut = lukujenArpoja();
List<Integer> jarjestetytLottoLuvut = lukujenJarjestaja(lottoLuvut);
List<Integer> kayttajanLottoLuvut = lukujenJarjestaja(kysyKayttajanLottoNumerot());

lukujenTulostaja(jarjestetytLottoLuvut);

montakoOikein(jarjestetytLottoLuvut, kayttajanLottoLuvut);
}

public static List<Integer> kysyKayttajanLottoNumerot() {
    try (Scanner kyselija = new Scanner(System.in)) {
    List<Integer> kayttajanNumerot = new ArrayList<>();

    System.out.println("Anna lottonumerot 1-40 väliltä (7 kpl)");

for(int i = 0; i < 7; i++) {
    int numero = kyselija.nextInt();
    if (numero < 1 || numero > 40) {
        System.out.println("Virheellinen numero, anna luku väliltä 1-40.");
        i--; // Looppi menee takaisinpäin jos luku on rajojen ulkopuolelta
        continue; // Jos luku on hyväksytty jatketaan
        }
        kayttajanNumerot.add(numero);
        }
        return kayttajanNumerot;
    }
}

public static List<Integer> lukujenArpoja() {
    Random arvoLuku = new Random();
    List<Integer> lottoLuvut = new ArrayList<>();

        while(lottoLuvut.size() < 7) {
            int arvottuLuku = arvoLuku.nextInt(40) + 1;
            boolean numeroListalla = false;

            for(int numero : lottoLuvut) {
                if (numero == arvottuLuku) {
                    numeroListalla = true;
                    break;
                }
            }

            if(!numeroListalla) {
                lottoLuvut.add(arvottuLuku);
            }
        }
        return lottoLuvut;     
    } 

public static List<Integer> lukujenJarjestaja(List<Integer> lottoLuvut) {
    List<Integer> jarjestetytLottoLuvut = lottoLuvut;
    Collections.sort(jarjestetytLottoLuvut, Collections.reverseOrder());
    return jarjestetytLottoLuvut;
    }

static void lukujenTulostaja(List<Integer> jarjestetytLottoLuvut) {
    System.out.println("Lottoluvut ovat:");
    for (int i = jarjestetytLottoLuvut.size() - 1; i >= 0; i--) {
        System.out.println(jarjestetytLottoLuvut.get(i));
        }
    }
static public void montakoOikein(List<Integer> oikeatNumerot, List<Integer> kayttajanNumerot) {
    int oikeinMaara = 0;
        for (int i = 0; i < oikeatNumerot.size(); i++) {
            if (kayttajanNumerot.contains(oikeatNumerot.get(i))) {
                oikeinMaara++;
            }
        }
        System.out.println("Oikeita lottonumeroita: " + oikeinMaara + " kpl");

    }
}