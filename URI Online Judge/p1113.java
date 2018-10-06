import java.util.*;

public class p1113 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		while (a != b) {
			if (a > b) {
				System.out.println("Decrescente");
			}
			if(a<b){
				System.out.println("Crescente");
			}
			a = input.nextInt();
			b = input.nextInt();
			
		}
	}
}
