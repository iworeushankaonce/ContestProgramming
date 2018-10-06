import java.util.*;
public class p1072 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int in = 0;
	int out = 0;
	for(int i = 1;i<=n;i++){
		int a = input.nextInt();
		if (a>=10 && a<=20){
			in++;
		}
		else {
			out++;
		}
	}
	System.out.printf("%d in\n",in);
	System.out.printf("%d out\n", out);
}
}
