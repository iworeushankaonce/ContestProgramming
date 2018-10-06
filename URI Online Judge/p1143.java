import java.util.Scanner;
public class p1143 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	
		for (int i = 1; i <= n; ++i) {
			
			System.out.printf("%d %d %d\n", i, i*i, (i*i)*i);


		}

	}

}
