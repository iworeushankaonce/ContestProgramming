import java.util.Locale;
import java.util.Scanner;

public class p1094 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int r = 0, c = 0, s = 0;
		for (int i = 0; i < n; ++i) {

			int an = input.nextInt();
			String name = input.next();
			switch(name){
			case "C":{	c += an;break;}
			case "R":{	r += an;break;}
			case "S":{	s += an;break;}
			
			}
		}
		int total = c + r + s;
		System.out.printf("Total: %d cobaias\n", total);
		System.out.printf("Total de coelhos: %d\n", c);
		System.out.printf("Total de ratos: %d\n", r);
		System.out.printf("Total de sapos: %d\n", s);

		System.out.printf("Percentual de coelhos: %.2f", (double)(c*100)/total);System.out.println(" %");
		System.out.printf("Percentual de ratos: %.2f",  (double)(r*100)/total);System.out.println(" %");
		System.out.printf("Percentual de sapos: %.2f",  (double)(s*100)/total);System.out.println(" %");
	}
}
