import edu.princeton.cs.algs4.StdOut;

// 1.1.3

public class IsThreeArgsEqual {
  public static void main(String[] args) {
    String str = args[0].equals(args[1]) && args[1].equals(args[2]) ? "equal" : "not equal";
    StdOut.println(str);
  }
}