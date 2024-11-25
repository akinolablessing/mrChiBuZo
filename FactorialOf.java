//Question;
//Write a function that takes an integer and returns the factorial of the number. if i pass //in 5 , i expect 120
import java.util.Scanner;
public class FactorialOf{
public static int factor(int number){
 int value =1;
 for(int count=1; count<=number; count++){
  value = value*count;
}
int result = value;
return result;

}
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int initialNumber = scanner.nextInt();
 
int num = factor(initialNumber );
System.out.print("The factorial is: "+num);
 
 }
}