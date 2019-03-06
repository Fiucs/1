package tcp;

import java.io.DataOutputStream;
import java.net.Socket;

public class Tcpclient1 {

	public static void main (String[] args)throws Exception {
		System.out.println("----客户端----");
		//socket 指定服务器地址，端口
		Socket client =new Socket("localhost", 8888);
		//操作输入输出流
		DataOutputStream dos=new DataOutputStream( client.getOutputStream());
		String data="Hello";
		dos.writeUTF(data);
		dos.flush();
		//释放资源
		client.close();
		
		
		
	}
}
