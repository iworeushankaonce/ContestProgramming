import java.util.*;

public class p1182 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		int column = Integer.parseInt(scan.nextLine());
		String n = scan.nextLine();

		for (int i = 0; i < column; i++) {
			scan.nextDouble();
		}

		double sum = 0;
		for (int i = 0; i < 11; i++) {
			sum += scan.nextDouble();
			for (int j = 0; j < 11; j++) {
				scan.nextDouble();
			}
		}
		sum += scan.nextDouble();

		System.out.printf("%.1f\n", "S".equals(n) ? sum : sum / 12);

	}

}