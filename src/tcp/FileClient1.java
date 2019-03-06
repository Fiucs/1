package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient1 {
	public static void main (String[] args)throws Exception {
		System.out.println("----客户端----");
		//socket 指定服务器地址，端口
		Socket client =new Socket("localhost", 8888);
		//操作输入输出流
		InputStream is=new BufferedInputStream(new FileInputStream("src/网络桥接1.png"));//度图片
		OutputStream os=new BufferedOutputStream(client.getOutputStream());//封装发送位置
		byte[] flush=new byte[1024];
		int len =-1;
		while((len=is.read(flush))!=-1)
		{
			os.write(flush, 0, len);
			
		}//循环发送
		is.close();
		os.close();
		//释放资源
		client.close();
		
		
		
	}

}
