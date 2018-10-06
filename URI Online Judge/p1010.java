import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
public class p1010 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int code1 = input.nextInt();
			int units1 = input.nextInt();
				float cost1 = input.nextFloat();
		
		int code2 = input.nextInt();
			int units2 = input.nextInt();
				float cost2 = input.nextFloat();
				
				DecimalFormat f = new DecimalFormat("#.00");
		float sum = (units1 * cost1) + (units2 * cost2);
		System.out.println("VALOR A PAGAR: R$ " + f.format(sum));
	
	}

}
