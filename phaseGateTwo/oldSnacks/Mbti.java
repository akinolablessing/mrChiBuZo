import java.util.Scanner;
public class Mbti{
public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);

 int[] numbers = new int[20];
 int[] numbersEI = {1,5,9,13,17};
 int[] numbersSN = {2,6,10,14,18};
 int[] numbersTF = {3,7,11,15,19};
 int[] numbersJP = {4,8,12,16,20};

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


for(int count=0; count<values.length; count++){
    System.out.println(values[count][0]);

     
    System.out.print("Click on 1 for A and 2 for B:");
     choose[count] = scanner.nextInt();
     
  }
  System.out.println("Thank you,ss.Here are your answers:");
  
  System.out.println("Question ");

 
 }
}