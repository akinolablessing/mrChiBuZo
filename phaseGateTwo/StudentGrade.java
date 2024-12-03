

import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 
System.out.print("How many student's do you have?:");
int studentNumber = scanner.nextInt();

System.out.print("How many subject do they offer?:");
int subject = scanner.nextInt();


 
int reNew =0 ;
int twoReNew = 0;
int threeReNew = 0;
double average=0;
int[] sNumber = new int[studentNumber];

 for(int count = 0; count<sNumber.length; count ++){
   System.out.print("Score for first subject:");
   sNumber[count] = scanner.nextInt();
   reNew =  sNumber[count];
   
  int sumOne =reNew;
  
 }
 for(int index = 0; index<sNumber.length; index ++){
   System.out.print("Scores for second subject:");
   sNumber[index] = scanner.nextInt();
    twoReNew = sNumber[index];
   
  int sumTwo =twoReNew;
  //average = (sum+sum/(sNumber.length));
 }
for(int three = 0; three<sNumber.length; three ++){
   System.out.print("Scores for third subject:");
   sNumber[three] = scanner.nextInt();
    threeReNew = sNumber[three];
   
  int sumThree =threeReNew;
  //average = (sum+sum/(sNumber.length));
 }

 for(int i=0; i<=sNumber.length-1; i++){
  System.out.println("SUB 1:"+reNew);
  System.out.println("SUB 2:"+twoReNew);
  System.out.println("SUB 3:"+threeReNew);
  System.out.println("Average :"+average);
 }
}
 }
