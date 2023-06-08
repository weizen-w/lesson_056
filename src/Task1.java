import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    System.out.println(reverseBinary(a));
  }

  public static String reverseBinary(int x) {
    if (x < 0) {
      throw new IllegalArgumentException("Число не может быть отрицательным: " + x);
    }
    if (x < 2) {
      return String.valueOf(x);
    }
    return x % 2 + reverseBinary(x / 2);
  }
}
