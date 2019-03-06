package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp2wayServer1 {

	
	public static void main (String[] args)throws Exception {
		System.out.println("----服务端----");
		
		//1.指定端口
			@SuppressWarnings("resource")
			ServerSocket server =new ServerSocket(8888);
			
			//2.等待accept
			Socket client =server.accept();
			//3.操作输入输出流
			System.out.println("一个客户端连接了");
			
			//4.释放资源
			DataInputStream dis=new DataInputStream (client.getInputStream());
			String data=dis.readUTF();
			//解析数据格式
			String uname="";
			String upwd="";
			
			
			String[] dataArry=data.split("&");
			for(String info:dataArry)
			{
				String [] uinfo=info.split("=");
				if(uinfo[0].equals("uname")) {
					System.out.println("你的用户名："+uinfo[1]);
					uname=uinfo[1];
				}
				else if (uinfo[0].equals("upasswd")) {
					System.out.println("你的用户名密码："+uinfo[1]);
					upwd=uinfo[1];
				} 	
			}
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			
			if (uname.equals("lee")&&upwd.equals("123")) {//成功并发生消息给客户端
				dos.writeUTF("用户名密码检验通过  登陆成功");
				
				
			}else {//fail
				dos.writeUTF("密码或用户名错误");
				
			}
			dos.flush();
			
			dis.close();
			client.close();
			
	}
}
