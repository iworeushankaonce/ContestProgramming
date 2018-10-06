import java.util.*;
import java.text.DecimalFormat;
public class p1008 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int hours = input.nextInt();
		float am = input.nextFloat();
		DecimalFormat f = new DecimalFormat("#.00");
		float sum = am * hours; 
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + f.format(sum));
		
		
	}
}
