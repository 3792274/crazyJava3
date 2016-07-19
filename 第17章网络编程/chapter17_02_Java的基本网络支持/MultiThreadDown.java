package chapter17_02_Java�Ļ�������֧��;


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
public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// ��ʼ��DownUtil����
		final DownUtil downUtil = new DownUtil("http://dldir1.qq.com/qqfile/qq/QQ8.4/18380/QQ8.4.exe", "QQ8.4.exe", 10);
		
		// ��ʼ����
		downUtil.download();
		
		new Thread(() -> {
				while(downUtil.getCompleteRate() < 1)
				{
					// ÿ��0.1���ѯһ���������ɽ��ȣ�
					// GUI�����пɸ��ݸý��������ƽ�����
					System.out.println("����ɣ�" + downUtil.getCompleteRate());
					try
					{
						Thread.sleep(10000);
					}
					catch (Exception ex){}
				}
		}).start();
	}
}
