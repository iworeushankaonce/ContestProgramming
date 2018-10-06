import java.util.Scanner;
public class p1178 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double num = input.nextDouble();
		double[] n = new double[100];
		for(int i = 0;i<100;++i){
			
			n[i] = num;
			num = num/2;
		}
		for(int i = 0;i<100;++i){
			System.out.printf("N[%d] = %.4f\n",i,n[i]);
		}
		
	}
}
