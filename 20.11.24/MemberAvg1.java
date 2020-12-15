package jojo;

import java.util.ArrayList;
import java.util.List;
public class MemberAvg1 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("����",Member.FEMALE, 23));
		list.add(new Member("���ٴϿ�",Member.MALE, 27));
		list.add(new Member("�ϴ�",Member.FEMALE, 29));
		list.add(new Member("����",Member.MALE, 41));
		list.add(new Member("����",Member.FEMALE, 31));
		
		double avg = list.stream().mapToInt(Member::getAge)
			.average().getAsDouble();
		System.out.println("��ճ��� : "+avg);
		avg = list.stream()
			.filter(m->m.getGender()==Member.MALE)
			.mapToInt(Member::getAge)
			.average().getAsDouble();
		System.out.println("���� ��ճ��� : "+avg);
		avg = list.stream()
			.filter(m->m.getGender()==Member.FEMALE)
			.mapToInt(Member::getAge)
			.average().getAsDouble();
		System.out.println("���� ��ճ��� : "+avg);
		
	}
}