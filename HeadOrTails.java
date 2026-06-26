import java.util.Scanner;

public class HeadOrTails {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int headsCount = 0;
    int tailsCount = 0;

    System.out.println("Who are you?");
    String name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
    System.out.println("Tossing a coin...");

    for (int i = 0; i < 3; i++) {
      int coin = (int) (Math.random() * 2);
      if (coin == 0) {
        System.out.println("Round " + (i + 1) + ": Heads");
        headsCount++;
      } else {
        System.out.println("Round " + (i + 1) + ": Tails");
        tailsCount++;
      }
    }

    System.out.println("Heads: " + headsCount + " Tails: " + tailsCount);
    sc.close();
  }
}
