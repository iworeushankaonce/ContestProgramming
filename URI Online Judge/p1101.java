import java.util.Scanner;

public class p1101 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		while (a != 0 || b != 0) {
			int sum = 0;
		
			
			if(a>b){
				for(int i = b;i<=a;++i){
					sum+=i;
					System.out.print(i+" ");
					
				} System.out.println("Sum="+sum);
				
				
			}
			if(a<b){
				for(int i = a;i<=b;++i){
					sum+=i;
					System.out.print(i+" ");
					
				} System.out.println("Sum="+sum);
			}
			a = input.nextInt();
			b = input.nextInt();
			if(a==0||b==0){
				break;
			}
		}
	}
}
