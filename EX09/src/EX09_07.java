public class EX09_07 {
    public static void main(String[] args) {
        double randomNumber = Math.random() * 101; //Jos käytettäisiin 100 arvo 100 ei olisi mahdollinen lainkaan mutta näin se on mahdollinen ja intiksi muuttaessa desimaalit katoaa
        int randomInt = (int) randomNumber;
        System.out.println(randomInt);
    }
}
