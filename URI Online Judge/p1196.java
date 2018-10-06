
import java.util.*;

public class p1196 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String base = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

		while (input.hasNext()) {
			StringBuilder sb = new StringBuilder();
			String line = input.nextLine();
			
				
			for (int i = 0; i < line.length(); ++i) {
				if (line.charAt(i) == ' ') {
					sb.append(' ');
					continue;
				} else {
					sb.append((base.charAt((base.indexOf((line.charAt(i))) - 1))));
				}
			}

			System.out.println(sb);
			
		}
	}
}
