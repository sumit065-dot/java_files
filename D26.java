class D26
{
        int num;
	D26 setValue(int n)
	 {
        D26 obj = new D26();
        obj.num = n;
        return obj;     // returning object reference
  	  }

        void display()
	 {
          System.out.println("Value = " + num);
         }

    public static void main(String[] args)
	 {
        D26 d1 = new D26();
        D26 d2 = d1.setValue(200);

        d2.display();
      }
}