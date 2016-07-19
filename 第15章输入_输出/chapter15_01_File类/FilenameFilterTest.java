package chapter15_01_File类;

import java.io.File;

/***
 * File.list()方法参数 FilenameFilter示例
 * 
 * @author Mr.TianShu
 *
 */
public class FilenameFilterTest {

	public static void main(String[] args) {

			File  file = new File(".");
			
			//使用lambda表达式(目标类型为FilenameFilter) 实现文件过滤器,实现FilenameFilter中accept()方法
			//如果文件以java结尾或者文件中对应一个路径，则返回true,
			
			String [] nameList = file.list(
						(dir,name)->{
							return  name.endsWith(".java")|| new File(name).isDirectory();
						}
					);
			
			for(String name:nameList){
				System.out.println(name);
			}
			
	}

}
