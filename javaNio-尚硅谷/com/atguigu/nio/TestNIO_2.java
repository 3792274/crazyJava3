package com.atguigu.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;

import org.junit.Test;

public class TestNIO_2 {
	
	
	//�Զ���Դ�����Զ��ر�ʵ�� AutoCloseable �ӿڵ���Դ
	@Test
	public void test8(){
		try(FileChannel inChannel = FileChannel.open(Paths.get("1.jpg"), StandardOpenOption.READ);
				FileChannel outChannel = FileChannel.open(Paths.get("2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
			
			ByteBuffer buf = ByteBuffer.allocate(1024);
			inChannel.read(buf);
			
		}catch(IOException e){
			
		}
	}
	
	/*
		Files���÷��������ڲ�������
			SeekableByteChannel newByteChannel(Path path, OpenOption��how) : ��ȡ��ָ���ļ������ӣ�how ָ���򿪷�ʽ��
			DirectoryStream newDirectoryStream(Path path) : �� path ָ����Ŀ¼
			InputStream newInputStream(Path path, OpenOption��how):��ȡ InputStream ����
			OutputStream newOutputStream(Path path, OpenOption��how) : ��ȡ OutputStream ����
	 */
	@Test
	public void test7() throws IOException{
		SeekableByteChannel newByteChannel = Files.newByteChannel(Paths.get("1.jpg"), StandardOpenOption.READ);
		
		DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(Paths.get("e:/"));
		
		for (Path path : newDirectoryStream) {
			System.out.println(path);
		}
	}
	
	/*
		Files���÷����������ж�
			boolean exists(Path path, LinkOption �� opts) : �ж��ļ��Ƿ����
			boolean isDirectory(Path path, LinkOption �� opts) : �ж��Ƿ���Ŀ¼
			boolean isExecutable(Path path) : �ж��Ƿ��ǿ�ִ���ļ�
			boolean isHidden(Path path) : �ж��Ƿ��������ļ�
			boolean isReadable(Path path) : �ж��ļ��Ƿ�ɶ�
			boolean isWritable(Path path) : �ж��ļ��Ƿ��д
			boolean notExists(Path path, LinkOption �� opts) : �ж��ļ��Ƿ񲻴���
			public static <A extends BasicFileAttributes> A readAttributes(Path path,Class<A> type,LinkOption... options) : ��ȡ�� path ָ�����ļ�����������ԡ�
	 */
	@Test
	public void test6() throws IOException{
		Path path = Paths.get("e:/nio/hello7.txt");
//		System.out.println(Files.exists(path, LinkOption.NOFOLLOW_LINKS));
		
		BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
		System.out.println(readAttributes.creationTime());
		System.out.println(readAttributes.lastModifiedTime());
		
		DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
		
		fileAttributeView.setHidden(false);
	}
	
	/*
		Files���÷�����
			Path copy(Path src, Path dest, CopyOption �� how) : �ļ��ĸ���
			Path createDirectory(Path path, FileAttribute<?> �� attr) : ����һ��Ŀ¼
			Path createFile(Path path, FileAttribute<?> �� arr) : ����һ���ļ�
			void delete(Path path) : ɾ��һ���ļ�
			Path move(Path src, Path dest, CopyOption��how) : �� src �ƶ��� dest λ��
			long size(Path path) : ���� path ָ���ļ��Ĵ�С
	 */
	@Test
	public void test5() throws IOException{
		Path path1 = Paths.get("e:/nio/hello2.txt");
		Path path2 = Paths.get("e:/nio/hello7.txt");
		
		System.out.println(Files.size(path2));
		
//		Files.move(path1, path2, StandardCopyOption.ATOMIC_MOVE);
	}
	
	@Test
	public void test4() throws IOException{
		Path dir = Paths.get("e:/nio/nio2");
//		Files.createDirectory(dir);
		
		Path file = Paths.get("e:/nio/nio2/hello3.txt");
//		Files.createFile(file);
		
		Files.deleteIfExists(file);
	}
	
	@Test
	public void test3() throws IOException{
		Path path1 = Paths.get("e:/nio/hello.txt");
		Path path2 = Paths.get("e:/nio/hello2.txt");
		
		Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);
	}
	
	/*
		Paths �ṩ�� get() ����������ȡ Path ����
			Path get(String first, String �� more) : ���ڽ�����ַ���������·����
		Path ���÷�����
			boolean endsWith(String path) : �ж��Ƿ��� path ·������
			boolean startsWith(String path) : �ж��Ƿ��� path ·����ʼ
			boolean isAbsolute() : �ж��Ƿ��Ǿ���·��
			Path getFileName() : ��������� Path ����������ļ���
			Path getName(int idx) : ���ص�ָ������λ�� idx ��·������
			int getNameCount() : ����Path ��Ŀ¼����Ԫ�ص�����
			Path getParent() ������Path�����������·���������� Path ����ָ�����ļ�·��
			Path getRoot() �����ص��� Path ����ĸ�·��
			Path resolve(Path p) :�����·������Ϊ����·��
			Path toAbsolutePath() : ��Ϊ����·�����ص��� Path ����
			String toString() �� ���ص��� Path ������ַ�����ʾ��ʽ
	 */
	@Test
	public void test2(){
		Path path = Paths.get("e:/nio/hello.txt");
		
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		
//		Path newPath = path.resolve("e:/hello.txt");
//		System.out.println(newPath);
		
		Path path2 = Paths.get("1.jpg");
		Path newPath = path2.toAbsolutePath();
		System.out.println(newPath);
		
		System.out.println(path.toString());
	}
	
	@Test
	public void test1(){
		Path path = Paths.get("e:/", "nio/hello.txt");
		
		System.out.println(path.endsWith("hello.txt"));
		System.out.println(path.startsWith("e:/"));
		
		System.out.println(path.isAbsolute());
		System.out.println(path.getFileName());
		
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
	}
}
