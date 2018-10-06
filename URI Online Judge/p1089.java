import java.util.*;

public class p1089 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		while (n != 0) {

			int count = 1;
			int arr[] = new int[n + 1];

			for (int i = 0; i < n; ++i) {

				arr[i] = input.nextInt();

			}
			arr[n] = arr[0];

			for (int i = 2; i < n; ++i) {

				if (!(i > n)) {
					if (((arr[i - 1] > arr[i - 2]) && (arr[i - 1] > arr[i]))
							|| ((arr[i - 1] < arr[i - 2]) && (arr[i - 1] < arr[i]))) {
						count++;

					}
					}
			}
				System.out.println(Arrays.toString(arr));
					System.out.println(count);
					n = input.nextInt();
				
			
		}
	}
}