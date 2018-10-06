import java.util.*;
public class p1038 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		double res = 0;
		switch(X){
		case 1: res = 4.00*Y;break;
		case 2: res = 4.50*Y;break;
		case 3: res = 5.00*Y;break;
		case 4: res = 2.00*Y;break;
		case 5: res = 1.50*Y;break;
		}
		System.out.printf("Total: R$ %.2f", res);
	}
}
