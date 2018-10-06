import java.util.*;

public class p1051 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double answ = 0;
		if (n > 4500) {
			answ = 0.28 * (n - 4500) + (0.18 * 1500) + (0.08 * 1000);
		}
		if (n > 3000) {
			answ = 0.18 * (n-3000) + 0.08 * 1000; 
		}
		if (n>2000 && n<3000){
			answ = 0.08 * (n-2000);
		}
		System.out.println(answ);
	}
}