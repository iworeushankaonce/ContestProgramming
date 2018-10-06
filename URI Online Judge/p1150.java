import java.util.*;
public class p1150 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = a,res = 1,i=a;
		while(b<=a){
			b = input.nextInt();
		}
		while((sum-1)<=b){
			++i;
			res++;
			sum = sum + i;
		}
		System.out.println(res);
	}
}
