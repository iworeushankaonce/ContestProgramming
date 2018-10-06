import java.util.*;
public class p1117 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = 0;
		double res = 0;
		while(n<2){
			double a = input.nextDouble();
			
			if(a <= 10.0 && a >= 0.0){
				res = res+a;
				n++;
				
			}else{
			System.out.println("nota invalida");
			}
			}
		System.out.println("media = "+res/2);
	}
}
