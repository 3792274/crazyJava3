package chapter17_02_Java的基本网络支持;


/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
		// 初始化DownUtil对象
		final DownUtil downUtil = new DownUtil("http://dldir1.qq.com/qqfile/qq/QQ8.4/18380/QQ8.4.exe", "QQ8.4.exe", 10);
		
		// 开始下载
		downUtil.download();
		
		new Thread(() -> {
				while(downUtil.getCompleteRate() < 1)
				{
					// 每隔0.1秒查询一次任务的完成进度，
					// GUI程序中可根据该进度来绘制进度条
					System.out.println("已完成：" + downUtil.getCompleteRate());
					try
					{
						Thread.sleep(10000);
					}
					catch (Exception ex){}
				}
		}).start();
	}
}
