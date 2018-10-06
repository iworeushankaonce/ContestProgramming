import java.util.*;
import java.io.*;
public class p1171 {
	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String line = br.readLine();
		
		int n = Integer.parseInt(line);

		int arr[] = new int[n+1];
		for (int i = 0; i <n; ++i) {
			line = br.readLine();
			
			arr[i] = Integer.parseInt(line);
		}
		arr[arr.length-1] = 20011;
		Arrays.sort(arr);

		int count = 1;
		
		for (int i = 0; i <arr.length-1; ++i) {
			
				
				if (arr[i] != arr[i+1]) {
					System.out.printf("%d aparece %d vez(es)\n", arr[i], count);
					count = 0;
			}
				count++;
		}
	}
}
