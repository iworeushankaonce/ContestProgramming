import java.util.Scanner;

public class p1132 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = 0;
		
		if (a > b) {
			for (int i = b; i <= a; ++i) {
				if(i%13!=0){
					sum+=i;
				}
			}
		}
		if (a < b) {
			for (int i = a; i <= b; ++i) {
				if(i%13!=0){
					sum+=i;
				}
			}

		}
		System.out.println(sum);
	}
}
