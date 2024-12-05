import java.util.Scanner;
import java.util.Arrays;
public class CreditCardValidator{
public static void main(String[] args){

validator();

}
public static void validator(){
 Scanner scanner = new Scanner(System.in);


System.out.print("""
   	WELCOME TO CREDIT CARD VALIDATOR
        Click on~~~ 
       1 to continue 
       2 to stop
        
         """);
int select = scanner.nextInt();
switch(select){
   case 1:
       System.out.print("""
        Credict card nubers follow certain patterns: 
        it must have between 13 and 16 digits, and the number
        must start with >>> 4 for Visa Cards
                            5 for MasterCards
                            37 for American Express Cards
                            6 for Discover cards.
"""); 
System.out.print("Hell0, Kindly Enter card details to verify:");
long number = scanner.nextLong();
 break;
case 2:
validator();
break;
}
 }
}