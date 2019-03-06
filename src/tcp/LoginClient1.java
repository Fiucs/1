package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;


public class LoginClient1 {

	public static void main (String[] args)throws Exception {
		
		System.out.println("----客户端----");
		//socket 指定服务器地址，端口
		Socket client =new Socket("localhost", 8888);
		//操作输入输出流
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("请输入用户名:");
		String uname=console.readLine();
		System.out.print("请输入用户名密码:");
		String upwd=console.readLine();
		
		//封装成数据流
		DataOutputStream dos=new DataOutputStream( client.getOutputStream());
		
		dos.writeUTF("uname="+uname+"&"+"upasswd="+upwd);
		dos.flush();
		//释放资源
		client.close();
		
		
		
		
	}
}
