package weekThree;
import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        //write your code here
    	int ones=0;
    	ones=m%5;
    	m=m-ones;
    	int fives=0;
    	fives=m%10;
    	m=m-fives;
    	fives=fives/5;
    	int tens=0;
    	tens=m/10;
    	int total=ones+fives+tens;
    	//System.out.println("ones:"+ones+" fives:"+fives+" tens:"+tens+" total:"+total);
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

