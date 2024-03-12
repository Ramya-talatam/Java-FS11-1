public class MaxElementInArray
{
  

public static int findMaxElement (int[]array)
  {
	
int mx = array[0];
	 

for (int i = 1; i < array.length; i++)
	  {
		
if (array[i] > mx)
		  {
			
mx = array[i];
		  
}
	   
}
	 

return mx;
  
}
  
 
public static void main (String[]args)
  {
	
int[] a = { 7, 2, 9, 4, 1, 6, 8 };
	
 
int mx = findMaxElement (a);
	
 
System.out.println ("The maximum element in the array is: " + mx);

} 
} 
