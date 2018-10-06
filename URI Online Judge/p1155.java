import java.util.Locale;


public class p1155 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		double S = 0;
		for(double i = 1;i<=100;++i){
			S =( S + (1/i));
		}
		System.out.printf("%.2f\n",S);
	}
}
