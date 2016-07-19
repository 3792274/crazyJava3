package chapter15_01_File��;

import java.io.File;

/***
 * File.list()�������� FilenameFilterʾ��
 * 
 * @author Mr.TianShu
 *
 */
public class FilenameFilterTest {

	public static void main(String[] args) {

			File  file = new File(".");
			
			//ʹ��lambda���ʽ(Ŀ������ΪFilenameFilter) ʵ���ļ�������,ʵ��FilenameFilter��accept()����
			//����ļ���java��β�����ļ��ж�Ӧһ��·�����򷵻�true,
			
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
