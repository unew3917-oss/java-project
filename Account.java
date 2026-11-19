import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private BigDecimal balance;
    private ArrayList<String> transactions = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

 
    public Account(){
        this.balance = BigDecimal.ZERO;
    }

    //Deposit method 
    public void deposit() {
    System.out.println("****************************");
    System.out.println(" You have selected Deposit");
    System.out.println("****************************");
    BigDecimal amount = readPositiveAmount("Enter amount to deposit");
    balance = balance.add(amount);
    String record = "Deposited: " + amount;
    transactions.add(record);
    System.out.println("You have successfully deposit: " + amount);
  }

   //Withdraw method
  public  void withdraw() {
    System.out.println("****************************");
    System.out.println("  You have selected Withdrawal");
    System.out.println("****************************");
    BigDecimal amount = readPositiveAmount("Enter the amount to withdraw: ");
    if (amount.compareTo(balance) <= 0) {
      balance = balance.subtract(amount);
      String record = "Withdrawn: " + amount;
      transactions.add(record);
      System.out.println("You have successfully withdrawn: " + amount);
    } else {
      System.out.println("Insufficient funds");
      System.out.println(balance);
    }
  }

  // method that extracts read positive amount

  public  BigDecimal readPositiveAmount(String prompt) {
    while (true) {
      System.out.println(prompt);
      if (scanner.hasNextBigDecimal()) {
        BigDecimal value = scanner.nextBigDecimal();
        if (value.compareTo(BigDecimal.ZERO) > 0) {
          return value;
        } else {
          System.out.println("Amount should be positive");
        }

      } else {
        System.out.println("Enter valid numbers");
        scanner.next();
      }
    }
  }

  // metthod for transaction history
  public  void transactionHistory() {
    System.out.println("****************************");
    System.out.println("  You have selected Transaction history");
    System.out.println("****************************");
    if (transactions.isEmpty()) {
      System.out.println("No transaction has been made");
    } else {
      for (String transaction : transactions) {
        System.out.println(transaction);
      }
    }

  }
   // show balance method 
   public  void showBalance() {
    System.out.println("****************************");
    System.out.println("  You have selected Check Balance");
    System.out.println("****************************");
    System.out.println("Balance: " + balance);
  }

   
}
