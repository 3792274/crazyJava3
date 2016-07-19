package chapter15_04_�����������ϵ;

import java.io.*;

/**
 * Description: <br/>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class PushbackTest {
	public static void main(String[] args) {
		try (
				// ����һ��PushbackReader����ָ���ƻػ������ĳ���Ϊ64
				PushbackReader pr = new PushbackReader(new FileReader("F:/workspace/01/���Java���壨��3�棩/��15������_���/chapter15_04_�����������ϵ/PushbackTest.java"), 64)) {
			char[] buf = new char[32];
			// ���Ա����ϴζ�ȡ���ַ�������
			String lastContent = "";
			int hasRead = 0;
			// ѭ����ȡ�ļ�����
			while ((hasRead = pr.read(buf)) > 0) {
				// ����ȡ������ת�����ַ���
				String content = new String(buf, 0, hasRead);
				int targetIndex = 0;
				// ���ϴζ�ȡ���ַ����ͱ��ζ�ȡ���ַ���ƴ������
				// �鿴�Ƿ����Ŀ���ַ���, �������Ŀ���ַ���
				if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
					// ���������ݺ��ϴ�����һ���ƻػ�����
					pr.unread((lastContent + content).toCharArray());
					// ���¶���һ������ΪtargetIndex��char����
					if (targetIndex > 32) {
						buf = new char[targetIndex];
					}
					// �ٴζ�ȡָ�����ȵ����ݣ�����Ŀ���ַ���֮ǰ�����ݣ�
					pr.read(buf, 0, targetIndex);
					// ��ӡ��ȡ������
					System.out.print(new String(buf, 0, targetIndex));
					System.exit(0);
				} else {
					// ��ӡ�ϴζ�ȡ������
					System.out.print(lastContent);
					// ������������Ϊ�ϴζ�ȡ������
					lastContent = content;
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
