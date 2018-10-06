import java.util.*;
public class p1037 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		if (x<=100.00 && x>=0){
			if (x>=0 && x<=25.00){
				System.out.println("Intervalo [0,25]");
			} else 
				
				if (x>=25.00 && x<=50.00){
					System.out.println("Intervalo (25,50]");
				} else
					if (x>=50.00 && x<=75.00){
						System.out.println("Intervalo (50,75]");
					} else 
						if (x>=75.00 && x<=100.00){
							System.out.println("Intervalo (75,100]");
						}  
					
				 
			
			
		}else {
			System.out.println("Fora de intervalo");
		}
	}
}
