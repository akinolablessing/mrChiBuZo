import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

System.out.print("How many student's do you have?:");
int studentNumber = scanner.nextInt();

System.out.print("How many subject do they offer?:");
int subject = scanner.nextInt();

System.out.println("Saving >>>>>>>>>>>>>");
System.out.print("Saved successfully");

int[] sNumber = new int[studentNumber];
int[] subjectNum = new int[subject];
for(int count =0; count<sNumber; count++){
  System.out.print("Enter score for student:"+(count + 1)+": ");
  int  score[count] = scanner.nextInt();

}

}
 }
