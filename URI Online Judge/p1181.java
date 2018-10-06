import java.util.*;
 
public class p1181 {
 
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double[][] nums = new double[12][12];
        double sum = 0, media = 0;
        int n = scan.nextInt();
        String s = scan.next();
        while (n >= 0 || n <= 11) {
 
            for (int row = 0; row < 12; ++row) {
                for (int col = 0; col < 12; ++col) {
                    nums[row][col] = scan.nextDouble();
                    if (col == n) {
 
                        sum += nums[n][row];
                    }
                }
            }
             
            media = sum / 12;
 
            if (s.equals("S")) {
                System.out.printf("%.1f%n", sum);
                break;
            } else if (s.equals("M")) {
                System.out.printf("%.1f%n", media);
                break;
            }
             
        }
    }
}