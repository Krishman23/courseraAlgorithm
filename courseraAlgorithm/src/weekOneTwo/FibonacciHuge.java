package weekOneTwo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FibonacciHuge {

	private static long getFibonacciHugeEfficient(long n, long m) {
		List<Integer> fibo = new ArrayList<>();
		fibo.add(0);
		fibo.add(1);
		int i = 0;
		while (!(i > 0 && fibo.get(i) == 0 && fibo.get(i + 1) == 1)) {
			fibo.add((int) ((fibo.get(i) % m + fibo.get(i + 1) % m) % m));
			
	//	System.out.println("i:"+i+" -- "+fibo.get(i));
		i++;
		}
		return fibo.get((int) (n % i));

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m= in.nextLong();
		/*FastScanner fs = new FastScanner(System.in);
		long n = fs.nextLong();
		long m = fs.nextLong();
		*/
		System.out.println(getFibonacciHugeEfficient(n, m));
	}

}