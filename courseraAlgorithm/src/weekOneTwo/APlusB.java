package weekOneTwo;

import java.util.Scanner;

class APlusB {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    if(0<=a && b<=9)    System.out.println(a + b);
  }
}