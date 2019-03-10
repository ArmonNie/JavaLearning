package NetPrograming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class Client1 {
	
	private InetAddress serverAddress;
	private int port;
	private String host;
	private SocketAddress socketaddress = null;
	
	
	public Client1(String host,int port)
	{
		this.host = host;
		this.port = port;
	}
	
	public Client1(InetAddress serverAddress,int port)
	{
		this.serverAddress = serverAddress;
		this.port = port;
	}
	
	public void Init()
	{
		socketaddress = new InetSocketAddress(host,port);
	}
	
	public void Connect()
	{
		Socket socket = null;
		try {
			long begin = System.currentTimeMillis();
			socket.connect(this.socketaddress);
			long end = System.currentTimeMillis();
			System.out.println("链接服务器花费时间：" + (end - begin));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
