package chapter11_08_����λͼ;


import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class ZoomImage
{
	// ������������������С��ͼƬ�Ĵ�С
	private final int WIDTH = 80;
	private final int HEIGHT = 60;
	// �����BuffedImage�������ڱ�����С���λͼ
	BufferedImage image = new BufferedImage(WIDTH , HEIGHT
		, BufferedImage. TYPE_INT_RGB);
	Graphics g = image.getGraphics();
	public void zoom()throws Exception
	{
		// ��ȡԭʼλͼ
		Image srcImage = ImageIO.read(new File("image/board.jpg"));
		// ��ԭʼλͼ��С����Ƶ�imageͼ����
		g.drawImage(srcImage , 0 , 0 , WIDTH , HEIGHT , null);
		// ��imageͼ���ļ�����������ļ��С�
		ImageIO.write(image , "jpeg"
			, new File(System.currentTimeMillis() + ".jpg"));
	}
	public static void main(String[] args)throws Exception
	{
		new ZoomImage().zoom();
	}
}
