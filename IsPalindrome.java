//question;
//write a function that takes an 5 digit integer and returns true if it is a palindrome. i.e //if i pass in 54145, it should return true.
import java.util.Scanner;
public class IsPalindrome{
public static void main(String[] args){

 palindrome();
 }
public static void palindrome(){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = scanner.nextInt();

while (num != 0) {
      int reversedNum =0;
     int remainder = num % 10;
     reversedNum = reversedNum * 10 + remainder;
      num /= 10;
  
if(num == reversedNum){
System.out.print(num+ "Is a palindrome");
    }
  else{
 System.out.print(num+ "Is not a palindrome");
     }
    }
 }
}