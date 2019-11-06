
public class Task1{
   public int linearSearch(char [] arr , char value ){
	   for(int i=0; i<arr.length ; i++)
	   {
		   if(arr[i]==value)
		   {
			   return i;
		   }
		   
	   }
	   return -1;
	   
   }
public static void main(String args[])
{
char [] arr={'N','I','M','R','A'};

Task1 t=new Task1();
System.out.print(t.linearSearch(arr, 'A'));
	
	
}




}
