package com.shaymee.s2.ex2_1;

public class StudentRanking {

	public Student[] descRanking(Student[] students) {	// 내림차순 메소드
		for(int idx=0;idx<students.length;idx++) {
			for(int i=idx+1;i<students.length;i++) {
				if(students[idx].avg < students[i].avg) {    //students[i]는 그냥 배열에 담긴 객체의 주소를 나타낸다
					double tmp = students[idx].avg;
					students[idx].avg = students[i].avg;
					students[i].avg = tmp;										
				}
				
				
			}
		}
			return students;
		
	}
	



public Student[] asecRanking(Student[] students) {	// 오름차순 메소드
	for(int idx=0;idx<students.length;idx++) {
		for(int i=idx+1;i<students.length;i++) {
			if(students[idx].avg > students[i].avg) {    // students[i]는 그냥 배열에 담긴 객체의 주소를 나타낸다
				double tmp = students[idx].avg;
				students[idx].avg = students[i].avg;
				students[i].avg = tmp;										
			}
			
			
		}
	}
		return students;
	
}

}