package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpClient1 {
		public static void main(String[] args)throws Exception {
			System.out.println("ready to send...");
			
			//1DatagramSocket 指定端口，
			DatagramSocket client=new DatagramSocket(8889);
			//2.准备数据转成字节数组、
			String data="我是谁";
			//3.封装为DatagramPacket 指定目标地址
			byte [] datas=data.getBytes();
			DatagramPacket packet =new DatagramPacket(datas,datas.length,new InetSocketAddress("localhost", 9999) );
			//4.发送send(DatagramPacket p)*
			client.send(packet);
			//5.释放资源
		client.close();
			
			
		}
	
	
}
