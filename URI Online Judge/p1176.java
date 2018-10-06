import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class p1176 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i = 0;i<n;++i){
			int a = input.nextInt();
			
			System.out.printf("Fib(%d) = %d\n",a,fibArrFill(a));
		}
	}		

	public static long fibArrFill(int ret) {
		int i = 1;
		long[] fib = new long[61];
		long a = 0, b = 1, c = 0;
		for (i = 1; i <= 60; ++i) {
			a = b;
			b = c;
			c = a + b;
			fib[i] = c;
		}
		return fib[ret];
	}
}
