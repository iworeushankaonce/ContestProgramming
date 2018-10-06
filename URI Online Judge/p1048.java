import java.util.*;
public class p1048 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double sal = input.nextDouble();
		if(sal>0 && sal<=400.00){
			System.out.printf("Novo salario: %.2f\n", sal+(sal/100.00*15.00));
			System.out.printf("Reajuste ganho: %.2f\n", sal/100.00*15.00);
			System.out.println("Em percentual: 15 %");
		}else
			if(sal>=400.01 && sal<=800.00){
				System.out.printf("Novo salario: %.2f\n", sal+(sal/100.00*12.00));
				System.out.printf("Reajuste ganho: %.2f\n", sal/100.00*12.00);
				System.out.println("Em percentual: 12 %");
			}else
				if(sal>=800.01 && sal<=1200.00){
					System.out.printf("Novo salario: %.2f\n", sal+(sal/100.00*10.00));
					System.out.printf("Reajuste ganho: %.2f\n", sal/100.00*10.00);
					System.out.println("Em percentual: 10 %");
				}else
					if(sal>=1200.01 && sal<=2000.00){
						System.out.printf("Novo salario: %.2f\n", sal+(sal/100.00*7.00));
						System.out.printf("Reajuste ganho: %.2f\n", sal/100.00*7.00);
						System.out.println("Em percentual: 7 %");
					}
					else
						if(sal>2000){
							System.out.printf("Novo salario: %.2f\n", sal+(sal/100.00*4.00));
							System.out.printf("Reajuste ganho: %.2f\n", sal/100.00*4.00);
							System.out.println("Em percentual: 4 %");
						}
	}
}
