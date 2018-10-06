import java.util.*;

public class p1040 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();

		float media = (float) ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4)) / 10;
		System.out.printf("Media: %.1f\n", media);
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media <= 6.9 && media >= 5.0) {
			double n5 = input.nextDouble();
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f\n", n5);

			double media2 = (media + n5) / 2;
			if (media2 >= 5.0) {

				System.out.println("Aluno aprovado.");

			} else if (media2 < 5.0) {

				System.out.println("Aluno reprovado.");

			}
			System.out.printf("Media final: %.1f\n", media2);
		} else if (media < 5.0) {

			System.out.println("Aluno reprovado.");

		}
	}
}
