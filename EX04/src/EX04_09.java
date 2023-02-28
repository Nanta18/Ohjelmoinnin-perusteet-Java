import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EX04_09 {
public static void main(String[] args) throws InterruptedException {

List<Integer> lottoLuvut = lukujenArpoja();
List<Integer> jarjestetytLottoLuvut = lukujenJarjestaja(lottoLuvut);

lukujenTulostaja(jarjestetytLottoLuvut);
}

static List<Integer> lukujenArpoja() {
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

static List<Integer> lukujenJarjestaja(List<Integer> lottoLuvut) {
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
}