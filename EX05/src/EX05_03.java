import java.util.Scanner;

public class EX05_03 {
public static void main(String[] args) throws InterruptedException {
Scanner kyselija = new Scanner(System.in);
String kayttajanString = kyselija.nextLine();
System.out.println(stringTakaperin(kayttajanString));
kyselija.close();
}

public static String stringTakaperin(String kayttajanString) {
    char[] merkit = kayttajanString.toCharArray();
    int pituus = merkit.length;

    for (int i = 0; i < pituus / 2; i++) {
        char temp = merkit[i];
        merkit[i] = merkit[pituus - i - 1];
        merkit[pituus - i - 1] = temp;
    }

    String takaperin = new String(merkit);
    return takaperin;
    }
}