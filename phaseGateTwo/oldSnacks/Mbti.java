import java.util.Scanner;

public class Mbti{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

 String[] numbersEI =new String[5];
 String[] numbersSN = new String[5] ;
 String[] numbersTF =new String[5];
 String[] numbersJP = new String[5];

 String[][] values = {
{"1. A. Expend energy, enjoy groups \t B.Conserve energy, enjoy one-on-one"},

{"2. A. Interpret literally \t B.Look for meaning and possibilities"},

{"3. A. Logical,thinking, questioning \t B.Empathetic, feeling, accommodating"},
  
{"4. A. Organized, orderly \t B.Flexible, adaptable"},

{"5. A. More outing, think out loud \t B.More reserved, think of yourself"},

{"6. A. Practical, realistic, experiential \t B.Imaginative"},

{"7. A. Candid, straight forward, frank \t B.Tactful, kind, encouraging"},

{"8. A. Plan, schedule \t B.Unplanned, spontaneous"},

{"9. A. Seek many tasks, public activities, interation with others \t B.Seek private, solitary activities with quite to concentrate"},

{"10. A. Standard, usual, conventional \t B.Different, novel, unique"},

{"11. A. Firm, tend to criticize, hold the line \t B.Gentle, tend to appreciate, conciliate"},

{"12. A. Regulated, structured \t B.Easygoing, live and let live"},

{"13. A. External, communicative, express yourself \t B.Internal, reticent, keep to yourself"},

{"14. A. Focus on here-and-now \t B.Look to the future, global perspective, big pic "},

{"15. A. Tough-minded, just \t B.Tender-hearted, merciful"},

{"16. A. Preparation, plan ahead \t B.Go with the flow, adapt as you go "},

{"17. A. Active, initiate \t B.Eflective, deliberate"},

{"18. A. Facts,things, what is \t B.Ideas, dreams, What could be, philosophical "},

{"19. A. Matter of fact, issue-oriented \t B.Sensitive, people-oriented, compassionate"},

{"20. A. Control, govern \t B.Latitude,freedom"}
   };


String[] answer =new String[20];
for(int count=0; count<values.length; count++){

for(int index=0; index<values[count].length; index++){
     System.out.println("Click on A or B:");
	System.out.println(values[count][index]);
  	answer[count] = scanner.next();
    } 
  }

 
  numbersEI[0] = answer[0];
  numbersEI[1] = answer[4];
  numbersEI[2] = answer[8];
  numbersEI[3] = answer[12];
  numbersEI[4] = answer[16];

  numbersSN[0] = answer[1];
  numbersSN[1] = answer[5];
  numbersSN[2] = answer[9];
  numbersSN[3] = answer[13];
  numbersSN[4] = answer[17];

  numbersTF[0] = answer[2];
  numbersTF[1] = answer[6];
  numbersTF[2] = answer[10];
  numbersTF[3] = answer[14];
  numbersTF[4] = answer[18];
 
  numbersJP[0] = answer[3];
  numbersJP[1] = answer[7];
  numbersJP[2] = answer[11];
  numbersJP[3] = answer[15];
  numbersJP[4] = answer[19];

      System.out.println("The result for Question 1,5,9,13,17");
      System.out.println( numbersEI[0]);
        System.out.println(  numbersEI[1]);
          System.out.println( numbersEI[2]);
            System.out.println( numbersEI[3]);
             System.out.println(numbersEI[4]);


    System.out.println("The result for Question 2,6,10,14,18");
     System.out.println( numbersSN[0]);
       System.out.println(  numbersSN[1]);
         System.out.println( numbersSN[2]);
           System.out.println( numbersSN[3]);
             System.out.println(numbersSN[4]);

    
   System.out.println("The result for Question 3,7,11,15,19");
     System.out.println( numbersTF[0]);
       System.out.println(  numbersTF[1]);
         System.out.println( numbersTF[2]);
           System.out.println( numbersTF[3]);
             System.out.println(numbersTF[4]);

  System.out.println("The result for Question 4,8,12,16,20");
     System.out.println( numbersJP[0]);
       System.out.println(  numbersJP[1]);
         System.out.println( numbersJP[2]);
           System.out.println( numbersJP[3]);
             System.out.println(numbersJP[4]);




  System.out.println("Thank you,.Here are your answers:");
  System.out.println("Question ");
 }
}