	import java.util.*;
	
	public class p1099 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
	
			for (int i = 0; i < n; ++i) {
				int sum = 0;
				int a = input.nextInt();
				int b = input.nextInt();
	
				if (a > b) {
					for (int j = b + 1; j < a; ++j) {
						if (j % 2 != 0) {
							sum += j;
						}
	
					}
				}
				if (a < b) {
					for (int j = a + 1; j < b; ++j) {
						if (j % 2 != 0) {
							sum += j;
						}
					}
				}
				System.out.println(sum);
			}
		}
	}
