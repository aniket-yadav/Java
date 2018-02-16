 import java .util.*;
 class mainClass 
 {
       public static void main(String[] args)
         {
               Scanner obj = new Scanner(System.in);
               System.out.println("Enter Size Of  Array :");
               byte size = obj.nextByte();
               System.out.println("Enter Element Of Array :");
               int[] numbers=new int[size];
               for (int i=0;i<size ;i++ )
               {
                numbers[i]=obj.nextInt();
                       
               }
               
                
                int smallest = numbers[0];
                int largest = numbers[0];
               
                for(int i=1; i< numbers.length; i++)
                {
                        if(numbers[i] > largest)
                        {
                                largest = numbers[i];
                        }
                        else if (numbers[i] < smallest)
                        {
                                smallest = numbers[i];
                        }
                       
                }
               
                System.out.println("Largest Number is : " + largest);
                System.out.println("Smallest Number is : " + smallest);
        }
}
 
