import java.util.*;
public class p1078 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	if (n >=2 && n<=1000){
	for (int i = 1; i<=10;i++){
		System.out.printf("%d x %d = %d\n" , i, n, i*n);
	}	
	}
	
}
}
