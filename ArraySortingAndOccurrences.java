public class ArraySortingAndOccurrences
{
  



public static void Sort (int[]array)
  {
	
int n = array.length;
	 
boolean swapped;
	 

	do
	  {
		
swapped = false;
		
for (int i = 1; i < n; i++)
		  {
			
if (array[i - 1] > array[i])
			  {
				
 
int temp = array[i - 1];
				 
array[i - 1] = array[i];
				 
array[i] = temp;
				 
swapped = true;
			   
}
		   
} 
n--;
	  
}
	while (swapped);
  
}
  
 
public static int findOccurrences (int[]array, int number)
  {
	
int count = 0;
	
 
for (int i = 0; i < array.length; i++)
	  {
		
if (array[i] == number)
		  {
			
count++;
		  
}
	  
}
	
 
return count;
  
}
  
 
public static void main (String[]args)
  {
	
int[] array = { 4, 2, 8, 3, 5, 7, 8, 2, 4, 8, 6, 1, 8 };
	
 
Sort (array);
	
 
System.out.println ("Sorted Array: ");
	
for (int i = 0; i < array.length; i++)
	  {
		
System.out.print (array[i] + " ");
	  
} 
System.out.println ();
	
int numberToFind = 8;
	
int occurrences = findOccurrences (array, numberToFind);
	
 
System.out.println ("Number of occurrences of " + numberToFind + ": " +
						   occurrences);

} 
} 
