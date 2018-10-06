import java.util.*;
import java.io.*;

public class p1030 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; ++i) {
			String line = br.readLine();
			StringTokenizer tk = new StringTokenizer(line);
			int x = Integer.parseInt(tk.nextToken());
			int y = Integer.parseInt(tk.nextToken());
			
			System.out.printf("Case %d: %d\n", i+1, rem(x,y)+1);
			
		}

	}

	public static int rem(int n, int k) {
		int r = 0;
		for (int i = 2; i <= n; ++i) {
			r = (r + k) % i;
		}

		return r;
	}
}
