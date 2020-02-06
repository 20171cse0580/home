import java.net.*;
import java.io.*;
import java.util.*;
public class tcpserver1 {

	public static void main(String[] args)throws IOException
	{
		char ch;
		 ServerSocket ss=new ServerSocket(784);
		 Socket s=ss.accept();
		 DataInputStream in=new DataInputStream(s.getInputStream());
		 DataOutputStream out=new DataOutputStream(s.getOutputStream());
		 DataInputStream sysin=new DataInputStream(System.in);
		 Scanner sc=new Scanner(System.in);
		 
		while(true){ System.out.println("Enter an String: ");
		 String str=sysin.readLine();
		 out.writeBytes(str+"\n");
		
		 s.close();
		}
		 

	}

}
