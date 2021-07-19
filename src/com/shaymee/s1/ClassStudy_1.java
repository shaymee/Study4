package com.shaymee.s1;

public class ClassStudy_1 {

	public static void main(String[] args) {
		//메인메서드의 용도는 프로그램을 시작하는 용도
		//또는 메서드 테스트 용도 --> 비중이 점점 줄어들 것이라고 말씀하심
		//메인메서드는 여러 클래스 중 하나만 있으면 됨
		//메인메서드는 작업대 + 설계도는 따로 만들어야함(따로만든 이 설계도는 Class)
		
		System.out.println("Study1 Start");
		//눈에 보이는 학생 1명 생성
		//클래스명(==설계도명,일종의 데이터타입) 변수명 = new(클래스를 보고 만드는 연산자임) 클래스명();
		//클래스명 변수명 = new 클래스명(); //변수명은 내 마음대로
		Student st = new Student(); //이것이 실제 눈에 보이는 학생 한명을 만든 것
		
		Student st2 = new Student();
		
		System.out.println(st); //com.shaymee.s1.Student(클래스명)@(구분자)7de26db8(주소)
		System.out.println(st2);
		
		System.out.println(st==st2); // false, st와 st2는 heap에 만들어놓은 주소가 들어있을 뿐. st와 st2 내의 값은 실제 객체를 가르키는 '주소'

		//멤버의 접근(사용법) --> 배열처럼 index번호로 사용X
		//참조변수명.멤버변수명=값;(String이면 " ", int면 그냥 값) **이 주소의 ~~의=값;
		st.name="shaymee"; //st는 Student타입, st.name은 String타입
		st.num=1; //st는 Student타입, st.name은 int타입
		st.kor=30;
		st.eng=40;
		st.math=45;
		
		System.out.println("st의 이름: "+st.name);
		
		//학생 st의 총점을 계산해서 입력하고 출력해보세요
		st.total=st.kor+st.eng+st.math;
		System.out.println("st의 총점: "+st.total);
		
		//학생 st의 평균을 계산해서 대입하고 출력해보세요
		st.avg=st.total/3.0;
		System.out.println("st의 평균: "+st.avg);
		
		st2.num=1;
		System.out.println(st.num==st2.num); // 내예상답:true, 이유:st.num과 st2.num의 값을 비교하는 거니까(주소를 비교하는 것이 아님)
		
		st2 = st; // st2는 Student타입, st도 Student타입  --> 배열 때처럼 담을 수 있음(배열복사)
		
		
		
		
		System.out.println("fin.");

	}

}
