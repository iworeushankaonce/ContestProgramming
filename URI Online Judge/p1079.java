import java.util.*;

public class p1079 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; ++i) {
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();

			System.out.printf("%.1f\n", ((a * 2) + (b * 3) + (c * 5)) / 10);
		}
	}
}
