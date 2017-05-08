package chapter06_05_抽象类;

/**
 * Description:抽象类模板
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public abstract class SpeedMeter
{
	// 转速
	private double turnRate;
	
	public SpeedMeter()
	{
	}
	// 把返回车轮半径的方法定义成抽象方法，无法确定车轮的半径，推迟到子类实现
	public abstract double getRadius();
	
	public void setTurnRate(double turnRate)
	{
		this.turnRate = turnRate;
	}
	
	// 定义计算速度的通用算法，用于返回当前的车速
	public double getSpeed()
	{
		// 速度等于 车轮半径 * 2 * PI * 转速
		return java.lang.Math.PI * 2 * getRadius() * turnRate;
	}
}
