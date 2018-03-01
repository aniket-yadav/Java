import java.util.*;
public class demoVector
{
	public static void main(String... S) {
		
		Vector<String> v = new Vector<String>(4,2);
		v.addElement("java");
		v.addElement("c");
		v.addElement("python");
		v.addElement("c++");
		System.out.printf("Size of vector is %d\n",v.size());
		System.out.printf("Capacity of vector is %d\n",v.capacity());
        System.out.printf("First Element of vector is %s \n",v.firstElement());
        System.out.printf("Last Element of vector is %s \n",v.lastElement());
        System.out.printf("Element at index 2 is %s\n",v.elementAt(2));
        System.out.println("Elements  of  Vector ");
        for(Object vec:v)
		{
		System.out.print(vec+"\t");
	    }
        v.removeElement("c");
        System.out.println("\nAfter Removing c from Vector\n");
        System.out.println("Elements  of  Vector ");
		for(Object vec:v)
		{
		System.out.print(vec+"\t");
	    }
	    System.out.println();
	   }
}