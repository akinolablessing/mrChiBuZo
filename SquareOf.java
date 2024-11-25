import java.util.Scanner;
public class SquareOf{
public static int square(int number){
int result = number*number;
return result;

}
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = scanner.nextInt();

int sum = square(num) ;
System.out.print("The square of the number is:"+sum);
 } 
}