import java.util.Scanner;

public class p1145 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		for (int i = 1; i <= b; i+=a) {
			
			for (int j = 0; j < a; ++j) {
				if(j == a-1){
					System.out.printf("%d",(i+j));
				}else{
				System.out.printf("%d ",(i+j));
				}
				}
			System.out.println();
		}
	}
}
