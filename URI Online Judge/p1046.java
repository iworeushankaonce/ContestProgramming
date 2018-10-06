import java.util.*;
public class p1046 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		if (a>=b){
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24-a+b);
		}
		else if(a<b){
			System.out.printf("O JOGO DUROU %d HORA(S)\n", b-a);
		}
	}
}
