import java.util.*;
import java.text.DecimalFormat;
public class p1014 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		float y = input.nextFloat();
		float res = x/y;
		DecimalFormat f = new DecimalFormat("#.000");
		System.out.printf(f.format(res)  + " km/l");
		
	}
}
