import java.util.Scanner;

class fibonacci  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//taking length as input 
		System.out.print("Enter Length of fibonacci series : ");
		int len = sc.nextInt();
		// creating an array of length 
		int[] fiboarr = new int[len];
		// assigning 0 ,1 to index 0 and 1
		fiboarr[0]= 0;
		fiboarr[1]=1;
		//calculating series with for loop 
		for(int i=2;i<len;i++){
			fiboarr[i]=fiboarr[i-1]+fiboarr[i-2];
		}

		//display the series
		for (int i=0;i<len;i++){
			System.out.print(fiboarr[i]+" ");
		}

	}
}