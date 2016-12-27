package weekOneTwo;

import java.util.*;

public class LCM {
  private static long lcm_naive(long a, long b) {
    long a1=a;
    long b1=b;
    if(b>a)
    {	long temp1 =a;
    	a=b;
    	b=temp1;
    }
   
    while (b!=0){
		long temp2=a%b;
		a=b;
		b=temp2;
		
    }
	long b2=b1/a;
	
    return a1*b2;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
