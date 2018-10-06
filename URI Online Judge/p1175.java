
import java.util.Scanner;
public class p1175 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int j = 0;
		int[] array = new int[20];
		for(int i = 0; i < 20; i++)
		{
			array[i] = input.nextInt();
		}
		
		
		for(int i = 19; i >= 0; i--)
		{
			System.out.printf("N[%d] = %d\n", j, array[i]);
			++j;
		}
	}
	
}
