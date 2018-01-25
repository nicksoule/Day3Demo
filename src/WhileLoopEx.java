import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Do some stuff!");

			System.out.println("Do you want to continue? y/n");
			cont = scan.nextLine();

		}
		System.out.println("Goodbye!");
		scan.close();

	}

}
