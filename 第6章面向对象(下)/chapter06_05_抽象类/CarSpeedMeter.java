package chapter06_05_³éÏóÀà;

/**
 * Description:
 * <br/>ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CarSpeedMeter extends SpeedMeter
{
	public double getRadius()
	{
		return 0.28;
	}
	public static void main(String[] args)
	{
		CarSpeedMeter csm = new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
}

