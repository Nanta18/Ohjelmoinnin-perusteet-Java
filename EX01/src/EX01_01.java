public class EX01_01 {

	public static void main(String[] args) {

		int a = 5;
		int b = 3;
		boolean pariton = true;
		boolean onkoNollaTaiKuusiEiMolemmat = true;
		boolean vikaTehtäväBoolean = true;
		
	
		// tehtävä e
		if((a % 2)== 1){
			pariton = true;
		} else {
			pariton = false;
		}
		
		//tehtävä h
		if((a == 0) == true && (b == 6) == true) {
			onkoNollaTaiKuusiEiMolemmat = false;
		} else if (a == 0 || b == 6) {
			onkoNollaTaiKuusiEiMolemmat = true;
		} else {
			onkoNollaTaiKuusiEiMolemmat = false;
		}
		
		
		if((a == b) == true && ((a/b) % 2 == 0) && a != 0 && b != 0) {
			vikaTehtäväBoolean = true;
		} else {
			vikaTehtäväBoolean = false;
		}
		
		System.out.println("a. " + (a > 10));
		System.out.println("b. " + (a < b));
		System.out.println("c. " + (0 < a && a < 15));
		System.out.println("d. " + (0 < a && b < 15));
		System.out.println("e. " + (pariton));
		System.out.println("f. " + (a > 0 && b > 0));
		System.out.println("g. " + (a > b && a < 100 && b < 50));
		System.out.println("h. " + (onkoNollaTaiKuusiEiMolemmat));
		System.out.println("i. " + (vikaTehtäväBoolean));
		
		
	}

}
