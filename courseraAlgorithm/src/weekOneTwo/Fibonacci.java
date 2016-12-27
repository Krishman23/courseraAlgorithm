package weekOneTwo;
import java.util.Scanner;

public class Fibonacci {

	private static long calc_fib(int n, long[] fibo) {

		int count = 2;
		if (n ==-2)return 0;
		
		else if (n <= 0)return 1;
		fibo[0] = 1;
		fibo[1] = 1;
		while (n >= 1) {
			fibo[count] = fibo[count - 1] + fibo[count - 2];
			n--;
			count++;
		}
		count--;
		return fibo[count];
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		long startTime;
		if (n >= 0) {
			long[] fibo = new long[n];
			System.out.println(calc_fib(n - 2, fibo));
		}
	}
}
