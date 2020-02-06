import java.net.*;
import java.io.*;
public class tcpclient1 {

	public static void main(String[] args)throws IOException
	{
		Socket s=new Socket("localhost",784);
		DataInputStream in=new DataInputStream(s.getInputStream());
		 DataOutputStream out=new DataOutputStream(s.getOutputStream());
		 String str=in.readLine();
		 System.out.println("String from TCP server"+str);
		 s.close();
		
	}

}
