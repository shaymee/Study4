package com.shaymee.ex1;

public class Character { //캐릭터 class 내 각각의 멤버변수들

	String name; // 멤버변수 // Character는 name을 가지고 있다.
	int level; // 멤버변수 // Character는 level을 가지고 있다.
	int hp; //멤버변수 // Character는 hp를 가지고 있다.
	int mp; //멤버변수 // Character는 mp를 가지고 있다.
	int gold; //멤버변수 // Character는 gold를 가지고 있다.
	Weapon weapon; // Reference type도 멤버변수로 선언할 수 있다. why? 어떤 데이터타입이든 선언이 가능하니까 // weapon의 데이터타입은 Weapon타입임
	Pet p1;
	Pet p2;
	
	
	
// 캐릭터는 이런식으로 정의됨.(설계도)
// 클래스에 선언된 멤버변수들은 지금 메모리를 확보하고 있을까? 안하고 있을까? ---> 아직 메모리확보를 안 한거다!
// 이렇게 만들어주세요~ 하고 설계도를 그린것(그냥 글로 써놓은것)이고 실제로 만든 것은 아니다
// 실제 만드는 때는 new Character(); 해야 그 때 heap에다가 만들어지고 메모리를 확보해줌
	
	
}
