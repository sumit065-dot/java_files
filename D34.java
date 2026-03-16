//Array of objects

class D34
  {
    int x;
    public static void main(String a[])
    {
     D34 ob[]=new D34[3];
     ob[0]=new D34();
     ob[0].x=5000;
     ob[1]=new D34();
     ob[1].x=6000;
     ob[2]=new D34();
     ob[2].x=7000;
     for(int i=0;i<3;i++)
     System.out.println(ob[i].x);
    }
}