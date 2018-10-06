import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class p1140 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
		String line;
		
		while(true)
		{
			line = br.readLine();
			if(line.equals("*"))
			{
				break;
			}
			
			log.write((check(line)? "Y\n": "N\n"));
		}
		br.close();
		log.flush();
		log.close();
	}

	private static boolean check(String line) 
	{
		StringTokenizer tk = new StringTokenizer(line);
		char c = Character.toLowerCase(tk.nextToken().charAt(0));
		char temp;
		boolean res = true;
		
		while(tk.hasMoreTokens())
		{
			temp = Character.toLowerCase(tk.nextToken().charAt(0));
			if(c!= temp)
			{
				res = false;
			}
		}
		return res;
	}
}
