package com.shaymee.s2.ex2_1;

import java.util.Scanner;

public class StudentMenu {

	public void studentMenu() {
		Scanner sc = new Scanner(System.in);
		
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		System.out.println("학생 수를 입력하세요");		
		int count = sc.nextInt(); 
		
		Student[] students = new Student[count];
		
		
		for(int i=0;i<students.length;i++) {			
		//	Student student = si.studentInput();
		//	students[i]=student; 이렇게 써도 되고
			
			students[i]=si.studentInput();
		}
		
		sv.viewAll(students);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1.전체정보 출력");
			System.out.println("2.검색정보 출력");
			System.out.println("3.추가학생 입력");
			System.out.println("4.성적순 출력");
			System.out.println("5.프로그램 종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("==전체정보 출력==");
				
				sv.viewAll(students);
				
				continue;
				
			} else if(select==2) {
				System.out.println("==검색할 학생 번호 입력==");
				int choice = sc.nextInt();
				
				Student student = null;
				for(int i=0;i<students.length;i++) {
					if(choice == students[i].number) {
						student = students[i];
					}					
				}
				
				if(student != null) {
					sv.viewOne(student);
					
					continue;
				
				} else {
					System.out.println("==해당번호의 학생이 없음==");
					
					continue;
				}
				
			
			} else if(select==3) {				
				System.out.println("==학생정보 추가 입력=="); 
				Student[] students2 = si.addArray(students);
				students2[students.length] = si.studentInput();
				
				students = students2;

				
			} else if(select==4) {
				System.out.println("==높은 성적순으로 출력==");
				StudentRanking desc = new StudentRanking();
				Student[] students2 = desc.descRanking(students);
				
				sv.viewRanking(students2);
				
			} else {
				System.out.println("==프로그램 종료==");
				
				flag = false;
			}
		}
	
}
}
