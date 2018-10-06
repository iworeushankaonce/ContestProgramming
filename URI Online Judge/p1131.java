import java.util.*;
public class p1131 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Novo grenal (1-sim 2-nao)");
		int n = input.nextInt();
		int count = 1,eq = 0;
		int suma = 0,sumb = 0;
		while(n==1){
			if(a==b){
				++eq;
			}
			if(a>b){
				suma++;
			}
			if(a<b){
				sumb++;
			}
			
			a = input.nextInt();
			b = input.nextInt();
			System.out.println("Novo grenal (1-sim 2-nao)");
			n = input.nextInt();
			++count;
		}
		if(a==b){
			++eq;
		}
		if(a>b){
			suma++;
		}
		if(a<b){
			sumb++;
		}
		System.out.println(count+" grenais");
		System.out.println("Inter:"+ suma);
		System.out.println("Gremio:"+ sumb);
		System.out.println("Empates:"+ eq);
		if(suma>sumb){
			System.out.println("Inter venceu mais");	
		}
		if(suma<sumb){
			System.out.println("Gremio venceu mais");	
		}
		if(suma==sumb){
			System.out.println("Nao houve vencedor");	
		}
		
		
	}
}
