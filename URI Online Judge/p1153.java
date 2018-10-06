import java.util.Scanner;

public class p1153 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int res = 1;
		for (int i = 1; i <= x; ++i) {
			res = res*i;
		}
		System.out.println(res);
	}
}
