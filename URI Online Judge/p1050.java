import java.util.*;
public class p1050 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String city;
		switch(n){
		case 61: city = "Brasilia" ; break;
		case 71: city = "Salvador" ; break;
		case 11: city = "Sao Paulo" ; break;
		case 21: city = "Rio de Janeiro" ; break;
		case 32: city = "Juiz de Fora" ; break;
		case 19: city = "Campinas" ; break;
		case 27: city = "Vitoria" ; break;
		case 31: city = "Belo Horizonte" ; break;
		default: city = "DDD nao cadastrado";break;
		}
		System.out.println(city);
	}
}
