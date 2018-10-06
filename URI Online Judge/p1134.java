import java.util.*;

public class p1134 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int alc = 0, gas = 0, dis = 0;
		
		while (n != 4) {
			switch(n){
			case 1:{alc++;break;}
			case 2:{gas++;break;}
			case 3:{dis++;break;}
			//default:{continue;}
			}
			 n = input.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + dis);
	}
}
