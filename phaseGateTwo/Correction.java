import java.util.Scanner;
import java.util.Arrays;
public class Correction{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 
System.out.print("How many student's do you have?:");
int studentNumber = scanner.nextInt();

System.out.print("How many subject do they offer?:");
int studentSubject = scanner.nextInt();


 
int[][] scoresNumber = new int[studentNumber][studentSubject];
int[] total = new int[studentNumber];
int[] average = new int[studentNumber];

for(int count=0; count<studentNumber; count++){
 System.out.println("Enter score for student" +(count +1)+ ":");

 for(int index =0; index<studentSubject; index++){
    int score;
      do{
       System.out.println("Enter score for subject:"+(index +1)+":");
       score = scanner.nextInt();
      if(score < 0|| score > 1000){
       System.out.print("Please enter a score between between 0 and 100");
   }

  }while(score < 0 || score > 100);
   scoresNumber[count][index] = score;
 }
}
}
}


 