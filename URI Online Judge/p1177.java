import java.util.*;

public class p1177 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int x[] = new int[1000];
		int k = 0;
		for (int i = 0; i < 1000; i++) {
			k = i % t;
			System.out.println("N[" + i + "] = " + k);

		}
	}
}