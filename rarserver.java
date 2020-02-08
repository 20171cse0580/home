/* Address Resolution Protocol (ARP) is used to resolve an IPv4 address (32 bit Logical Address) */
/*to the physical address (48 bit MAC Address)*/
import java.io.*;
import java.net.*;
class rarserver
{
 public static void main(String args[])throws IOException
 {
  ServerSocket ss=new ServerSocket(2204);
  Socket s=ss.accept();
  DataInputStream in=new DataInputStream(s.getInputStream());
  DataOutputStream out=new DataOutputStream(s.getOutputStream());
  DataInputStream sysin=new DataInputStream(System.in);
  System.out.println("Enter an MAC Address:");
  String str=sysin.readLine();
  out.writeBytes(str+"\n");
  System.out.println("The corresponding IP address"+in.readLine());
 }
}

