import java.io.*;
import java.util.*;

public class p1024 {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.parseInt(br.readLine());
		
		for(int j = 0;j<n;++j){
		String line = br.readLine();
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < line.length(); ++i) {
			if (Character.isLetter(line.charAt(i))) {

				char temp = line.charAt(i);
				temp += 3;
				sb.append(temp);
			} else {
				sb.append(line.charAt(i));
			}
		}
		sb.reverse();
		line = "";
		line = sb.toString();
		sb.delete(line.length()/2, line.length());
		
		for(int i = line.length()/2;i<line.length();++i){
			
			char temp = line.charAt(i);
			temp -=1;
			sb.append(temp);
			
			
			
		}
		
		
		System.out.println(sb);
		}
	}
}