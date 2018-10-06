import java.util.*;

public class p1115 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		while (x != 0 || y != 0) {
			
			if(x > 0 && y > 0){
				System.out.println("primeiro");
			}
			if(x > 0 && y < 0){
				System.out.println("quarto");
			}
			if(x < 0 && y < 0){
				System.out.println("terceiro");
			}
			if(x < 0 && y > 0){
				System.out.println("segundo");
			}
			x = input.nextInt();
			y = input.nextInt();
			
			if(x==0 || y==0){
				break;
			}
			
			
		}
	}
}
