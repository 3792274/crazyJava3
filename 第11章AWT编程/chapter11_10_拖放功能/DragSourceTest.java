package chapter11_10_�ϷŹ���;
import java.awt.*;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
import javax.swing.*;
/**
 * Description:Swing���Ϸ�֧��.�����ı��������������������.
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */


public class DragSourceTest
{
	JFrame jf = new JFrame("Swing���Ϸ�֧��");
	JLabel srcLabel = new JLabel("Swing���Ϸ�֧��.\n"
		+"�����ı��������������������.\n");
	public void init()
	{
		DragSource dragSource = DragSource.getDefaultDragSource();
		// ��srcLabelת�����Ϸ�Դ�����ܽ��ܸ��ơ��ƶ����ֲ���
		dragSource.createDefaultDragGestureRecognizer(srcLabel
			, DnDConstants.ACTION_COPY_OR_MOVE
			, event -> {
			// ��JLabel����ı���Ϣ��װ��Transferable����
			String txt = srcLabel.getText();
			Transferable transferable = new StringSelection(txt);
			// �����ϷŲ���,�ϷŹ�����ʹ����״���
			event.startDrag(Cursor.getPredefinedCursor(Cursor
				.HAND_CURSOR), transferable);
		});
		jf.add(new JScrollPane(srcLabel));
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new DragSourceTest().init();
	}
}
