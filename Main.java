import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int tc = scanner.nextInt();
		for (int i = 0; i < tc; i++) {
			int s = scanner.nextInt();
			int ar[] = new int[s];
			int max = 0;
			for (int j = 0; j < s; j++) {
				ar[j] = scanner.nextInt();
				if (max < ar[j])
					max = ar[j];
			}
			System.out.println("Case " + (i + 1) + ": " + max);
		}
	}
}
