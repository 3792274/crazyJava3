package chapter12_12_ʹ��JFormattedTextField��JtextPane;


import java.util.*;
import java.io.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
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
public class MyTextPane extends JTextPane
{
	protected StyledDocument doc;
	protected SyntaxFormatter formatter = new SyntaxFormatter("��12��Swing���\\chapter12_12_ʹ��JFormattedTextField��JtextPane\\my.stx");
	// ������ĵ�����ͨ�ı����������
	private SimpleAttributeSet normalAttr =
		formatter.getNormalAttributeSet();
	private SimpleAttributeSet quotAttr = new SimpleAttributeSet();
	// �����ĵ��ı�Ŀ�ʼλ��
	private int docChangeStart = 0;
	// �����ĵ��ı�ĳ���
	private int docChangeLength = 0;
	public MyTextPane()
	{
		StyleConstants.setForeground(quotAttr
			, new Color(255, 0 , 255));
		StyleConstants.setFontSize(quotAttr, 16);
		this.doc = super.getStyledDocument();
		// ���ø��ĵ���ҳ�߾�
		this.setMargin(new Insets(3, 40, 0, 0));
		// ��Ӱ������������������ɿ�ʱ�����﷨����
		this.addKeyListener(new KeyAdapter()
		{
			public void keyReleased(KeyEvent ke)
			{
				syntaxParse();
			}
		});
		// ����ĵ�������
		doc.addDocumentListener(new DocumentListener()
		{
			// ��Document�����Ի����Լ������˸ı�ʱ�����÷���
			public void changedUpdate(DocumentEvent e){}
			// ����Document�в����ı�ʱ�����÷���
			public void insertUpdate(DocumentEvent e)
			{
				docChangeStart = e.getOffset();
				docChangeLength = e.getLength();
			}
			// ����Document��ɾ���ı�ʱ�����÷���
			public void removeUpdate(DocumentEvent e){}
		});
	}
	public void syntaxParse()
	{
		try
		{
			// ��ȡ�ĵ��ĸ�Ԫ�أ����ĵ��ڵ�ȫ������
			Element root = doc.getDefaultRootElement();
			// ��ȡ�ĵ��й��������λ��
			int cursorPos = this.getCaretPosition();
			int line = root.getElementIndex(cursorPos);
			// ��ȡ�������λ�õ���
			Element para = root.getElement(line);
			// �����������е���ͷ���ĵ���λ��
			int start = para.getStartOffset();
			// ��start����start��docChangeStart�н�Сֵ��
			start = start > docChangeStart ? docChangeStart :start;
			// ���屻�޸Ĳ��ֵĳ���
			int length = para.getEndOffset() - start;
			length = length < docChangeLength ? docChangeLength + 1
				: length;
			// ȡ�����п��ܱ��޸ĵ��ַ���
			String s = doc.getText(start, length);
			// �Կո񡢵�ŵ���Ϊ�ָ���
			String[] tokens = s.split("\\s+|\\.|\\(|\\)|\\{|\\}|\\[|\\]");
			// ���嵱ǰ�������ʵ���s�ַ����еĿ�ʼλ��
			int curStart = 0;
			// ���嵥���Ƿ�����������
			boolean isQuot = false;
			for (String token : tokens)
			{
				// �ҳ���ǰ����������s�ַ����е�λ��
				int tokenPos = s.indexOf(token , curStart);
				if (isQuot && (token.endsWith("\"") || token.endsWith("\'")))
				{
					doc.setCharacterAttributes(start + tokenPos
						, token.length(), quotAttr, false);
					isQuot = false;
				}
				else if (isQuot && !(token.endsWith("\"")
					|| token.endsWith("\'")))
				{
					doc.setCharacterAttributes(start + tokenPos
						, token.length(), quotAttr, false);
				}
				else if ((token.startsWith("\"") || token.startsWith("\'"))
					&& (token.endsWith("\"") || token.endsWith("\'")))
				{
					doc.setCharacterAttributes(start + tokenPos
						, token.length(), quotAttr, false);
				}
				else if ((token.startsWith("\"") || token.startsWith("\'"))
					&& !(token.endsWith("\"") || token.endsWith("\'")))
				{
					doc.setCharacterAttributes(start + tokenPos
						, token.length(), quotAttr, false);
					isQuot = true;
				}
				else
				{
					// ʹ�ø�ʽ���Ե�ǰ����������ɫ
					formatter.setHighLight(doc , token , start + tokenPos
						, token.length());
				}
				// ��ʼ������һ������
				curStart = tokenPos + token.length();
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// �ػ�������������к�
	public void paint(Graphics g)
	{
		super.paint(g);
		Element root = doc.getDefaultRootElement();
		// ����к�
		int line = root.getElementIndex(doc.getLength());
		// ������ɫ
		g.setColor(new Color(230, 230, 230));
		// ������ʾ�����ľ��ο�
		g.fillRect(0 , 0 , this.getMargin().left - 10 , getSize().height);
		// �����кŵ���ɫ
		g.setColor(new Color(40, 40, 40));
		// ÿ�л���һ���к�
		for (int count = 0, j = 1; count <= line; count++, j++)
		{
			g.drawString(String.valueOf(j), 3, (int)((count + 1)
				* 1.535 * StyleConstants.getFontSize(normalAttr)));
		}
	}
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("�ı��༭��");
		// ʹ��MyTextPane
		frame.getContentPane().add(new JScrollPane(new MyTextPane()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final int inset = 50;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(inset, inset, screenSize.width - inset*2
			, screenSize.height - inset * 2);
		frame.setVisible(true);
	}
}
// �����﷨��ʽ��
class SyntaxFormatter
{
	// ��һ��Map����ؼ��ֺ���ɫ�Ķ�Ӧ��ϵ
	private Map<SimpleAttributeSet , ArrayList<String>> attMap
		= new HashMap<>();
	// �����ĵ��������ı����������
	SimpleAttributeSet normalAttr = new SimpleAttributeSet();
	public SyntaxFormatter(String syntaxFile)
	{
		// ���������ı�����ɫ����С
		StyleConstants.setForeground(normalAttr, Color.BLACK);
		StyleConstants.setFontSize(normalAttr, 16);
		// ����һ��Scanner���󣬸�������﷨�ļ�������ɫ��Ϣ
		Scanner scaner = null;
		try
		{
			scaner = new Scanner(new File(syntaxFile));
		}
		catch (FileNotFoundException e)
		{
			throw new RuntimeException("��ʧ�﷨�ļ���"
				+ e.getMessage());
		}
		int color = -1;
		ArrayList<String> keywords = new ArrayList<>();
		// ���϶�ȡ�﷨�ļ���������
		while(scaner.hasNextLine())
		{
			String line = scaner.nextLine();
			// �����ǰ����#��ͷ
			if (line.startsWith("#"))
			{
				if (keywords.size() > 0 && color > -1)
				{
					// ȡ����ǰ�е���ɫֵ������װ��SimpleAttributeSet����
					SimpleAttributeSet att = new SimpleAttributeSet();
					StyleConstants.setForeground(att, new Color(color));
					StyleConstants.setFontSize(att, 16);
					// ����ǰ��ɫ�͹ؼ���List��Ӧ����
					attMap.put(att , keywords);
				}
				// ���´����µĹؼ���List��Ϊ��һ���﷨��ʽ׼��
				keywords = new ArrayList<>();
				color = Integer.parseInt(line.substring(1) , 16);
			}
			else
			{
				// ������ͨ�У�ÿ��������ӵ��ؼ���List��
				if (line.trim().length() > 0)
				{
					keywords.add(line.trim());
				}
			}
		}
		// �����йؼ��ֺ���ɫ��Ӧ����
		if (keywords.size() > 0 && color > -1)
		{
			SimpleAttributeSet att = new SimpleAttributeSet();
			StyleConstants.setForeground(att, new Color(color));
			StyleConstants.setFontSize(att, 16);
			attMap.put(att , keywords);
		}
	}
	// ���ظø�ʽ���������ı����������
	public SimpleAttributeSet getNormalAttributeSet()
	{
		return normalAttr;
	}
	// �����﷨����
	public void setHighLight(StyledDocument doc , String token
		, int start , int length)
	{
		// ������Ҫ�Ե�ǰ���ʶ�Ӧ���������
		SimpleAttributeSet currentAttributeSet = null;
		outer :
		for (SimpleAttributeSet att : attMap.keySet())
		{
			// ȡ����ǰ��ɫ��Ӧ�����йؼ���
			ArrayList<String> keywords = attMap.get(att);
			// �������йؼ���
			for (String keyword : keywords)
			{
				// ����ùؼ����뵱ǰ������ͬ
				if (keyword.equals(token))
				{
					// ����ѭ���������õ�ǰ���ʶ�Ӧ���������
					currentAttributeSet = att;
					break outer;
				}
			}
		}
		// �����ǰ���ʶ�Ӧ��������Բ�Ϊ��
		if (currentAttributeSet != null)
		{
			// ���õ�ǰ���ʵ���ɫ
			doc.setCharacterAttributes(start , length
				, currentAttributeSet , false);
		}
		// ����ʹ����ͨ��������øõ���
		else
		{
			doc.setCharacterAttributes(start , length , normalAttr , false);
		}
	}
}
