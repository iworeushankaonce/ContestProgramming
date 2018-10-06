import java.util.Locale;

public class p1098 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		for(double i = 0;i<=2;i+=0.2){
			for(double j = (i+1);j<=(i+3);j+=1){
				
				if( i == 0.0 || i == 1.0 || j==4 ||j==5||j==3 ){
					System.out.printf("I=%.0f J=%d\n",i,(int)j);
				} else
				System.out.printf("I=%.1f J=%.1f\n",i,j);
			
			}	
		}
	}
}
