package oop1;

public class PersonDemo1 {
	public static void main(String[] args) {
		
		// Person 객체 만들기
		/*
		Person p1 : Person 설계도로 생성된 객체의 주소값을 담는 변수 p1을 생성
		new Person() : Person 설계도로 메모리에 객체 생성, 생성된 객체의 주소값을 반환
		Person p1 = new Person();
			 : Person 설계도로 메모리에 객체 생성, 생성된 객체의 주소값을 Person 타입 변수 p1에 대입
		*/
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		
		// p1이 참조하는 객체 속성 변경
		p1.name = "김유신";
		p1.tel = "010-1234-5678";
		p1.email = "kimys@naver.com";
		p1.gender = "남자";
		p1.age = 50;
		// 기존 null, null, null, null, 0 값을 해당 값으로 변경
		
		p2.name = "이순신";
		p2.tel = "010-1234-4321";
		p2.email = "leesh@gmail.com";
		p2.gender = "남자";
		p2.age = 48;
		
		p3.name = "류관순";
		p3.tel = "010-1234-7654";
		p3.email = "ryugs@daum.net";
		p3.gender = "여자";
		p3.age = 17;
		
		
		
	}
}
