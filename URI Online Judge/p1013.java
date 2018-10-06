import java.util.*;
public class p1013 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int AB = ((a+b+Math.abs(a-b))/2);
		int AC = ((a+c+Math.abs(a-c))/2);
		if(AB>AC){
		System.out.println(AB + " eh o maior");}
		else{
			System.out.println(AC + " eh o maior");
		}
	}
}
