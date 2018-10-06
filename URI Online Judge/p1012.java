import java.util.*;
import java.util.Locale;
public class p1012{
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		//Õ≈ ¡–¿“‹ Õ¿ Ã»ƒ“≈–Ã
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double a = (0.5*A*C);
		double b = (3.14159*C*C);
		double c = ((A+B)*0.5*C);
		double d = (B*B);
		double e = (A*B);
		System.out.printf("TRIANGULO: %.3f\n", a);
		System.out.printf("CIRCULO: %.3f\n", b);
		System.out.printf("TRAPEZIO: %.3f\n", c);
		System.out.printf("QUADRADO: %.3f\n", d);
		System.out.printf("RETANGULO: %.3f\n", e);
		
	}
	
}