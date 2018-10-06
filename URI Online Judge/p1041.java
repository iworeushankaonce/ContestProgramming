import java.util.*;
public class p1041 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		float x = input.nextFloat();
		float y = input.nextFloat();
		if( x>0 && y>0){
			System.out.println("Q1");
		} else
			if( x<0 && y>0){
				System.out.println("Q2");
			} else
				if( x<0 && y<0){
					System.out.println("Q3");
				} else 
					if( x>0 && y<0){
					System.out.println("Q4");
				}else
		if (x==0 && y !=0){
			System.out.println("Eixo Y");
		}else
			if (y==0 && x!=0){
				System.out.println("Eixo X");
			}else 
				if(x==0 && y==0){
					System.out.println("Origem");

		}			
	}
}
