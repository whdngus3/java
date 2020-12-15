package jojo;

import java.util.ArrayList;
import java.util.List;
public class MemberAvg1 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("세정",Member.FEMALE, 23));
		list.add(new Member("강다니엘",Member.MALE, 27));
		list.add(new Member("하니",Member.FEMALE, 29));
		list.add(new Member("공유",Member.MALE, 41));
		list.add(new Member("수지",Member.FEMALE, 31));
		
		double avg = list.stream().mapToInt(Member::getAge)
			.average().getAsDouble();
		System.out.println("평균나이 : "+avg);
		avg = list.stream()
			.filter(m->m.getGender()==Member.MALE)
			.mapToInt(Member::getAge)
			.average().getAsDouble();
		System.out.println("남자 평균나이 : "+avg);
		avg = list.stream()
			.filter(m->m.getGender()==Member.FEMALE)
			.mapToInt(Member::getAge)
			.average().getAsDouble();
		System.out.println("여자 평균나이 : "+avg);
		
	}
}