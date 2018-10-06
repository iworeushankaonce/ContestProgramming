import java.util.*;
 
public class p1118 {
 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double i = 0;
        int k = 0;
        while (true) {
            double x = scan.nextDouble();
 
            if (x >= 0.0 && x <= 10.0) {
                k++;
                i += x;
                if (k == 2) {
                    sum = i / 2;
                    System.out.printf("media = %.2f%n", sum);
                    System.out.println("novo calculo (1-sim 2-nao)");
                    int a = scan.nextInt();
                    while (a < 1 || a > 2) {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        a = scan.nextInt();
                    }
                    if (a == 1) {
                        k = 0;
                        i = 0;
                    }
                    if (a == 2) {
                        break;
                    }
                }
            }
 
            else {
                System.out.println("nota invalida");
 
            }
 
        }
 
    }
}