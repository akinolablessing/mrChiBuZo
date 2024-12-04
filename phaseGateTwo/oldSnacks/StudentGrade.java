 import java.util.*;
public class StudentGrade{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

 int index =0;
 int noOfStudents;
 int score;
 int row;
 String string = "=";
 

System.out.println("How many student's do you have?:");
int student = scanner.nextInt();

System.out.println("How many subject do they offer?:");
int subject = scanner.nextInt();

System.out.println("Saving >>>>>>>>>>>>");
System.out.println("saved successfully");

int[][] numbers = new int[student][subject];
for(int count=0; count<numbers.length; count++){
  System.out.println("Enter score for student"+(count + 1)+"~~");
    for(index=0; index<subject; index++){
       System.out.print("Enter score for subject"+(index + 1)+":");
       numbers[count][index] = scanner.nextInt();
       System.out.println("Saving >>>>>>>>>>>");
       System.out.println("Saved Successfully");
      }

     }
    System.out.println("========================================================");
System.out.print("STUDENT'S");

 for(int column=0; column<index; column++){
  System.out.print("\tSUB"+(column + 1));
}
 System.out.print("\t TOT");
 System.out.print("\t AVE");
 System.out.print("\t POS");


int[] total = new int[numbers.length];
int[] position = new int[numbers.length];

double average =0;
int column;
int totalResult =0;
int increment =0;

for(int counter=0; counter<numbers.length; counter++){

  int totalScore=0;

  for(int counter1=0; counter1<numbers[counter].length; counter1++){
	totalScore += numbers[counter][counter1];
  }
 total[counter] = totalScore;
 }
for(row =0; row<numbers.length; row++){
 System.out.print("\n STUDENTS"+(row + 1));

for(column =0; column<subject; column++){
 System.out.print("\t"+numbers[row][column]+ "");
  average = total[row]/numbers[row].length;

  }
  System.out.print("\t"+total[row]);
  System.out.print("\t"+average);
  System.out.println("\t"+getPosition(total)[row]);
 }
 System.out.println("=================================================="+string.repeat(subject));
 System.out.println("=================================================="+string.repeat(subject));

int[] studentPlus = new int[subject];
int studentPlusOne =0;
int[] maximum = new int[subject];
for(int counter=0; counter<subject; counter++){
  for(int x=0; x<subject; x++){
   if(numbers[x][counter] > maximum[counter]){
    maximum[counter] = numbers[x][counter];
    studentPlusOne = x + 1;
   }
  }
   studentPlus[counter]=studentPlusOne;
 }
int[] hardestSubject = new int[subject];
 int[] minimum = new int[subject];
 for(int counter=0; counter<subject; counter++){
 minimum[counter] = 100;

  for(int y=0; y<student; y++){
    if(numbers[y][counter] < minimum[counter] ){
     minimum[counter] = numbers[y][counter]; 
    }
   }
  }
  int[] subjectTotal = new int[subject];
  double[] subjectAverage = new double[subject];

   for(int counter=0; counter<subject; counter++){
    for(int y=0; y<student; y++){
     subjectTotal[counter] +=numbers[y][counter];
      subjectAverage[counter] =(double) subjectTotal[counter]/subject;

  }
}
 int passes =0;
 int fail = 0;
 int numbersOfStudents =0;

for(numbersOfStudents=0; numbersOfStudents<subject; numbersOfStudents++){
 for(int counter =0; counter<subject; counter++ ){

  if(subjectTotal[counter] > 70){
   passes++;
  }
  if(subjectTotal[counter] < 50){
   fail++;
 }
  }
 }
  System.out.println();
  System.out.print("SUBJECT SUMMARY~~~~~");
  System.out.println();
  for(int counter =0; counter<subject; counter++){
   System.out.println("SUBJECTS"+(counter + 1));
    System.out.println("Highest scoring student is:"+"Student"+studentPlus[counter]+"scoring"+maximum[counter]);
   System.out.println("Lowest soring student is:"+minimum[counter]);

  System.out.println("Total score is:"+subjectTotal[counter]);
  System.out.printf("Average score is: %.2f\n", subjectAverage[counter]);
System.out.println("Number of passes:"+passes);
System.out.println("Number of fails"+fail);
System.out.println();
  
}
 }
public static int[] fillArrayFunction(int[] collectInput){
 int[] array = new int[collectInput.length];
 for(int counter=0; counter<collectInput.length; counter++){
   array[counter] =1;
   
 }
  return array;
}
public static int[] getPosition(int[] array){
  int[] positionArray = new int[array.length];
  int[] fillArray = fillArrayFunction(array);
  for(int count = 0; count<array.length; count++){
    for(int counter=0; counter<array.length; counter++){
       if(array[counter] > array[count]){
         fillArray[count] +=1;
      }
  	}
 }
 return fillArray;
 }
}