public class Task1{
   public int linearSearch(String [] arr , String value ){
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
	String [] arr={"Dua","Nimra","Iqra","Areeza","Sameer"};

	Task1 t=new Task1();
	System.out.print(t.linearSearch(arr, "Iqra"));
	
	
}




}
