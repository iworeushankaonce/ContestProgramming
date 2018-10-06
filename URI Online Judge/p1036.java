import java.util.*;
public class p1036 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
			if (a ==0){
				System.out.println("Impossivel calcular");
			} else{
			double D = b*b - 4*a*c;
			if (D>=0){
			double R1 =( -b + Math.sqrt(D)) / (2*a);
			double R2 =( -b - Math.sqrt(D)) / (2*a);
		
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
			}
			else {
				System.out.println("Impossivel calcular");
			
			}
		}
	}
}
