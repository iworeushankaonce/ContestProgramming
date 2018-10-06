import java.util.*;
public class p1011 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int R = input.nextInt();
		System.out.printf("VOLUME = %.3f\n" , (4.0/3.0) * 3.14159 * R*R*R);
	}
}
