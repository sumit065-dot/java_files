class A
{
    static void show()
      {
       System.out.println("static method show");
      }
}
class D11
{
     static void Display()
      {
       System.out.println("static method Display");
        A ob=new A();
        ob.show();
        A.show();
      }
       public static void main(String a[])
        {
         Display();
         D11.Display();
         D11 ob=new D11();
         ob.Display();
        }
}