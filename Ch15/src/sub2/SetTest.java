package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * �÷��� �����ӿ�ũ Set p724
 */
public class SetTest {

	public static void main(String[] args) {
		//���� ���� �� �Ǽ� ������ ����
		Set<Double> set = new HashSet<>();
		
		set.add(1.1);
		set.add(1.12);
		set.add(1.3);
		set.add(1.1);
		set.add(1.15);
		
		System.out.println("���� ���� ���� : " + set.size());
		
		//�ݺ��ڸ� �̿��� ���տ��� ���
		Iterator<Double> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println("���� : " + iter.next());
		}
	}
}