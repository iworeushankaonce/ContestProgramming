import java.util.Scanner;

public class p1133 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
			
		
			if(a>b){
				for(int i = b+1;i<=a-1;++i){
					if(i%5==2 || i%5==3){
						System.out.println(i);
					}	
				}
			}
			if(a<b){
				for(int i = a+1;i<=b-1;++i){
					if(i%5==2 || i%5==3){
						System.out.println(i);
					}
					
				}
			}
			
	}
}
