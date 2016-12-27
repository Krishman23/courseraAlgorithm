package weekOneTwo;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        int maxA=numbers[0];
        int maxB=0;
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            if(numbers[i]>=maxB){
            	if(numbers[i]>=maxA){
            		maxB=maxA;
            		maxA=numbers[i];
            		}
            	else{
            		maxB=numbers[i];
            	}
            	
            }
            
        }
        
        long prod=(long)maxA*(long)maxB;
        
       return prod;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}