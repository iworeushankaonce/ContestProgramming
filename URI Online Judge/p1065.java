import java.util.*;
public class p1065 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int N;

	int even = 0;
	for(int i = 1;i<=5;i++){
		N = input.nextInt();
		if(N%2 ==0){
			even++;
		}
		
	}
	System.out.printf("%d valores pares\n", even);
}
}
