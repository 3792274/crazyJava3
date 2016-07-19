package chapter12_02_Swing����������÷�;


import java.io.File;
import java.beans.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
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
public class ImageViewer
{
	// ����ͼƬԤ������Ĵ�С
	final int PREVIEW_SIZE = 100;
	JFrame jf = new JFrame("��ͼƬ�鿴��");
	JMenuBar menuBar = new JMenuBar();
	// ��label������ʾͼƬ
	JLabel label = new JLabel();
	// �Ե�ǰ·�������ļ�ѡ����
	JFileChooser chooser = new JFileChooser(".");
	JLabel accessory = new JLabel();
	// �����ļ�������
	ExtensionFileFilter filter = new ExtensionFileFilter();
	public void init()
	{
		// --------���濪ʼ��ʼ��JFileChooser���������--------
		//  ����һ��FileFilter
		filter.addExtension("jpg");
		filter.addExtension("jpeg");
		filter.addExtension("gif");
		filter.addExtension("png");
		filter.setDescription("ͼƬ�ļ�(*.jpg,*.jpeg,*.gif,*.png)");
		chooser.addChoosableFileFilter(filter);
		// ��ֹ���ļ����͡������б�����ʾ�������ļ���ѡ�
		chooser.setAcceptAllFileFilterUsed(false);   // ��
		// Ϊ�ļ�ѡ����ָ���Զ����FileView����
		chooser.setFileView(new FileIconView(filter));
		// Ϊ�ļ�ѡ����ָ��һ��Ԥ��ͼƬ�ĸ���
		chooser.setAccessory(accessory);     // ��
		// ����Ԥ��ͼƬ����Ĵ�С�ͱ߿�
		accessory.setPreferredSize(new Dimension(PREVIEW_SIZE, PREVIEW_SIZE));
		accessory.setBorder(BorderFactory.createEtchedBorder());
		// ���ڼ�ⱻѡ���ļ��ĸı��¼�
		chooser.addPropertyChangeListener(event -> {
			// JFileChooser�ı�ѡ�ļ��Ѿ������˸ı�
			if (event.getPropertyName() ==
				JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)
			{
				// ��ȡ�û�ѡ������ļ�
				File f = (File) event.getNewValue();
				if (f == null)
				{
					accessory.setIcon(null);
					return;
				}
				// ����ѡ�ļ�����ImageIcon������
				ImageIcon icon = new ImageIcon(f.getPath());
				// ���ͼ��̫������С��
				if(icon.getIconWidth() > PREVIEW_SIZE)
				{
					icon = new ImageIcon(icon.getImage().getScaledInstance
						(PREVIEW_SIZE, -1, Image.SCALE_DEFAULT));
				}
				// �ı�accessory Label��ͼ��
				accessory.setIcon(icon);
			}
		});
		// ------������뿪ʼΪ�ô��ڰ�װ�˵�------
		JMenu menu = new JMenu("�ļ�");
		menuBar.add(menu);
		JMenuItem openItem = new JMenuItem("��");
		menu.add(openItem);
		// ����openItem�˵�����ʾ�����ļ����ĶԻ���
		openItem.addActionListener(event -> {
			// �����ļ��Ի���ĵ�ǰ·��
			// chooser.setCurrentDirectory(new File("."));
			// ��ʾ�ļ��Ի���
			int result = chooser.showDialog(jf , "��ͼƬ�ļ�");
			// ����û�ѡ����APPROVE��ͬ�⣩��ť�����򿪣�����ĵ�Ч��ť
			if(result == JFileChooser.APPROVE_OPTION)
			{
				String name = chooser.getSelectedFile().getPath();
				// ��ʾָ��ͼƬ
				label.setIcon(new ImageIcon(name));
			}
		});
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		// Ϊ�˳��˵����¼�������
		exitItem.addActionListener(event -> System.exit(0));
		jf.setJMenuBar(menuBar);
		// ���������ʾͼƬ��JLabel�����
		jf.add(new JScrollPane(label));
		jf.pack();
		jf.setVisible(true);
	}
	public static void main(String[] args)
	{
		new ImageViewer().init();
	}
}
// ����FileFilter�����࣬����ʵ���ļ����˹���
class ExtensionFileFilter extends FileFilter
{
	private String description;
	private ArrayList<String> extensions = new ArrayList<>();
	// �Զ��巽������������ļ���չ��
	public void addExtension(String extension)
	{
		if (!extension.startsWith("."))
		{
			extension = "." + extension;
			extensions.add(extension.toLowerCase());
		}
	}
	// �������ø��ļ��������������ı�
	public void setDescription(String aDescription)
	{
		description = aDescription;
	}
	// �̳�FileFilter�����ʵ�ֵĳ��󷽷������ظ��ļ��������������ı�
	public String getDescription()
	{
		return description;
	}
	// �̳�FileFilter�����ʵ�ֵĳ��󷽷����жϸ��ļ��������Ƿ���ܸ��ļ�
	public boolean accept(File f)
	{
		// ������ļ���·�������ܸ��ļ�
		if (f.isDirectory()) return true;
		// ���ļ���תΪСд��ȫ��תΪСд��Ƚϣ����ں����ļ�����Сд��
		String name = f.getName().toLowerCase();
		// �������пɽ��ܵ���չ���������չ����ͬ�����ļ��Ϳɽ��ܡ�
		for (String extension : extensions)
		{
			if (name.endsWith(extension))
			{
				return true;
			}
		}
		return false;
	}
}
// �Զ���һ��FileView�࣬����Ϊָ�����͵��ļ����ļ�������ͼ��
class FileIconView extends FileView
{
	private FileFilter filter;
	public FileIconView(FileFilter filter)
	{
		this.filter = filter;
	}
	// ��д�÷�����Ϊ�ļ��С��ļ�����ͼ��
	public Icon getIcon(File f)
	{
		if (!f.isDirectory() && filter.accept(f))
		{
			return new ImageIcon("ico/pict.png");
		}
		else if (f.isDirectory())
		{
			// ��ȡ���и�·��
			File[] fList = File.listRoots();
			for (File tmp : fList)
			{
				// �����·���Ǹ�·��
				if (tmp.equals(f))
				{
					return  new ImageIcon("ico/dsk.png");
				}
			}
			return new ImageIcon("ico/folder.png");
		}
		// ʹ��Ĭ��ͼ��
		else
		{
			return null;
		}
	}
}
