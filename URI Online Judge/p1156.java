import java.util.Locale;

public class p1156 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double res = 0, i = 1, j = 1;
		for (i = 1; i < 39; i += 2) {
			
			res = (double) res + (i / j);
			
			j *=2;

		}
		System.out.printf("%.2f\n",res);
	}
}
