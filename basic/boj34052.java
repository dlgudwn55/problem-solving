import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int timeleft = 1800;
		for (int i=0; i<4; i++)
			timeleft -= sc.nextInt();
		
		if (timeleft >= 300)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
