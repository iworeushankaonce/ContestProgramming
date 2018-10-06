import java.util.Scanner;
public class p1154 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a =  input.nextInt();
		double res = 0;
		int sum = 0;
		while(a>=0){
			res = res+a;
			 a =  input.nextInt();
			 ++sum;
			
		}
		System.out.printf("%.2f\n",(res/sum));
	}
}
