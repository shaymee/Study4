package com.shaymee.ex1;

public class Ex1Main2 {

	public static void main(String[] args) {
		// Ex1Main 만 있으면 너무 복잡하니까 이 Main method를 추가한다고 하심
		System.out.println("Ex1Main2 Start");
		
		Pet pet1 = new Pet();
		pet1.name = "갸쓰이";
		
		Pet pet2 = new Pet();
		pet2.name = "힙똘이";
	
		Character c1 = new Character();
		c1.p1 = pet1;  // 수업 끝나고 복기한번 깊이 하자 오늘 배운 OOP 전부
		c1.p2 = pet2;
		
		System.out.println(c1.p1.name);
		System.out.println(c1.p2.name);
		
		//지난 주에 배웠던 배열
		//배열의 정의: 하나의 변수로 여러개의 데이터를 다룰 때 쓰는 것
		//배열의 기본개념: 배열은 같은 데이터타입만 묶을 수 있을 때 사용가능
		//모으려고하는데이터타입[] 변수명 = new 모으려고하는데이터타입[크기];
		//캐릭터가 소유한 펫 100마리(변수 100개 선언)
		Pet[] pets = new Pet[2];
		pets[0] =pet1;
//		pets[1] =pet2;
		pets[1] =new Pet();
		pets[1].name = "구리구리";

		for(int i=0;i<pets.length;i++) {
			System.out.println(pets[i]); // 이렇게 하면 배열 2칸에 담긴 pets[0]과 pets[1]의 주소값만 찍힘
			System.out.println(pets[i].name);
		}
		
		System.out.println("== fin. ==");

	}

}
