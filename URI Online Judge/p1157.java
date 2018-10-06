import java.util.Scanner;
public class p1157 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i = 1;i<=n;i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
		
	}
}
