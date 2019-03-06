package tcp;
/*
 * 监听 输出流《--》输入流
 * */

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcpserver1  {
	
	public static void main(String[] args)throws Exception {
		System.out.println("----服务端----");
	
//1.指定端口
	ServerSocket server =new ServerSocket(8888);
	
	//2.等待accept
	Socket client =server.accept();
	//3.操作输入输出流
	System.out.println("一个客户端连接了");
	
	//4.释放资源
	DataInputStream dis=new DataInputStream (client.getInputStream());
	String data=dis.readUTF();
	System.out.println(data);
	dis.close();
	client.close();
	server.close();
}	
	
}
