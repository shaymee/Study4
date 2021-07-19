package com.shaymee.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1Main Start");
		
		//캐릭터생성
		//이름, 레벨, 체력, 마나를 입력하고 각각 출력해보세요
		
		Character ch = new Character();  
		
		ch.name = "zl존전사vv"; // Character 타입! 
		ch.level = 1;
		ch.hp = 300;
		ch.mp = 30;
		
//		System.out.println(ch.weapon); // 이대로 넣으면 null 나온다! // 왜 초기값이 null이냐? 데이터타입마다 자동으로 넣어주는 초기값이 있다.
		
		//ch가 처음 가지고 있는 무기의 이름을 출력해보세요
	//	System.out.println(ch.weapon.name); // null
		
		//무기 생성
		//클래스는 무기 설계도

		Weapon weapon = new Weapon(); //  선언. 오브젝트는 실제 보이는 무기. 
		weapon.name = "돈까스써는칼"; // 웨폰 객체
		weapon.damage = 10;
		weapon.critical = 0.4; // 40퍼센트로 공격이 성공
		weapon.upgrade =1; 
		
		ch.weapon = weapon;     // 이렇게 ch.weapon.name을 출력하기 전에 데이터를 넣어줘야 함 // Weapon 타입을 넣을 수 있음		

		System.out.println(ch.weapon); //주소가 나오네?
	
		System.out.println(ch.weapon.name); // 만들어진 객체가 있으니 쓸 수 있음
	
		
		
		//ch가 가지고 있는 무기 이름 변경
		ch.weapon.name = "비후까스써는칼";
		System.out.println(ch.weapon.name); //잘나옴
		
		weapon.name = "생선까스써는칼";
		System.out.println(ch.weapon.name); //잘나옴
		
		
		
		System.out.println("Name : "+ch.name);
		System.out.println("Level : "+ch.level);
		System.out.println("Hp : "+ch.hp);
		System.out.println("Mp : "+ch.mp);
		System.out.println("Gold : "+ch.gold); //heap영역에 들어있는 것은 각타입에 맞는 초기값으로 자동 초기화가 진행됨
	 
		
		
		
		
		System.out.println("====================");
		

		
		
		//몬스터생성
		Monster monster = new Monster(); // 클래스명: Monster
		
		
		monster.name = "햄스터"; // Monster 타입! (이 타입 차이를 늘 유의해라)
		monster.level = 2;
		monster.hp = 100;
		monster.mp = 20;
		monster.gold = 30;
		
		
		System.out.println("몬스터이름 : "+monster.name);
		System.out.println("몬스터레벨 : "+monster.level);
		System.out.println("몬스터Hp : "+monster.hp);
		System.out.println("몬스터Mp : "+monster.mp);
		System.out.println("지급골드 : "+monster.gold);
		
		monster.weapon = new Weapon(); // new로 웨폰을 새로 만들고 손에 쥐어 줌 // @@@ 26번 줄 Weapon 선언과 비교해봐라!! : 일단 26번줄은 계속 바꿔서 쓸수있음
		monster.weapon.name="몽둥이"; //어렵다..	
		monster.weapon.damage=300;
		monster.weapon.critical=0.8;
		monster.weapon.upgrade=3;

//		monster = new Monster(); //새로 선언 안해도 가능? 아몰라
//		System.out.println(monster.level); // 주소가 바뀜. 그림 1-2) 참조
		
		//mon1 = null;
		// 참조변수(주소저장지)가 끊긴애가 있으면 garbage 뭐시기가 나와서 memory에서 없애줌
		
	//	ch=mon1 //error, ch는 Character라는 class로 선언->Character타입, mon1은 Monster타입 ===> 그러므로, 타입이 달라서 담을 수 없다.
		ch.gold += monster.gold; // 이건 됨. getGold와 monGold의 데이터타입이 갖으니까(같은 타입끼리만 담을 수 있다)
									// ch.getGold = ch.getGold+mon1.monGold
		
		
		//몬스터의 무기를 내껄로 갈아끼우기, 이름만 몽둥이로 갈아끼는게 아니라 전부 다 바꿔야
		ch.weapon=monster.weapon; // 이게 정답임
		
		

		
		System.out.println("Weapon : "+ch.weapon.name);
		System.out.println("Weapon : "+ch.weapon.damage);
		System.out.println("Weapon : "+ch.weapon.critical);
		System.out.println("Weapon : "+ch.weapon.upgrade);
		

		
		
		
		System.out.println("== fin. ==");

	}

}
