import java.util.*;
import java.util.Locale;

public class p1006 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		double MEDIA = ((a*2.0)+(b*3.0)+(c*5.0))/(2.0+3.0+5.0);
			
		System.out.printf("MEDIA = %.1f" , MEDIA );
	
	}
}
