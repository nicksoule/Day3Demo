
public class InfitWhile {

	public static void main(String[] args) {
		while (true) {
			int randomNum = (int)(Math.random() * 10);
			
			System.out.println(randomNum);
			
			if (randomNum == 0) {
				System.out.println("7 has been found -- exit loop");
				break;
			}
			
		}

	}

}
