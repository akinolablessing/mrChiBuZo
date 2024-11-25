public class Quantization{
	public static void main(String... agrs){
	
	int[] pixels = {10,30,50,70,90,110,130,150,170,190};
	for(int count = 0; count<pixels.length;count++ ){
		if(count==8){
		System.out.printf("%nfor %2d-%3d: %d " , count*20+1 ,count*20 +20, pixels[count]); 	

		}
		else if(count == 0 ){
			//System.out.printf("for %2d-%3d:" , count*20 ,count*20 +20);
                      
		}
		else{			
			//System.out.printf("for %2d-%3d:" , count*20+1 ,count*20 +20);
                      	
		}
               
		//System.out.print(pixels[count]);
		System.out.println();
		}
               //System.out.printf("and for all others pixel values, assumed a quantized value of: %5d " ,pixels[9] );

             }

	}

