import java.net.*;
import java.io.*;

public class ClientProgram {
	public static DatagramSocket ds;
	public static int clientport=6122,serverport=6124;
	public static byte buffer[]=new byte[1204];
	public static void main(String[] args) throws Exception
	{
		ds=new DatagramSocket(clientport);
		System.out.println("Client is waiting for sender to send data");
		System.out.println("Press Ctrl+C to come out");
		
		while(true)
		{
			DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
			ds.receive(dp);
			String pdata=new String(dp.getData(),0,dp.getLength());
			System.out.println(pdata);
		}
	}

}
