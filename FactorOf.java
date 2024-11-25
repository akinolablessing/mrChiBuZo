import java.util.Scanner;
public class FactorOf{
public static void main(String[] args){

 factors();
 }
public static void factors(){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();
for(int count=1; count<=(number/2); count++){
 if(number % count == 0){
  System.out.print(count +" ");
 }
}
System.out.print(number);
}
}