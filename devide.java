 import java.util.*;
import  java.io.*;
public class devide{
public static void  main (String args [])
throws IOException
{
	//Scanner sc = new Scanner(System.in);
	String s1;
	BufferedReader reader;
	reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Ip Address:");
	s1=reader.readLine();
	//int myint  =sc.nextInt();
	String[] words=s1.split("\\.");
//	System.out.println(words[0]);
	int n=Integer.parseInt(words[0]);
	//System.out.println("int is "+n);
if(n>=0 &&  n<=127)
{
	System.out.println("Class A");
	System.out.println("Defaut Mask is 255.0.0.0");
	
}
else if(n>=128 &&  n<=191)
{
	System.out.println("Class B");
	System.out.println("Default Mask is 255.255.0.0");
}
else if(n>=192 &&  n<=223)
{
	System.out.println("Class C");
	System.out.println("Default Mask is 255.255.255.0");
}
else if(n>=224 &&  n<=239)
{
	System.out.println("Class D");
}
else if(n>=240 &&  n<=255)
{
	System.out.println("Class E");
}

else
System.out.println("Class NOT FOUND ");

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
}
