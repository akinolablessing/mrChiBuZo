import java.util.Scanner;
public class Divide{
public static float number(int firstNumber , int secondNumber){
int result = firstNumber / secondNumber;
return result;

 }
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int numOne = scanner.nextInt();
System.out.print("Enter a number: ");
int numTwo = scanner.nextInt();

float sum = number(numOne,numTwo);
System.out.print("The division of the two numbers is:  "+sum);
 }
}