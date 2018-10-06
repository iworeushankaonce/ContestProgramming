import java.util.Scanner;
public class p1173 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] x = new int[10];
		int j = 0;
		for(int i = n;j<10;i*=2){
			System.out.printf("N[%d] = %d\n",j,i);
			++j;
		}
	}
}
