import java.io.*;
import java.util.*;
public class p1087 {
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		StringTokenizer tk = new StringTokenizer(line);
		
		int x1 = Integer.parseInt(tk.nextToken());
		int y1 = Integer.parseInt(tk.nextToken());
		int x2 = Integer.parseInt(tk.nextToken());
		int y2 = Integer.parseInt(tk.nextToken());
		
		
		while(!(x1 == 0 && y1 == 0 && x2==0 && y2 ==0)){
				
			if(x1 == x2 && y1 == y2){
				System.out.println("0");
			} else
				
				if((x2-x1) == (y2 - y1) || 
					-(x2-x1) == (y2 - y1)||
						(x2-x1) == -(y2 - y1) ||
							-(x2-x1) == -(y2 - y1))
				{
				System.out.println("1");	
				}else
					if(x1 == x2 || y1 == y2){
						System.out.println("1");
						}else{
							System.out.println("2");
						}
			
			line = br.readLine();
			tk = new StringTokenizer(line);
			x1 = Integer.parseInt(tk.nextToken());
			y1 = Integer.parseInt(tk.nextToken());
			x2 = Integer.parseInt(tk.nextToken());
			y2 = Integer.parseInt(tk.nextToken());
			
		}
	}
}
