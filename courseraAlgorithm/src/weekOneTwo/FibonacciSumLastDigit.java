package weekOneTwo;
import java.util.*;

public class FibonacciSumLastDigit {
	private static long getFibonacciSumNaive(long n) {

		List<Integer> fibo = new ArrayList<>();
		fibo.add(0);
		fibo.add(1);
		int i = 0;
		int sum = 0;
		
		while (!(i > 0 && fibo.get(i) == 0 && fibo.get(i + 1) == 1)) {
			fibo.add((int) ((fibo.get(i) % 10 + fibo.get(i + 1) % 10) % 10));
			// System.out.println("i:" + i + " -- " + fibo.get(i));
			i++;
		}
		// System.out.println("i:"+i+"-- -- "+fibo.get(i));

		for (int j = 1; j <= n % i; j++) {
			sum += fibo.get(j);
			sum = sum % 10;
		}
		
		//System.out.println("total:" + total + "-- -- sum:" + sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong();
		long s = getFibonacciSumNaive(n);
		System.out.println(s);
	}
}
