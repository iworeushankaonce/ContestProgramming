import java.util.Locale;
import java.util.Scanner;

public class p1021 {
	public static void main(String[] args) {
Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		
		
		System.out.println("NOTAS:");
		System.out.println((int)n/100 + " nota(s) de R$ 100.00");
		System.out.println((int)n%100/50 + " nota(s) de R$ 50.00");
		System.out.println((int)n%100%50/20 + " nota(s) de R$ 20.00");
		System.out.println((int)n%100%50%20/10 + " nota(s) de R$ 10.00");
		System.out.println((int)n%100%50%20%10/5 + " nota(s) de R$ 5.00");
		System.out.println((int)n%100%50%20%10%5/2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println((int)n%100%50%20%10%5%2/1 + " moeda(s) de R$ 1.00");
		
		System.out.println((int)(n*100%100)/50+ " moeda(s) de R$ 0.50");
		
		System.out.println((int)(n*100%100)%50/25+ " moeda(s) de R$ 0.25");
		System.out.println((int)(n*100%100)%50%25/10+ " moeda(s) de R$ 0.10");
		System.out.println((int)(n*100%100)%50%25%10/5+ " moeda(s) de R$ 0.05");
		System.out.println((int)(n*100%100)%50%25%10%5/1+ " moeda(s) de R$ 0.01");
		
	}
}
