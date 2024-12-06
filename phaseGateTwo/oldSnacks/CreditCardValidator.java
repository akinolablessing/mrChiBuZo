import java.util.Scanner;
import java.util.ArrayList;
public class CreditCardValidator{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter your card details:");
String cardNumber = scanner.next();

  int total=0;
  int index=0;
  int result=0;
  int[] array = new int[cardNumber.length()];
  char[] digit = new char[3];
  int multiply = 0;
  int number = 0;
  int sum =0;
  int sumOfNumber = 0;
  int secondResult =0;
  int secondTotal =0;
  int oddNumbers =0;

for(index=0; index < cardNumber.length(); index+=2){
 array[index] = cardNumber.charAt(index) -'0'; 
  result =  array[index] ;
  total = result*2;

  if(total %2 ==1){
   oddNumbers+=total;
  } 
  }
  number +=total;
  if(total>=10){
   while(total!=0){
    int check = total %10;
     sum = sum+check;
     total /=10;
    }
   }
   System.out.println();
   secondTotal = number+sum;

   char firstNumber = cardNumber.charAt(0);
   char secondNumber = cardNumber.charAt(1);
  
   System.out.println("===============================================");

   if(cardNumber.length() != 13 && cardNumber.length()!= 16){
    System.out.println("**Credit card Type: Invalid Card");
   }
   if(firstNumber=='3' && secondNumber=='7' ){
    System.out.println("**Credit Card Type: American Express card");
   }
   if(firstNumber == '4'){
   System.out.println("**Credit Card Type: Visa card");
   }
  if(firstNumber == '6'){
   System.out.println("**Credit Card Type: Discover");
  }
  if(firstNumber == '5'){
   System.out.println("**Credit Card Type:Master Card");
  }
  System.out.println("**Credit Card Number:"+cardNumber);
   System.out.println("**Credit Card Digit Length:"+cardNumber.length());

    if(secondTotal % 10==0){
     System.out.print("**Credit card validity status: valid");
      }
     else{
    System.out.println("**Credit card validity status: Invalid");

   }
    }
}


