import java.util.Scanner;
public class p1159 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int sum = 0,j = 0;
		while(a != 0){
			for(int i = a;j<5;++i){
				
				if(i%2==0){
					sum+=i;
					j++;
				}
			}
			System.out.println(sum);
			sum = 0;j = 0;
			a = input.nextInt();
		}
	}
}
