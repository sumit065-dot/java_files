/*Static modifier:-static is keyword and is a modifier.static variable are declared outside the method and constructor.static variable or method can be accessed through class name,object and directly*/

class D10
{
     static void show()
      {
       System.out.println("static method");
      }
       public static void main(String a[])
        {
         show();
         D10.show();
         D10 ob=new D10();
         ob.show();
        }
}