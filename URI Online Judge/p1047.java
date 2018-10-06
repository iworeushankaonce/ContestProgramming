import java.util.Scanner;
public class p1047 {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int d = input.nextInt();
	int stime = (a*60)+b;
	int etime = (c*60)+d;
	int answ = etime - stime;
	//if(stime<etime && answ<=1440 && answ>0 && b<=59 && c<=59){
	if(stime==etime){
	System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
	} else {
	
	System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (answ/60),(answ%60));
			
		}
	}
}
