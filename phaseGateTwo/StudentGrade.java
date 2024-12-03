// I changed the code because is not giving me the result i want sir

import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
 public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
 
System.out.print("How many student's do you have?:");
int studentNumber = scanner.nextInt();

System.out.print("How many subject do they offer?:");
int studentSubject = scanner.nextInt();

System.out.println("Saving >>>>>>>>>>>>>>>>>>");
System.out.println("Saved successfully");

int sum =0; 
int average =0;
int score =0 ;


int[][] scoresNumber = new int[studentNumber][studentSubject];

for(int count=0; count<studentNumber; count++){
 System.out.println("Enter score for student" +(count +1)+ ":");
   System.out.println("=============================================");

 for(int index =0; index<studentSubject; index++){
    
    
      do{
       System.out.println("Enter score for subject:"+(index +1)+":");
       score = scanner.nextInt();
        sum+=score;
        
         
             if(score < 0|| score > 1000){
       System.out.println("Please enter a score between between 0 and 100");
   }
    }while(score < 0 || score > 100);
   scoresNumber[count][index] = score;
    
      }
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println("The total of the scores is:"+sum); 
   

}
System.out.println("===========================================================");

System.out.printf("%s%8s%8s%8s%8s%8s%8s%n","STUDENT" , "SUB 1"  ,"SUB 2"  ,"SUB 3","TOT","AVE","POS" );
System.out.print("==============================================================");
System.out.printf("%19s%6d%6d%6d%n"," Student1",score,score,score);

System.out.println("THE SUBJECT SUMMARY ~~~~~"); 
if(score<=0 || score <=20){
 System.out.println("STUDENT FAIL");
 }
if(score>=21 || score <=50){
 System.out.println("Average STUDENT");
 }
if(score>=51 || score <=100){
 System.out.println("BEST STUDENT");
 }


}
}


