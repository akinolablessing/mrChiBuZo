import java.util.Scanner;
public class CheckOutApp{

 public static void main(String[] args){
 
 addNew();
 backMenu();
 }
public static void addNew(){ 
Scanner scanner = new Scanner(System.in);
 System.out.print("Dear customer what's your name: ");
  String name = scanner.nextLine();
   }
  public static void backMenu(){
   Scanner scanner = new Scanner(System.in);
   System.out.print("what did you buy dear:");
  String product = scanner.next();

  System.out.print("How many pieces?:");
  int pieces = scanner.nextInt();
  
   System.out.print("How much per unit:");
  int unit = scanner.nextInt();

System.out.print("""
Add more items?:
yes / no
""");
 String  option = scanner.next();
 switch(option){
  case "yes":
   backMenu();
   break;
  case "no":
   System.out.print("What is your name:");
    String secondName = scanner.next();
   System.out.print("How many discount will the customer get ?:");
   int discount = scanner.nextInt();
   break;
}
 System.out.print("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
Date: 18-Dec-22 8:48:11pm
""");

System.out.printf("Customer name is:%s%n", name);
System.out.printf("Cashier name is:%s%n",secondName);
System.out.println("==============================================================");


System.out.printf("%s%8s%8s%15s", "ITEM","QTY","PRICE","TOTAL(NGN)");
system.out


  }
} 