import java.util.Scanner;

public class p1146 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		while (n != 0) {
			for (int i = 1; i <= n; i++) {
				if (i != n) {
					System.out.print(i + " ");
				} else {
					System.out.print(i);
				}

			}
			System.out.println();
			n = input.nextInt();
		}
	}

}
