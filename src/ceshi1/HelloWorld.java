package ceshi1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*IP dingwei*/
public class HelloWorld {
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress addr = InetAddress.getLocalHost();
        //返回IP地址：192.168.1.110
        System.out.println(addr.getHostAddress()); 
        //输出计算机名：gaoqi
        System.out.println(addr.getHostName()); 
        
        InetAddress addr1 = InetAddress.getByName("www.shsxt.com");
        // 返回 sxt服务器的IP:59.110.14.7
        System.out.println(addr1.getHostAddress());
        // 输出：www.sxt.cn
        System.out.println(addr1.getHostName());
		System.out.println("Hello World");
	}

}
