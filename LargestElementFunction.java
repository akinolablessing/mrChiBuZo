
//Question;
//Write a function that returns the largest element in a list 

public class LargestElementFunction {
    public static int findMax(int[] number) {
               
        int largest = number[0];
        for (int i : number) {
            if (largest < i)  
           largest = i;      
       
    }
	 return largest;
	}
    
    public static void main(String[] args) {
               int[] array = {1, 5, 10, 100, 20};
        int result = findMax(array);
        System.out.println("The largest element is: " + result);
        
     }
}