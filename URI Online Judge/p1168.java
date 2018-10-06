import java.util.*;

public class p1168 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n;++i){
			
			String num = input.next();
			int sum = 0;
			for(int j = 0;j < num.length();++j){
			
			char temp = num.charAt(j);
			
			switch (temp) {
			
			case '0':sum += 6; break;
			case '6':sum += 6; break;
			case '9': sum += 6; break;
			
			case '2': sum += 5; break;
			case '5': sum += 5; break;
			case '3': sum += 5; break;
			
			case '1': sum += 2; break;
			
			case '7': sum +=3; break;
			
			case '4': sum += 4; break;
			
			case '8': sum += 7; break;
			
			default: continue;
					}
				}
			System.out.println(sum + " leds");
			}
		}
	}

