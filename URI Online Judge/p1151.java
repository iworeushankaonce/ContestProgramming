import java.util.Scanner;

public class p1151 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 0, b = 1, c = 0;
		
		for (int i = 1; i <= n; ++i) {
			if (i == n) {
				System.out.println(c);
			} else {
				System.out.print(c + " ");
			}
			
			a = b;
			b = c;
			c = a + b;

		}
	}
}
