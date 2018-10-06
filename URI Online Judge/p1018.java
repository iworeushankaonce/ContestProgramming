import java.util.*;

public class p1018 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int c100 = n/100;
		int c50 = n%100 /50;
		int c20 = n%100%50 / 20;
		int c10 = n%100%50%20 / 10;
		int c5 = n%100%50%20%10/5;
		int c2 = n%100%50%20%10%5 /2;
		int c1 = n%100%50%20%10%5%2;
		System.out.println(n);
		System.out.printf("%d nota(s) de R$ 100,00\n" , c100);
		System.out.printf("%d nota(s) de R$ 50,00\n" , c50);
		System.out.printf("%d nota(s) de R$ 20,00\n" , c20);
		System.out.printf("%d nota(s) de R$ 10,00\n" , c10);
		System.out.printf("%d nota(s) de R$ 5,00\n" , c5);
		System.out.printf("%d nota(s) de R$ 2,00\n" , c2);
		System.out.printf("%d nota(s) de R$ 1,00\n" , c1);
	
	}
}
