import java.util.*;
class demoVectorwithObject{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the capacity of the vector: ");
		Vector<Object> v = new Vector<Object>(in.nextInt(),2);
		System.out.print("\nEnter the number of elements belonging to each data type: 1. Integer: ");
		int di = in.nextInt();
		System.out.print("                                                          2. Float: ");
		int df = in.nextInt();
		System.out.print("                                                          3. String: ");
		int ss = in.nextInt();
		System.out.println("\nEnter the elements in the vector:");
		if(di>0){
			System.out.println("\nInteger:");
			for(int i=0;i<di;i++){
				System.out.print((i+1)+": ");
				v.addElement(new Integer(in.nextInt()));
			}
		}
		if(df>0){
			System.out.println("\nFloat:");
			for(int i=0;i<df;i++){
				System.out.print((i+1)+": ");
				v.addElement(new Float(in.nextFloat()));
			}
		}
		if(ss>0){
			System.out.println("\nString:");
			String a[] = new String[ss];
		    for(int i=0;i<ss;i++){
			   System.out.print((i+1)+": ");
			   a[i] = new Scanner(System.in).nextLine();
		    }
			for(String str : a){
				v.addElement(str);
			}
		}
		System.out.println("\nThe elements in the vector are: "+v);
	}
}
