import java.util.Scanner;
public class p1180 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	int pos = 0, min = 0;
	int[] arr = new int[n];
	for(int i = 0;i<n;++i){
		arr[i] = input.nextInt();
		
		if(arr[i]<=min){
			min = arr[i];
			pos = i;
			}
		}
	System.out.println("Menor valor: " + min);
	System.out.println("Posicao: "+ pos);
	}
}
