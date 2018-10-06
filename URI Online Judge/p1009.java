import java.util.*;
import java.text.DecimalFormat;
public class p1009 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		double fix = input.nextDouble();
		double sold = input.nextDouble();
		
		double total = fix + (sold/100.00*15.00);
		DecimalFormat f = new DecimalFormat("#.00");
		
		System.out.println("TOTAL = R$ " + f.format(total));
		
		
	}
}
