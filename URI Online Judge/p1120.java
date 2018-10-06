import java.util.*;
import java.io.*;

public class p1120 {
	static int nsum = 0;

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		String line = br.readLine();

		StringTokenizer tk = new StringTokenizer(line);

		String a = tk.nextToken();
		String b = tk.nextToken();

		int aVal = Integer.parseInt(a);
	
			while(aVal != 0 && b.charAt(0) != 0){
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i<b.length();++i){
				if(b.charAt(i) != a.charAt(0)){
					sb.append(b.charAt(i));
					
				if(sb.charAt(0)=='0'){
					sb.deleteCharAt(0);
					}
				}
			}
			if(sb.length()==0){
				sb.append(0);
			}
			System.out.println(sb);
		
			line = br.readLine();

			tk = new StringTokenizer(line);

			a = tk.nextToken();
			 b = tk.nextToken();

			 aVal = Integer.parseInt(a);
			

			
			
			
			
			}
	}
}