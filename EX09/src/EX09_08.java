public class EX09_08 {
    public static void main(String[] args) {
        int[][] maara = new int[4][1];
        for (int i = 0; i < 120; i++) {
            double randomNumber = Math.random() * 101;
            int randomInt = (int) randomNumber;
            switch (randomInt / 25) {
                case 0:
                    maara[0][0]++;
                    break;
                case 1:
                    maara[1][0]++;
                    break;
                case 2:
                    maara[2][0]++;
                    break;
                case 3:
                    maara[3][0]++;
                    break;
            }
        }
        System.out.println("0-25: " + maara[0][0]);
        System.out.println("26-50: " + maara[1][0]);
        System.out.println("51-75: " + maara[2][0]);
        System.out.println("76-100: " + maara[3][0]);
    }
}
