import java.util.*;
//not solved
public class p1049 {
	public static void main(String[] args) {
		for(char i = 'Z';i>'A';--i){
			for(char j= 'A';j<i;++j){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

