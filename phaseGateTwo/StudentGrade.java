import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 
System.out.print("How many student's do you have?:");
int studentNumber = scanner.nextInt();

System.out.print("How many subject do they offer?:");
int subject = scanner.nextInt();
 

int[][] sNumber = new int[subject][studentNumber];
 for(int count = 0; count<sNumber.length; count ++){
   for(int index=0; index<sNumber[count].length; index++){
  System.out.print("Scores for the student's:");
   sNumber[count][index] = scanner.nextInt();
    
    
 }
  int sum =0;
  int average = (sum/(sNumber.length));
 }
 for(int i=0; i<=sNumber.length-1; i++){
  System.out.println("SUB 1:");
  System.out.println("SUB 2:");
  System.out.println("SUB 3:");
  System.out.println("Average :");
for(int j =0; j<sNumber[i].length-1; j++){
   System.out.print(sNumber[i][j]+ " ");
  }
 }
}
 }
