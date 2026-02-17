//Passing an object to a Method
//Returning object from a method
class X
{
    int a;
 }
class D13
{
    X Display()
     {
      X ob=new X();
      ob.a=133;
      return ob;
     }
       public static void main(String a[])
        {
        D13 ob=new D13();
        X ob1=ob.Display();
        System.out.println(ob1.a);
        
         }
}
         