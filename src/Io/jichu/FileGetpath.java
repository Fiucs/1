package Io.jichu;

import java.io.File;
import java.security.Principal;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author FKU
 *
 */
public class FileGetpath {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		File src=new File("G:/Users/Administrator/eclipse-workspace/ceshi1/src/Tcp.png");
		
		//文件路径 name
		System.out.println("名称："+src.getName());
		System.out.println("路径："+src.getPath());
		System.out.println("绝对路径："+src.getAbsolutePath());
		System.out.println("父亲路径："+src.getParent());

		//文件状态
		System.out.println("是否是文件："+src.isFile());
		System.out.println("是否是文件夹："+src.isDirectory());
		System.out.println("是否存在："+src.exists());
		System.out.println("文件字节数："+String.format("%.1f", src.length()/1024.0)+"Kb");
		//C创建文件File src1=new File("G:/Users/123");
		//flag=src1.createNewFile();返回值bool
		//flag=src1.delete();
		
		/**
		 * 创建文件夹mkdir()--父目录存在为前提 
		 * mkdirs()都能创建即创建绝对路径
		 */
		File src2=new File("G:/Users/Administrator/eclipse-workspace/ceshi1/src1/1");
		boolean flag=src2.mkdir();
		System.out.println(flag);
		//boolean flag=src2.mkdirs();successful
		/**
		 * list()列出下级名称
		 * listFiles()列出下级File对象路径
		 */
		File dir=new File("G:/Users/Administrator/eclipse-workspace/ceshi1/");
		String[] sbName=dir.list();
		for(String s:sbName)
		{
			System.out.println(s);
			
		}
		
		File[] subPath=dir.listFiles();
		for (int i = 0; i < subPath.length; i++) {
			System.out.println("直接输出"+subPath[i]);
			System.out.println("输出路径"+subPath[i].getAbsolutePath());
			
			
		}
		
		/**
		 * listRoots()列出所有盘符
		 * 
		 */
		File[] rootName=File.listRoots();
		for(File r:rootName)
		{
			System.out.println(r);
			
		}
		
		/**
		 * 递归 结束条件
		 * 递归逻辑，体
		 * 或循环替代
		 */
		printN(0);
		
	}

	public static void printN(int n) {
		
		if (n>10) {
			return ;}
		
		System.out.print(n+"  ");
		printN(n+1);
		
		
	}
	
	
}
