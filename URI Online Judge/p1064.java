import java.util.*;
public class p1064 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int pos = 0;
	double sum = 0;
	for(int i =1;i<=6;i++){
		double a = input.nextDouble();
				
				
				if(a >=0){
				pos++;	sum=sum+ a;
				}
		
	}
	System.out.printf("%d valores positivos\n", pos);
	System.out.println(sum/pos);
}
}
