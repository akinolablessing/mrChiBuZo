import java.util.Scanner;
public class IsSquare{
public static void main(String[] args){

integer();
 }
public static void integer(){
Scanner scanner = new Scanner(System.in);
  
System.out.print("Enter a number: ");
double number = scanner.nextInt();

double sqrt = Math.sqrt(number);
if((sqrt-Math.floor(sqrt)) ==0){
System.out.print(true);
 }
else{
System.out.print(false);
}
 }
}
