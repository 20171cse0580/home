import java.net.*;
import java.util.*;
public class IPFinder
{
public static void main(String[] args)
{
	String host;
	Scanner input=new Scanner(System.in);
	System.out.println("\n\nEnter host name: ");
	host = input.next();
	try
	{
		InetAddress address = InetAddress.getByName(host);
		System.out.println("ip address: "+ address.toString());
	}
	catch(UnknownHostException uhEX)
	{
		System.out.println("could not find "+host);
		
		
}
}
}


