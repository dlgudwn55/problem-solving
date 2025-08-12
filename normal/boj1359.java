import java.util.Scanner;

public class Main {
	
	public static int combination(int n, int r) {
		int a = 1;
		int b = 1;
		for (int i=n; i>=n-r+1; i--)
			a *= i;
		
		for (int i=r; i>=1; i--)
			b *= i;
		
		return a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		int down = combination(n, m);
		int up = down;
		
		for (int i=0; i<k; i++) {
			up -= combination(m, i) * combination(n-m, m-i);
		}
			
		
		System.out.println((double)up / down);
		
	}

}
