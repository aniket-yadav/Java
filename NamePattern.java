/* this is a program to draw pattern like below with input value 
i/p = aniket
o/p :
  a
  a n
  a n i
  a n i k
  a n i k e
  a n i k e t
  a n i k e
  a n i k
  a n i
  a n
  a
*/

import java.util.*;
class NamePattern{
	// you can write anything at args like this 
	public static void main(String...Aniket){
		//take input 
		 System.out.print("Enter your name: ");
		String name= new Scanner(System.in).nextLine();
		// string to char array
		char n[]=name.toCharArray();
		//a temp varible
		String m="";
		//keep adding char till complete name
		for(int i=0;i<n.length;i++){
			m+=" "+n[i];
        		System.out.printf(" %s\n", m);
	   		 }
	    //keep cutting last char till last one
	        for(int i=0;i<n.length-1;i++){
	    	
			m=m.substring(0,m.length()-2);
		
       		 System.out.printf(" %s\n", m);
	    }
	}
}
