import java.util.*;

class circle
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter radius of circle");
		double r = obj.nextFloat();
        
		double p,a;
		System.out.println("Perimeter of circle");
		p=2*Math.PI*r;
		System.out.printf("%.4f\n",p);
		System.out.println("Area of circle");
		a=Math.PI*Math.pow(r,2);
		System.out.printf("%.4f\n",a);


	}
}