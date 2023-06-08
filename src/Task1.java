import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(reverse(num));
  }

  public static String reverse(int x) {
    final int radix = 10;
    if (x < 0) {
      throw new IllegalArgumentException("Число не может быть отрицательным: " + x);
    }
    if (x < radix) {
      return String.valueOf(x);
    }
    return x % radix + reverse(x / radix);
  }
}
