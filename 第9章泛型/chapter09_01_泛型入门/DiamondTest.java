package chapter09_01_��������;


import java.util.*;
/**
 * Description:java 1.7�Ժ�������﷨
 */
public class DiamondTest
{
	public static void main(String[] args)
	{
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> books = new ArrayList<>();  //1.5֮ǰ new ArrayList<String>();
		books.add("���Java����");
		books.add("���Android����");
	
		// ����books���ϣ�����Ԫ�ؾ���String����
		books.forEach(ele -> System.out.println(ele.length()));
	
		// Java�Զ��ƶϳ�HashMap��<>��Ӧ����String , List<String>
		Map<String , List<String>> schoolsInfo = new HashMap<>();
		
		// Java�Զ��ƶϳ�ArrayList��<>��Ӧ����String
		List<String> schools = new ArrayList<>();
		schools.add("б�����Ƕ�");
		schools.add("����ȡ��·");
		schoolsInfo.put("�����" , schools);
	
		// ����Mapʱ��Map��key��String���ͣ�value��List<String>����
		schoolsInfo.forEach((key , value) -> System.out.println(key + "-->" + value));
	}
}
