package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*1.DatagramSocket 创建接收端
 * 2.准备容器封装为DatagramPacket
 * 
 * */
public class UdpServer1 {

	public static void main(String [] args)throws Exception {
	
		System.out.println("接受方启动");
		//1.DATa gramSocket指定端口
		DatagramSocket server=new DatagramSocket(9999);
	//2.准备容器封装为Datagrampacket
		byte[] container=new byte[1024 *60];
		DatagramPacket packet=new DatagramPacket(container, 0, container.length);
	//3，阻塞式接受 receive(DatagramPacket p)
		server.receive(packet);
		//4.解析数据byte[] getData() getLength()
		byte[] datas=packet.getData();
		System.out.println(new String(datas,0,datas.length));
		//5.释放资源
		server.close();
}
}
