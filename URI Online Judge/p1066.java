import java.util.*;
public class p1066 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int even = 0, pos = 0,neg =0;
	for(int i =1;i<=5;i++){
	
		int n = input.nextInt();
		if(n%2==0){
		even++;
		} 
		if(n>0){
			pos++;
		}else if(n<0){
			neg++;
		}
		}
	System.out.println(even+" valor(es) par(es)");
	System.out.println(5-even+" valor(es) impar(es)");
	System.out.println(pos+" valor(es) positivo(s)");
	System.out.println(neg+" valor(es) negativo(s)");
	
	}
}
