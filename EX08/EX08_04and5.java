import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EX08_04and5 {
    public static void main(String[] args) throws InterruptedException {
        String fileName = "uutinen.txt";
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));

            String[] words = content.split("[\\s.,?!]+");
            
            for (String word : words) {
                if (word.contains("-")) {
                    System.out.println(word);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}