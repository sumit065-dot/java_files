//Passing an object to a Method
class X
{
    int a;
 }
class D12
{
    void Display(X ob)
     {
      System.out.println(ob.a);
     }
       public static void main(String a[])
        {
         X ob=new X();
         ob.a=100;
         D12 ob1=new D12();
         ob1.Display(ob);
         }
}
         