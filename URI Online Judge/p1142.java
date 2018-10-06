import java.util.Scanner;

public class p1142 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int c = 1;
		for (int i = 0; i < n; ++i) {

			System.out.printf("%d %d %d", c, c + 1, c + 2);

			c += 4;

			System.out.printf(" PUM\n");
		}
	}
}
