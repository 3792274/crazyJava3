package chapter12_06_ʹ��JProgressBar_ProgressMonitor;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
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
public class JProgressBarTest2
{
	JFrame frame = new JFrame("���Խ�����");
	// ����һ����ֱ������
	JProgressBar bar = new JProgressBar(JProgressBar.VERTICAL);
	JCheckBox indeterminate = new JCheckBox("��ȷ������");
	JCheckBox noBorder = new JCheckBox("�����Ʊ߿�");
	public void init()
	{
		Box box = new Box(BoxLayout.Y_AXIS);
		box.add(indeterminate);
		box.add(noBorder);
		frame.setLayout(new FlowLayout());
		frame.add(box);
		// �ѽ�������ӵ�JFrame������
		frame.add(bar);
		// �����ڽ������л�����ɰٷֱ�
		bar.setStringPainted(true);
		// ���ݸ�ѡ�������Ƿ���ƽ������ı߿�
		noBorder.addActionListener(event ->
			bar.setBorderPainted(!noBorder.isSelected()));
		final SimulatedActivity target = new SimulatedActivity(1000);
		// ������һ���̵߳ķ�ʽ��ִ��һ����ʱ������
		new Thread(target).start();
		// ���ý����������ֵ����Сֵ,
		bar.setMinimum(0);
		// ������������Ϊ�����������ֵ
		bar.setMaximum(target.getAmount());
		// ������ĵ�ǰ��������ý�������value
		Timer timer = new Timer(300 , e -> bar.setValue(target.getCurrent()));
		timer.start();
		indeterminate.addActionListener(event ->
		{
			// ���øý������Ľ����Ƿ�ȷ��
			bar.setIndeterminate(indeterminate.isSelected());
			bar.setStringPainted(!indeterminate.isSelected());
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new JProgressBarTest2().init();
	}
}
// ģ��һ����ʱ������
class SimulatedActivity implements Runnable
{
	// ����ĵ�ǰ�����
	private volatile int current;
	// ��������
	private int amount;
	public SimulatedActivity(int amount)
	{
		current = 0;
		this.amount = amount;
	}
	public int getAmount()
	{
		return amount;
	}
	public int getCurrent()
	{
		return current;
	}
	// run�����������������Ĺ���
	public void run()
	{
		while (current < amount)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
			}
			current++;
		}
	}
}
