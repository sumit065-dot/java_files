class D17
{
     {
     System.out.println("Non-static block 1");    
     }
     D17()
     {
     System.out.println("Inside Default constructor");
     }   
     public static void main(String a[])
      {
       System.out.println("Inside Main Method");
       D17 ob=new D17();
       D17 ob1=new D17();
      }
     {
     System.out.println("Non-static block 2");    
     }

}