package Io.jichu;

import java.io.File;

/**
 * @author FKU
 * 打印子孙目录
 *
 */
public class FileCountName {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File src=new File("G:/eclipse/如文件不能打开，请加qq2087659503联系小姐姐");
		FileCountName s= new FileCountName();
		s.printName(src);
		countSize(src);
		System.out.println(len);

	}
	private static long len=0;
	public  void printName(File src) {
		if (src.isFile()) {
			System.out.println(src.getName());//打印出文件名字 或者打印出目录名
		}
		
		if(null==src||!src.exists())//没有下一级或者文件目录不存在
		{
			return;
			
		}
		else if (src.isDirectory()) {
			for (File name : src.listFiles()) {
				printName(name);//递归找寻 文件
				
			}
			
		}
		
	}
	public static void countSize(File src) {
		
//		if(src.isFile())
//		{
//			len+=src.length();
//				
//		}
//		
//		if(null==src ||!src.exists()) {
//			return ;
//		}
//		else if (src.isDirectory()) {
//			for (File f :src.listFiles() ) {
//				countSize(f);
//			}
//			
//		}
		if(null!=src &&src.exists()) {
			if(src.isFile()) {
				len=len+src.length();
				
			}
		else if(src.isDirectory()) {
				for (File f : src.listFiles()) {
					countSize(f);
					
				}
					
			}
			
		}
		
	
	
}
}
