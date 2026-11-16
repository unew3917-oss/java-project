import java.util.Scanner;
import java.math.BigDecimal;
public class Bank{
       //variables declaration
       static BigDecimal balance = BigDecimal.ZERO;
       static int option;
       static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
  //display menu
  boolean running = true;
  while (running) {
    System.out.println("****************************");
  System.out.println("  Welcome to sim toolkit");
  System.out.println("****************************");
  System.out.println("1. Check Balance");  
  System.out.println("2. Deposit"); 
  System.out.println("3. Withdraw");
  System.out.println("4. Send");   
  System.out.println("5. Exit"); 
  
  //get users input
  
  while (true) {
    System.out.println("Select service: ");
    if(scanner.hasNextInt()){
      option = scanner.nextInt();
    
      if(option > 0 && option < 6){
        break;
      }else{
        System.out.println("Enter a number between 1 and 5");
        System.out.println("You have selected option: " + option);
      }
      
    }
    else{
      System.out.println("Enter a valid number");
      scanner.next();
    }
  
  }
  switch (option) {
    case 1:
      showBalance();
      break;
    case 2:
      deposit();
      break;
    case 3:
      withdraw();
      break;
    case 4:
      System.out.println("Coming soon!");
      break;
    case 5:
      running = false;
       System.out.println("exit");
      break;
    default:
      System.out.println("Choose service between 1 and 4");
      break;
  }
}
  
} 

//deposit method
public static void deposit(){
  
  System.out.println("****************************");
  System.out.println(" You have selected Deposit");
  System.out.println("****************************");
  BigDecimal amount = readPositiveAmount("Enter amount to deposit");
    balance = balance.add(amount);
    System.out.println("You have successfuly deposit: " + amount);
}

  //withdrawal method
public static void withdraw(){
       System.out.println("****************************");
  System.out.println("  You have selected Withdrawal");
  System.out.println("****************************");
   BigDecimal amount = readPositiveAmount("Enter the amount to withdraw: ");
  if (amount.compareTo(balance) <= 0){
    balance = balance.subtract(amount);
    System.out.println("You have successfuly withdrawn: " + amount);
  }else{
    System.out.println("Insufficient funds");
    System.out.println(balance);
  }
}

 //show balance method 
public static void showBalance(){
  System.out.println("****************************");
  System.out.println("  You have selected Check Balance");
  System.out.println("****************************");
  System.out.println("Balance: " + balance);
}

//method that extracts read postive amount

public static BigDecimal readPositiveAmount(String prompt){
      while (true) {
        System.out.println(prompt);
      if (scanner.hasNextBigDecimal()) {
      BigDecimal value = scanner.nextBigDecimal();
        if(value.compareTo(BigDecimal.ZERO) > 0){
         return value;
       }else{
        System.out.println("Amount should be positive");
        }

      }else{
      System.out.println("Enter valid numbers");
      scanner.next();
     }
  }
}
}
