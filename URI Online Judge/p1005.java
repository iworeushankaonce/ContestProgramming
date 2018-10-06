import java.util.*;

public class p1005 {
	public static void main(String[] args){
		Scanner tremd = new Scanner(System.in);
		
		double a = tremd.nextDouble();
		double b = tremd.nextDouble();
		
		double MEDIA = ((a*3.5)+(b*7.5))/(3.5+7.5);
			
		System.out.printf("MEDIA = %.5f\n" , MEDIA );
	
	}
}
