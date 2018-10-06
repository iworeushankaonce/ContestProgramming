import java.util.Scanner;
public class p1172 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] n = new int[10];
		for (int i = 0;i<10;++i){
			n[i] = input.nextInt();
			if(n[i]<=0){
				n[i]=1;
			}
		}
		for(int i = 0;i<10;i++){
			System.out.printf("X[%d] = %d\n", i, n[i]);
		}
	
	}
}
