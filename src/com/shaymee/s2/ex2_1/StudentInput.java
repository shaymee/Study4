package com.shaymee.s2.ex2_1;

import java.util.Scanner;

public class StudentInput {

	public Student studentInput() {		//학생정보 입력 메소드
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
						
		System.out.println("이름을 입력");
		student.name = sc.next();
		System.out.println("번호를 입력");
		student.number = sc.nextInt();
		System.out.println("국어점수 입력");
		student.kor = sc.nextInt();
		System.out.println("영어점수 입력");
		student.eng = sc.nextInt();
		System.out.println("수학점수 입력");
		student.math = sc.nextInt();
		student.total = student.kor + student.eng + student.math;
		student.avg = student.total/3.0;
		
		return student;
		
	}


	public Student[] addArray(Student[] students) {		// 추가된 학생 정보입력 메소드

		Student[] students2 = new Student[students.length+1];
		
		for(int i=0;i<students.length;i++) {
			students2[i]=students[i];
		}				
		
		return students2;
		
		
	}
	
}
