import java.util.Scanner;
public class Bank{
       //variables declaration
       static double balance = 0;
       static int option;
       static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
  //display menu
  while (true) {
    System.out.println("****************************");
  System.out.println("  Welcome to sim toolkit");
  System.out.println("****************************");
  System.out.println("1. Check Balance");  
  System.out.println("2. Deposit"); 
  System.out.println("3. Withdraw");
  System.out.println("4. Send");    

  //get users input
  System.out.println("Select action: ");
  option = scanner.nextInt();
  if (option == 1){
    showBalance();
  }
  else if(option == 2){
    Deposit();
  }else if(option == 3){
    Withdraw();
  }else if(option == 4){
    System.out.println("comming soon!");
  }else{
    System.out.println("Choose service between 1 and 4");
  }
  }
  
} 

//deposit method
public static void Deposit(){
  
  System.out.println("****************************");
  System.out.println(" You have selected Deposit");
  System.out.println("****************************");
  System.out.println("Enter amount to deposit: ");
  double amount = scanner.nextDouble();
  if (amount >= 0){
    balance += amount;
    System.out.println("You have successfuly deposit: " + amount);
  }else{
    System.out.println("Amount should be a positive value");
  }
}

  //withdrawal method
public static void Withdraw(){
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
