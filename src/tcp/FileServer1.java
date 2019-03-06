package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileOutputStream;
import java.io.InputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class FileServer1 {
	public static void main(String[] args)throws Exception {
		System.out.println("----服务端----");
	
//1.指定端口
	ServerSocket server =new ServerSocket(8888);
	
	//2.等待accept
	Socket client =server.accept();
	//3.操作输入输出流
	System.out.println("一个客户端连接了");
	
	//4.释放资源
	InputStream is=new BufferedInputStream(client.getInputStream());
	BufferedOutputStream os =new BufferedOutputStream(new FileOutputStream("src/Tcp.png"));//存储位置
	byte[] flush=new byte[1024];
	int len =-1;
	while((len=is.read(flush))!=-1)
	{
		os.write(flush, 0, len);
		
	}//循环发送
	is.close();
	os.close();
	
	
	client.close();
	
	server.close();

	}	
	
	
}

