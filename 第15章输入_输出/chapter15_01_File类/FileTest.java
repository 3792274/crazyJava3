package chapter15_01_File��;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		//�Ե�ǰ·������һ��file����
		File file = new java.io.File(".");
		
		//ֱ�ӻ�ȡ�ļ��������һ��.
		System.out.println(file.getName());
		
		//������·���ĸ�·�������ܳ���null,ʹ�����·����File��ȡ��·�������������
		System.out.println(file.getParent());
		
		//��ȡ����·��
		System.out.println(file.getAbsoluteFile());
		
		//��ȡ��һ��·��
		System.out.println(file.getAbsoluteFile().getParent());

		//�ڵ�ǰ·���´���һ����ʱ�ļ�
		File tmpFile = File.createTempFile("aaa", ".txt",file);
		//ָ��jvm�˳�ʱɾ�����ļ�
		tmpFile.deleteOnExit();
		
		//��ϵͳʱ��Ϊ�ļ��������ļ�
		File newFile= new File(System.currentTimeMillis()+"");
		System.out.println("newFile�ļ��Ƿ���ڣ� "+ newFile.exists());
		
		//��newFile���󴴽�һ���ļ�
		newFile.createNewFile();
		
		//��newFile���󴴽�һ��Ŀ¼����ΪnewFile�Ѿ����ڣ�����false �޷�����
		System.out.println(newFile.mkdir());
		
		//�г���ǰ·���������ļ���·��
		String [] fileList = file.list();
		System.out.println("========��ǰ·���������ļ���·��========");
		for(String fileName:fileList)
			System.out.println(fileName);
		
		//listRoot()��̬�������г����д��̸�·��
		File [] roots = File.listRoots();
		System.out.println("==========ϵͳ���и�·������");
		for(File root:roots)
			System.out.println(root);
	
	}

}
