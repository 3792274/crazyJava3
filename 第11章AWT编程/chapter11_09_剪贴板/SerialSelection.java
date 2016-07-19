package chapter11_09_������;


import java.awt.datatransfer.*;
import java.io.*;
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
public class SerialSelection implements Transferable
{
	// ����һ�������л��Ķ���
	private Serializable obj;
	// ��������Ķ���ʱ���뱻���еĶ���
	public SerialSelection(Serializable obj)
	{
		this.obj = obj;
	}
	public DataFlavor[] getTransferDataFlavors()
	{
		DataFlavor[] flavors = new DataFlavor[2];
		// ��ȡ����װ���������
		Class clazz = obj.getClass();
		try
		{
			flavors[0] = new DataFlavor(DataFlavor.javaSerializedObjectMimeType
				+ ";class=" + clazz.getName());
			flavors[1] = DataFlavor.stringFlavor;
			return flavors;
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			return null;
		}
	}
	public Object getTransferData(DataFlavor flavor)
		throws UnsupportedFlavorException
	{
		if(!isDataFlavorSupported(flavor))
		{
			throw new UnsupportedFlavorException(flavor);
		}
		if (flavor.equals(DataFlavor.stringFlavor))
		{
			return obj.toString();
		}
		return obj;
	}
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{
		return flavor.equals(DataFlavor.stringFlavor) ||
			flavor.getPrimaryType().equals("application")
			&& flavor.getSubType().equals("x-java-serialized-object")
			&& flavor.getRepresentationClass().isAssignableFrom(obj.getClass());
	}
}
