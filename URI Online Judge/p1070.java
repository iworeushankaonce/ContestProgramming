import java.util.*;
public class p1070 {
	//ÍÅ ÁĞÀÒÜ ÍÀ ÌÈÄÒÅĞÌ
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i,d=1;
		int x = input.nextInt();
		
		int n = x;
		
		for (i = 1; d<=6;){
			
			int res = ++n;
			if (n%2 != 0){
				++d;
				System.out.println(n);
				
			}
		}
	}
}
