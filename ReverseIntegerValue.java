import java.util.Arrays;
public class ReverseIntegerValue{
public static void main(String[] args){
int[] numbers = {1,2,3,4,5,6};

int max = findMax(numbers);
System.out.print("The largest number is:");
System.out.println(max);
int[] reverse = reverseInteger(numbers);
System.out.print("The reverse of the numbers is:");
System.out.print(Arrays.toString(reverse));




  }
 



    public static int findMax(int[] number) {
               
        int largest = number[0];
        for (int i : number) {
            if (largest < i)  
           largest = i;      
       
    }
	 return largest;
	}
    
  public static int[] reverseInteger(int[] number){
       int[] result = new int[number.length];
       int index = 0;
  	for(int count=number.length-1; count>=0; count--){
         result[index] = number[count];
         index++;
          	
 	}
     return  result;
     }
 public static int[] OccurElent(int[] number){
 how to check whether an element occurs in a list
 
}

}