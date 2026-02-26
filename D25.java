//Object Refrence

class D25
{
    int x;
    public static void main(String a[])
    {
     D25 ob=new D25();
     ob.x=200;
     D25 ob1=new D25();
     ob1.x=500;
     Swap(ob,ob1);
     System.out.println(ob.x);
     System.out.println(ob1.x);
    }

    static void Swap(D25 p,D25 q)
     {
       int m=p.x;
        p.x=q.x;
        q.x=m;
      }
}