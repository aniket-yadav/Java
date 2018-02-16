class Student
{  
    int id;  
    String name;  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  

    void display()
    {
      System.out.println(id+" "+name);
    } 
    public void finalize()
    {
      System.out.println("Destructor is called.");
    } 
  }
  class demoDestructor
  {
    public static void main(String args[])
    {  
    Student s1 = new Student(58,"Aniket");  
    Student s2 = new Student(40,"Ajay");    
    s1.display();  
    s2.display(); 
    s1 = null;
    s2 = null;
    System.gc(); 
   }  
}  