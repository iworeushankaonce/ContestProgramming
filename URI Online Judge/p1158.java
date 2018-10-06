import java.util.Scanner;
public class p1158 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a,b;
		int sum = 0,j = 0,c = 1;
		while(c <=n){
			a = input.nextInt();
			b = input.nextInt();
			for(int i = a;j<b;++i){
				
				if(i%2!=0){
					sum+=i;
					j++;
				}
			}
			System.out.println(sum);
			sum = 0;j = 0;
			
			c++;
		}
	}
}
