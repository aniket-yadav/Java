import java.util.*;
class sortData
{
	public void asec(int arr[],int size)
	{
		for (int j = 0;j<size-1 ;j++ )
		{
		 for (int i=0;i<size-1;i++ )
		   {
		 	if(arr[i] > arr[i+1])
		 	{
		 		int temp = arr[i];
		 		arr[i] = arr[i+1];
		 		arr[i+1] = temp;
		 	}
		}
	    }
	    System.out.println("Array Elements in Ascending Order :");
		for(int e : arr)
		{
			System.out.println(e);
		}
	}

	public void desc(int arr[],int size)
	{
		for (int j = 0;j<size-1 ;j++ )
		{
		 for (int i=0;i<size-1;i++ )
		   {
		 	if(arr[i] < arr[i+1])
		 	{
		 		int temp = arr[i];
		 		arr[i] = arr[i+1];
		 		arr[i+1] = temp;
		 	}
		}
	    }
	    System.out.println("Array Elements in Descending Order :");
		for(int e : arr)
		{
			System.out.println(e);
		}
	}

}

class sortingClass
{
	public static void main(String... args)
	{   
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int size = obj.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = obj.nextInt();
		}
		sortData a= new sortData();
		 a.asec(arr,size);
		 a.desc(arr,size);
			
		
	    
	}
}