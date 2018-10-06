import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class p1174 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double[] n = new double[100];
		for (int i = 0; i < 100; ++i) {
			n[i] = input.nextDouble();

		}
		for (int i = 0; i < 100; ++i) {
			if (n[i] <= 10) {

				
				System.out.printf("A[%d] = %.1f\n", i, n[i]);
			}
		}
	}
}
