import java.net.*;
public class MyLocalIPAddress {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("The ip address :"+address);

	}

}
