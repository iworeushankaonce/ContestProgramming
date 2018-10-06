import java.util.Scanner;

public class p1149 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		while(b<=0){
		b = input.nextInt();
		}
		int sum = 0;
		for(int i = a;i<(a+b);i++){
			sum+=i;
			
			
		}
		System.out.println(sum);
	}
}
