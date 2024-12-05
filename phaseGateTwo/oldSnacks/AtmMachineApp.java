import java.util.Scanner;
public class AtmMachineApp{
public static void main(String[] args){

 machineMenu();
 }
 public static void machineMenu(){
 Scanner scanner = new Scanner(System.in);
 
   System.out.print("""
      ~~~~~~AT(M) Machine App~~~~
    Select one out of this App
    1)Create an account with your first name , last name and pin
    2)Close account
    3)Deposit money
    4)Withdraw money
    5)Check Account balance
    6)Transfer from one account to another
    7)Change pin
    0) Go back to menu
      
""");

//your full name, account number, and address, as well as verify that //you have settled unpaid balances.

  int menu = scanner.nextInt();
 switch(menu ){
   case 0:
   machineMenu();
  break;
   case 1:
     
     System.out.print("Enter your first name:");
     String fName = scanner.next();
   
     System.out.print("Enter your last name:");
     String lName = scanner.next();

     System.out.print("Enter your pin:");
     int  pin = scanner.nextInt();
      break;

   case 2:
    System.out.print("""
       ~~~To close your account fill in the form:::

""");
    System.out.print("Enter your full name:");
     String fullName = scanner.next();

   System.out.print("Enter your account number:");
   long account = scanner.nextLong();

   System.out.print(">>>>>>>Your account has been verified");

   case 3:
     System.out.print("""
        ~~~~WELCOME TO WHERE TO DEPOSIT MONEY~~~~
          
""");
 System.out.print("Enter your pin:");
  int num = scanner.nextInt();
  
  if(pin==num){
  System.out.print("Correct pin");
  }

  }
 }
}