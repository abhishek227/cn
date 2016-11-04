
import java.io.*;
import static java.lang.Math.pow;
public class subnet
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);

		System.out.println("Enter the ip");
		String s1=br.readLine();
		//String s1="192.168.100.0";
		String words[]=s1.split("\\.");
		
		int n=Integer.parseInt(words[0]);
		int host,i=0;
		
		if(0<=n && n<128)
		{
			System.out.println("Class A");
			System.out.println("Default Subnet mask is 255.0.0.0");
		}
		else if(127<n && n<192)
		{
			System.out.println("Class B");
			System.out.println("Default Subnet mask is 255.255.0.0");
		}
		else if(191<n && n<224)
		{
			System.out.println("Class C");
			System.out.println("Default Subnet mask is 255.255.255.0");
		}
		else if(223<n && n<240)
		{
			System.out.println("Class D");
			System.out.println("Default Subnet mask is 255.255.255.255");
		}
		else if(239<n && n<256)
		{
			System.out.println("Class D");
			System.out.println("Default Subnet mask is 255.255.255.255");
		}
		else
			System.out.println("Class not found");

		System.out.println("Enter the number of hosts for subnet");
		host=Integer.parseInt(br.readLine());
		
		if(host<(pow(2,8)))
		{	for(i=0;i<8;i++)
				if(host<pow(2,i))
				break;
			System.out.println("Network class C");
			System.out.println("The subnet mask is: 255.255.255."+(int)(256-pow(2,i)));
		}
		
		else if(host>(pow(2,8))&&host<(pow(2,16)))
		{	for(i=8;i<16;i++)
				if(host<pow(2,i))
				break;
			System.out.println("Network class B");
			System.out.println("The subnet mask is: 255.255."+(int)(256-pow(2,(i-8)))+".0");
		}
		else if(host>(pow(2,16))&&host<(pow(2,24)))
		{	for(i=16;i<24;i++)
				if(host<pow(2,i))
				break;
			System.out.println("Network class A");
			System.out.println("The subnet mask is: 255."+(int)(256-pow(2,(i-16)))+".0.0");
		}	
	}

	
}

