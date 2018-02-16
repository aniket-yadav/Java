abstract class Shape
{  
abstract void draw();  
}  

class Rectangle extends Shape
{  
void draw()
{
	System.out.println("drawing rectangle");
}

}  
class Circle extends Shape
{  
void draw()
{
	System.out.println("drawing circle");
}  
}  

class demoAbstract
{  
public static void main(String...args)
{  
Circle s1=new Circle();
s1.draw();  
Rectangle s2 = new Rectangle();
s2.draw();
}  
}  