import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if(a > b && a > c) {
			System.out.println(a + " eh o maior");
		} else if(b > a && b > c) {
			System.out.println(b + " eh o maior");
		} else {
			System.out.println(c + " eh o maior");
		}


	}
}
