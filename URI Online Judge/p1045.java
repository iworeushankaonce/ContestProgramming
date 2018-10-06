import java.util.*;
public class p1045 {
 
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
         
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double h = 0;
         
        if (B > A && B > C) {
            h = A;
            A = B;
            B = h;
        }
        else if (C > A && C > B) {
            h = A;
            A = C;
            C = h;
        }
        if (A >= (B + C))  {
            System.out.println("NAO FORMA TRIANGULO"); }
        else {
         
            if ((A * A) == ((B * B) + (C * C))) 
            System.out.println("TRIANGULO RETANGULO");
         
            if ((A * A) > ((B * B) + (C * C))) 
            System.out.println("TRIANGULO OBTUSANGULO");
         
            if ((A * A) < ((B * B) + (C * C))) 
            System.out.println("TRIANGULO ACUTANGULO");
         
            if ((A == B) && (B == C)) 
            System.out.println("TRIANGULO EQUILATERO");
         
            if ((A == B) && (C != B)) 
            System.out.println("TRIANGULO ISOSCELES");
         
            if ((A == C) && (B != C)) 
            System.out.println("TRIANGULO ISOSCELES");
         
            if((B == C) && (A != B)) 
            System.out.println("TRIANGULO ISOSCELES");
        }
         
        }
    }