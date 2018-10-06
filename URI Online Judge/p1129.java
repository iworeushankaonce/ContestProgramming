import java.io.*;
import java.util.*;

public class p1129 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int n = Integer.parseInt(br.readLine());
		while (n!=0){
			for(int i = 0;i<n;++i){
		String line = br.readLine();

		StringTokenizer tk = new StringTokenizer(line);
		int A = Integer.parseInt(tk.nextToken());
		int B = Integer.parseInt(tk.nextToken());
		int C = Integer.parseInt(tk.nextToken());
		int D = Integer.parseInt(tk.nextToken());
		int E = Integer.parseInt(tk.nextToken());

		if (A > 127 && B > 127 && C > 127 && D > 127 && E > 127) {
			System.out.println("*");
		} else if ((A <= 127 && B <= 127 || A <= 127 && C <= 127 || A <= 127 && D <= 127 || A <= 127 && E <= 127)
				|| (B <= 127 && C <= 127 || B <= 127 && D <= 127 || B <= 127 && E <= 127)
				|| (C <= 127 && D <= 127 || C <= 127 && E <= 127 || D <= 127 && E <= 127)) {
						System.out.println("*");
		}else if(A<=127 && B>127&& C>127&& D>127&& E>127){
			System.out.println("A");
		}else if(A>127 && B<=127&& C>127&& D>127&& E>127){
			System.out.println("B");
		}else if(A>127 && B>127&& C<=127&& D>127&& E>127){
			System.out.println("C");
		}else if(A>127 && B>127&& C>127&& D<=127&& E>127){
			System.out.println("D");
		}else if(A>127 && B>127&& C>127&& D>127&& E<=127){
			System.out.println("E");
		}
			}
		n = Integer.parseInt(br.readLine());
			
		}
	}
}
