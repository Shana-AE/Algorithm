import java.util.Scanner;

import edu.princeton.cs.algs4.StdOut;

public class CheckXYIn01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StdOut.println("Please input x:");
    double x = input.nextDouble();
    StdOut.println("Please input y:");
    double y = input.nextDouble();
    StdOut.println((x > 0 && x < 1) && (y > 0 && y < 1));
    input.close();
  }
}
