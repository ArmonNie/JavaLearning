package NetPrograming;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	
	//在服务器端端口应该是开发者确定（而不应该有系统确定），本程序服务器监听8000端口
	//绑定的IP地址即是本机IP
	private int port;
	private ServerSocket serversocket = null;
	
	public Server1()
	{
		this.port = 8000;
	}
	
	public Server1(InetAddress RemoteAddress,int port)
	{
		this.port = port;
	}
	
	public void Init() throws IOException
	{
		this.serversocket = new ServerSocket(port);
	}
	
	public void service()
	{
		while(true)
		{
			Socket socket = null;
			try {
				socket = serversocket.accept();
				System.out.println("请求信息：" + socket.getRemoteSocketAddress());
			}
			catch(IOException e)
			{
				System.out.println("链接出错");
			}
			finally
			{
				try {
					if(socket != null) socket.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
