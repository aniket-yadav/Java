 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Iterator;

class checkprimeforinterval {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//lower bound 
			System.out.print("Enter lower bound : ");
			int lb= sc.nextInt();
			//upper bound
			System.out.print("Enter upper bound : ");
			int ub= sc.nextInt();
			// create arraylist to store prime numbers
			ArrayList  primeList = new ArrayList();
			//check each number from lower to uppar bound 
			for(int i=lb ; i<ub;i++){
				if (isprime(i)) {
					//is i is prime add it to primeList
					primeList.add(i);
				}
			}

			//crerate object of iterator 
			Iterator  it = primeList.iterator();
			//run while loop till there is any value in primeList
			while(it.hasNext()){
				//print prime numbers
				System.out.println(it.next());
			}

					
		}	

		private static boolean isprime(int no){

			//half the no to save time 
			int n= no/2;
			int flag =0;
			//check no is divisible by 2 to n 
			for(int i= 2 ; i<=n ;i++){
				if (no % i==0) {
					//if no is divisible then set flag 1 and break the loop
					flag=1;
					break;
				}
			}
			if (flag==1) {
				//return false if no is non prime 
				return false;
			}else{
				//retrun true if number is  prime
				return true;
			}

		} 
}