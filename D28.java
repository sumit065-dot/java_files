import java.io.*;
class D28
{
	InputStreamReader inr =new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(inr);
	int arr[]=new int [3];
	void loadArray() throws IOException
	{
		System.out.println("Load Array:");
		for(int i=0;i<3;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
	}
	void DisArray() throws IOException
	{
		System.out.println("Display Array are:");
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void  main(String a[]) throws IOException
	{
		D28 D=new D28();
		D.loadArray();
		D.DisArray();
	}
}