import java.util.Scanner;
public class Bank{
       //variables declaration
       static double balance = 0;
       static int option;
       static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
  //display menu
  boolean situation = true;
  while (situation) {
    System.out.println("****************************");
  System.out.println("  Welcome to sim toolkit");
  System.out.println("****************************");
  System.out.println("1. Check Balance");  
  System.out.println("2. Deposit"); 
  System.out.println("3. Withdraw");
  System.out.println("4. Send");   
  System.out.println("5. Exit"); 
  
  //get users input
  System.out.println("Select service: ");
   option = scanner.nextInt();
 
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
      situation = false;
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
  System.out.println("Enter amount to deposit: ");
  double amount = scanner.nextDouble();
  if (amount > 0){
    balance += amount;
    System.out.println("You have successfuly deposit: " + amount);
  }else{
    System.out.println("Amount should be a positive value");
  }
}

  //withdrawal method
public static void withdraw(){
       System.out.println("****************************");
  System.out.println("  You have selected Withdrawal");
  System.out.println("****************************");
  System.out.println("Enter amount to withdraw: ");
  double amount = scanner.nextDouble();
  if (amount >= 0 && amount <= balance){
    balance -= amount;
    System.out.println("You have successfuly withdrawn: " + amount);
  }else{
    System.out.println("Insufficient funds");
  }
}

 //show balance method 
public static void showBalance(){
  System.out.println("****************************");
  System.out.println("  You have selected Check Balance");
  System.out.println("****************************");
  System.out.println("Balance: " + balance);
}
}
