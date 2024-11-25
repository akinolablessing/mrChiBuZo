import java.util.Scanner;
public class Subtract{
public static int number(int firstNumber , int secondNumber){
int result = firstNumber - secondNumber;
return result;

 }
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int numOne = scanner.nextInt();
System.out.print("Enter a number: ");
int numTwo = scanner.nextInt();

int sum = number(numOne,numTwo);
System.out.print("The subtraction of the two numbers is "+sum);
 }
}