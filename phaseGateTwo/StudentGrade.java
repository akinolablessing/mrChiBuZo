// I changed the code because is not giving me the result i want sir
// sum/grade[1].length
import java.util.Scanner;
import java.util.Arrays;
public class Correction{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 
System.out.print("How many student's do you have?:");
int studentNumber = scanner.nextInt();

System.out.print("How many subject do they offer?:");
int studentSubject = scanner.nextInt();

int sum =0; 
int average =0;
int[][] scoresNumber = new int[studentNumber][studentSubject];
int[] totalNumber = new int[studentNumber];
int[] averageNumber = new int[studentNumber];

for(int count=0; count<studentNumber; count++){
 System.out.println("Enter score for student" +(count +1)+ ":");
  System.out.println("=============================================");

 for(int index =0; index<studentSubject; index++){
    int score;
    
      do{
       System.out.println("Enter score for subject:"+(index +1)+":");
       score = scanner.nextInt();
        sum+=score;
         
             if(score < 0|| score > 1000){
       System.out.print("Please enter a score between between 0 and 100");
   }

  }while(score < 0 || score > 100);
   scoresNumber[count][index] = score;
    
      }
  
  System.out.println("The total of the score is:"+sum);
    
}
}
}


