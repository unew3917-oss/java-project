import java.util.Scanner;
public class Bank {
  // variables declaration
  static int option;
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Account account = new Account();
    // display menu
    boolean running = true;
    while (running) {
      System.out.println("****************************");
      System.out.println("  Welcome to sim toolkit");
      System.out.println("****************************");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit");
      System.out.println("3. Withdraw");
      System.out.println("4. Send");
      System.out.println("5. Transaction history");
      System.out.println("6. Exit");

      // get users input

      while (true) {
        System.out.println("Select service: ");
        if (scanner.hasNextInt()) {
          option = scanner.nextInt();

          if (option > 0 && option < 7) {
            break;
          } else {
            System.out.println("Enter a number between 1 and 6");
            System.out.println("You have selected option: " + option);
          }

        } else {
          System.out.println("Enter a valid number");
          scanner.next();
        }

      }
      switch (option) {
        case 1:
          account.showBalance();
          break;
        case 2:
          account.deposit();
          break;
        case 3:
          account.withdraw();
          break;
        case 4:
          System.out.println("Coming soon!");
          break;
        case 5:
          account.transactionHistory();
          break;
        case 6:
          running = false;
          System.out.println("exit");
          break;
        default:
          System.out.println("Choose service between 1 and 6");
          break;
      }
    }

  }
 
}
