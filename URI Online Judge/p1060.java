import java.util.*;
public class p1060 {
public static void main(String[] args){
	Locale.setDefault(Locale.US);
	Scanner input = new Scanner(System.in);
	
	int odd = 0;
	for (int i = 1;i<=6;i++){
		double n = 0;
		n = input.nextDouble();
		if (n>0){
			odd++;
		
		} 			
	}
	System.out.printf("%d valores positivos", odd);
	
}
}
