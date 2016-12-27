package weekOneTwo;
import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
    	List<Integer> fibo = new ArrayList<>();
		fibo.add(0);
		fibo.add(1);
		int i = 0;
		int sumFrom = 0;
		int sumTo = 0;
		while (!(i > 0 && fibo.get(i) == 0 && fibo.get(i + 1) == 1)) {
			fibo.add((int) ((fibo.get(i) % 10 + fibo.get(i + 1) % 10) % 10));
			// System.out.println("i:" + i + " -- " + fibo.get(i));
			i++;
		}
		// System.out.println("i:"+i+"-- -- "+fibo.get(i));

		for (int j = 1; j < from % i; j++) {
			sumFrom += fibo.get(j);
			sumFrom = sumFrom % 10;
		}
		for (int j = 1; j <= to % i; j++) {
			sumTo += fibo.get(j);
			sumTo = sumTo % 10;
		}
		
		
		//System.out.println("sumFrom:" +sumFrom + "-- -- sumTo:" + sumTo);
		return (sumTo+10-sumFrom)%10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        System.out.println(getFibonacciPartialSumNaive(from, to));
    }
}

