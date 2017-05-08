package chapter15_09_NIO;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Description:RandomAccessFile得到的Channel()是只读的还是可读写的，
 * 取决于RandomAccessFile文件的打开方式。 <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class RandomFileChannelTest {
	public static void main(String[] args) throws Exception {


		File f = new File("D:/a.txt");
		
		try (
				// 创建一个RandomAccessFile对象
				RandomAccessFile raf = new RandomAccessFile(f, "rw");

				// 获取RandomAccessFile对应的Channel
				FileChannel randomChannel = raf.getChannel()) {

			// 将Channel中所有数据映射成ByteBuffer
			ByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());

			// 把Channel的记录指针移动到最后
			randomChannel.position(f.length());

			// 将buffer中所有数据输出
			randomChannel.write(buffer);
		}

	
		
 
	}

}
