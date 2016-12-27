package weekOneTwo;
import java.util.*;

public class GCD {
  private static long gcd_naive(long a, long b) {
    
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
	
    return a;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextInt();
    long b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
