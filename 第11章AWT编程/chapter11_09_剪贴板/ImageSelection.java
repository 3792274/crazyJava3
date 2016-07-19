package chapter11_09_������;


import java.awt.*;
import java.awt.datatransfer.*;
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
public class ImageSelection implements Transferable
{
	private Image image;
	// ���������������һ��Image����
	public ImageSelection(Image image)
	{
		this.image = image;
	}
	// ���ظ�Transferable������֧�ֵ�����DataFlavor
	public DataFlavor[] getTransferDataFlavors()
	{
		return new DataFlavor[]{DataFlavor.imageFlavor};
	}
	// ȡ����Transferable������ʵ�ʵ�����
	public Object getTransferData(DataFlavor flavor)
		throws UnsupportedFlavorException
	{
		if(flavor.equals(DataFlavor.imageFlavor))
		{
			return image;
		}
		else
		{
			throw new UnsupportedFlavorException(flavor);
		}
	}
	// ���ظ�Transferable�����Ƿ�֧��ָ����DataFlavor
	public boolean isDataFlavorSupported(DataFlavor flavor)
	{
		return flavor.equals(DataFlavor.imageFlavor);
	}
}
