import java.util.*;
public class p1073 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	for(int i = 1;i<=n;i++){
		if(i%2==0){
			System.out.printf("%d^2 = %d\n",i,i*i);
		}
	}
}
}
