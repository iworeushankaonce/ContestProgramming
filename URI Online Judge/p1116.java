import java.util.*;

public class p1116 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0;i<n;++i){
			int x = input.nextInt();
			int y = input.nextInt();
			if(y==0){
				System.out.println("divisao impossivel");continue;
			}
			
			System.out.println((double)x/y);
			
		}
	}
}
