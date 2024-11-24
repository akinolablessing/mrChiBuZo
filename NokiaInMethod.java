import java.util.Scanner;
public class NokiaInMethod{
public static void main(String[] args){

 nokiaPhone();
}
 public static void nokiaPhone(){
 Scanner scanner = new Scanner(System.in);
  
System.out.print("""
             ====Nokia Menu====:
           1.Phone book.
           2.Messages.
           3.Chat.
           4.Call register.
           0.--> go back to menu~~
""");
int menu = scanner.nextInt();
switch(menu){
 case 1:
 System.out.print("""
   ~~~~~PHONE BOOK~~~~~
         1.Search
         2.Service Nos
         3.Add name
         4.Erase
         5.Edict
         6.Assign tone
         7.Send b'card
         8.Options
         9.Speed dials
         10. voice tags
         0.--> go back to menu~~ 
""");
 int select = scanner.nextInt();
  switch(select){
  case 1:
  System.out.print("~~Search.....");
  break;
 case 2:
 System.out.print("~~Kindly enter your service numbers:");
 Long num = scanner.nextLong();
 break;
 case 3:
 System.out.print("~~Kindly enter your name: ");
 String name = scanner.next();
 break;
 case 4:
 System.out.print("~~Erase.. ");
 break;
 case 5:
 System.out.print("~~Edict.. ");
 break;
case 6:
 System.out.print("~~Kindly assign tone.. ");
 String tone = scanner.next();
 break;
case 7:
 System.out.print("~~Kindly send b'card...");
 break;
case 8:
 System.out.print("""
       ~~~PICK AN OPTIONS~~~
        1.Type of view
        2.Memory status
        0.--> go back to menu~~
""");
int view = scanner.nextInt();
switch(view){
case 0:
nokiaPhone();
break;
default:
 System.out.print("it is not part of our service!!!");
 break;

}

 break;
case 9:
 System.out.print("~~Speed dials...");
 break;
case 10:
 System.out.print("~~Voice tags...");
 break;
case 0:
 nokiaPhone();
 break;
default:
System.out.print("Invalid input!!");
break;

}
break;
case 2:
System.out.print("""
       ~~~~MESSAGES~~~~
        1.Write messages
        2.Inbok messages
        3.Outbook
        4.Picture messages
        5.Template
        6.Smileys
        7.Messages settings
        8.Info service
        9.Voice mailbox number
        10.Service command editor
        0.--> go back to menu~~
""");
int sets = scanner.nextInt();
switch(sets){
case 1: 
 System.out.print("~~~~~~Write messages~~~~~");
 break;
case 2:
System.out.print("~~~~~Inbok messages~~~~~~");
 break;
case 3:
System.out.print("~~~~~Outbook messages~~~~~~");
 break;
case 4:
System.out.print("~~~~~Picture messages~~~~~~");
 break;
case 5:
System.out.print("~~~~~Choose Template of your choice~~~~~~");
 break;
case 6:
System.out.print("~~~~~Smileys~~~~~~");
 break;
case 7:
System.out.print("""
     ~~~~~Select One~~~~~~   
      1.Sets
      2.Common
      0.--> go back to menu~~

""");
int step = scanner.nextInt();
switch(step){
 case 1:
  System.out.print("""
     1.Message centre number >>
     2.Message sent as >>
     3.Message validity >>
""");
 break;
case 2:
System.out.print("""
     1.Deliver reports >>
     2.Reply via same centre >>
     3.Character support >>
""");
break;
case 0:
nokiaPhone();
break;
 }
case 8:
System.out.print("~~~Info service~~~");
 break;
case 9:
System.out.print("~~~Voice mailbox number~~~");
 break;
case 10:
System.out.print("~~~Service command editor~~~");
 break;


 case 0:
 nokiaPhone();
 break;
default:
System.out.print("Invalid input!!");
break;
 
}
break;
case 3:
 System.out.print("Chat >>");
 break;
 case 4:
 System.out.print("""
      ~~CALL REGISTER~~
       1.Missed calls
       2.Received calls
       3.Dialled numbers
       4.Erase resent lists
       5.Show call duration
       6.Show call costs
       7.Call cost settings
       8.Prepaid credit
       0.--> go back to menu~~

""");
int register = scanner.nextInt();
switch(register){
 case 1:
  System.out.print("~~Missed calls~~");
  break;
case 2:
  System.out.print("~~Received calls~~");
  break;
case 3:
  System.out.print("~~Dialled numbers~~");
  break;
case 4:
  System.out.print("~~Erase resent lists~~");
  break;
case 5:
  System.out.print("""
     ~~Show call duration~~
      1.Last call duration
      2.All call's cost
      3.Clear counters
""");
  break;
 case 6:
 System.out.print("""
       ~~~Show call costs~~~
       1.Last call cost
       2.All call's cost
       3.Clear counters
""");
break;
case 7:
System.out.print("""
      ~~~Call cost settings~~~
       1.Call cost limit
       2.Show costs in
       0.--> go back to menu~~
""");
int cost = scanner.nextInt();
switch(cost){
case 0:
nokiaPhone();
break;
default:
 System.out.print("it is not part of our service!!!");
 break;

}
break;
case 8:
System.out.print("Prepaid credit>>>>>>");
break;

 case 0:
 nokiaPhone();
 break;

}
break;
case 0:
nokiaPhone();
break;
 default:
 System.out.print("it is not part of our service!!!");
 break;
 }
 }
}