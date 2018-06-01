import java.util.*;
class simple{
	public static void main(String...Aniket){
		 System.out.print("Enter your name: ");
		String name= new Scanner(System.in).nextLine();
		char n[]=name.toCharArray();
		String m="";
		for(int i=0;i<n.length;i++){
			m+=" "+n[i];
        System.out.printf(" %s\n", m);
	    }
	    
	    for(int i=0;i<n.length-1;i++){
	    	
			m=m.substring(0,m.length()-2);
		
        System.out.printf(" %s\n", m);
	    }
	}
}