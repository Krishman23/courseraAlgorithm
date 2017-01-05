package weekThree;
import java.util.Scanner;

public class FractionalKnapsack {
	private static double getOptimalValue(int capacity, int[] values, int[] weights) {
		double value = 0;
		double maxrate = 0;
		// write your code here
		while (capacity > 0) {
			int index = 0;
			maxrate = 0;
		
			for (int i = 0; i < weights.length; i++) {
				double rate = (double) values[i] / (double) weights[i];
					if (maxrate < rate) {
					index = i;
					maxrate = rate;

				}
			}
			if (capacity >= weights[index]) {
				value += values[index];
				capacity = capacity - weights[index];
			} else {
				
				value += maxrate * capacity;
				capacity = 0;
			}
			values[index] = 0;
		}
		value =Math.round (value * 10000.0) / 10000.0;  
		
		
		return value;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int capacity = scanner.nextInt();
		int[] values = new int[n];
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = scanner.nextInt();
			weights[i] = scanner.nextInt();
		}
		System.out.println(getOptimalValue(capacity, values, weights));
	}
}
