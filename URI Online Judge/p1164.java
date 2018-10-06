import java.util.*;
public class p1164 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a,sum = 0;
		for(int i = 1;i<=n;++i){
			sum = 0;
			a = input.nextInt();
			for(int j = 1;j<a;++j){
				if(a%j==0){
					sum+=j;
				}
			}
			if(sum==a){
				System.out.println(a + " eh perfeito");
			} else {
				System.out.println(a+" nao eh perfeito");
			}
		}
	}
}
