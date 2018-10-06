import java.util.*;

public class p1074 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a = input.nextInt();
			if (a != 0) {
				if (a < 0) {
					if (a % 2 == 0) {
						System.out.println("EVEN NEGATIVE");
					} else {
						System.out.println("ODD NEGATIVE");
					}
				} else if(a % 2 == 0) {
					System.out.println("EVEN POSITIVE");
				} else {
					System.out.println("ODD POSITIVE");
			}
		} else {System.out.println("NULL");}
	}
}
}