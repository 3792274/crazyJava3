package chapter09_03_����ͨ���;


import java.util.*;
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
public class Canvas
{
//	// ͬʱ�ڻ����ϻ��ƶ����״
//	public void drawAll(List<Shape> shapes)
//	{
//		for (Shape s : shapes)
//		{
//			s.draw(this);
//		}
//	}
//	public void drawAll(List<?> shapes)
//	{
//		for (Object obj : shapes)
//		{
//			Shape s = (Shape)obj;
//			s.draw(this);
//		}
//	}
	// ͬʱ�ڻ����ϻ��ƶ����״��ʹ�ñ����Ƶķ���ͨ���
	public void drawAll(List<? extends Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}

	public static void main(String[] args)
	{
		List<Circle> circleList = new ArrayList<Circle>();
		circleList.add(new Circle());
		
		Canvas c = new Canvas();
		// ����List<Circle>������List<Shape>��������,
		// ����������������������
		c.drawAll(circleList);
	}
}
