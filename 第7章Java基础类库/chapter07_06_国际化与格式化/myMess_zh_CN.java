package chapter07_06_���ʻ����ʽ��;

import java.util.*;

/**
 * Description: ʹ�����ļ�������Դ�ļ�<br/>
 * 
 * 1.����̳�ListResourceBundle,��дgetContents()����������key-value
 * 2.��������ͬ��Դ�ļ���
 * 
 * 
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class myMess_zh_CN extends ListResourceBundle {
	// ������Դ
	private final Object myData[][] = { { "msg", "{0}�����11�������������{1}" } };

	// ��д����getContents()
	public Object[][] getContents() {
		// �÷���������Դ��key-value��
		return myData;
	}
}
