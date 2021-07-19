package com.shaymee.s1;

import java.util.Scanner;

public class ClassStudy_2 {

	public static void main(String[] args) {
		System.out.println("ClassStudy_2 Start");
		Scanner sc = new Scanner(System.in);
				
		//학생의 수 만큼 정보를 입력하세요
		//ex.2명 입력 --> 입력정보:이름,번호,국어,영어,수학 / 총점, 평균(입력받은걸로 계산하면 됨)
		//총점, 평균도 계산해서 집어넣어줘야함
		
		//모든 학생의 정보가 출력되면 됨
		
		System.out.println("학생 수를 입력하세요");		
		int count = sc.nextInt(); 
		
		//학생을 모을 배열 선언
		Student[] students = new Student[count];
		Student[] students2 = new Student[students.length+1];

		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println("이름을 입력");
			student.name = sc.next();
			System.out.println("번호를 입력");
			student.num = sc.nextInt();
			System.out.println("국어점수 입력");
			student.kor = sc.nextInt();
			System.out.println("영어점수 입력");
			student.eng = sc.nextInt();
			System.out.println("수학점수 입력");
			student.math = sc.nextInt();
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/3.0;
			students[i]=student; // 최종출력은 배열에서 꺼내 씀.
		}
		
		boolean flag = true;
		boolean check = true;
		
		while(flag){
		
			if(check) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균"); // \t는 Tab 누른 것처럼 띄어쓰기 하라
		System.out.println("=====================================================================");
		for(int i=0;i<students.length;i++) {
			System.out.print(students[i].name+"\t");
			System.out.print(students[i].num+"\t");
			System.out.print(students[i].kor+"\t");
			System.out.print(students[i].eng+"\t");
			System.out.print(students[i].math+"\t");
			System.out.print(students[i].total+"\t");
			System.out.println(students[i].avg+"\t"); // 여기(평균)는 println으로 해야됨
			System.out.println("---------------------------------------------------------------------");
		}
			}
		
		//1. 전체정보출력: 1번누르면 위에 한것부터 시작- 다끝나면 프린트 5개가 나옴 
		//2. 학생번호검색: 내가보고싶은 학생의 번호를 입력 ex)3번입력->3번인 학생의 정보를 출력   --->about index별로 출력
		//				그 번호에 맞는 학생이 없으면 "없습니다" 하고 다시 1~5번 선택창 나옴				
		//3. 학생정보를 추가 - 학생한명을 배열에 추가하는 과정 "새로 추가될 학생의 이름,번호,국어,수학,영어 (확장문제)
		//4. 성적순으로 출력(평균이 높은애들부터 차례대로 정렬)    ---->내림차순 문제
		//5. 프로그램 종료  --->시마이
		
		
		System.out.println("1.전체정보 출력");
		System.out.println("2.학생번호 검색");
		System.out.println("3.학생정보 추가");
		System.out.println("4.평균성적순 출력");
		System.out.println("5.프로그램 종료");
		int select = sc.nextInt();
		
		if(select==1) {
			check=true;
			continue;
			
		} else if(select==2) {
			System.out.println("==학생번호 입력==");
			int stNo = sc.nextInt();
			stNo = stNo-1;
			boolean input = false;
			
			for(int i=0;i<students.length;i++) {
				if(stNo==i) {
					input=true;
				}
			}			
			
				if(input) {
					System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균"); 
					System.out.println("=====================================================================");
					for(int i=stNo;i<stNo+1;i++) {
					System.out.print(students[i].name+"\t");
					System.out.print(students[i].num+"\t");
					System.out.print(students[i].kor+"\t");
					System.out.print(students[i].eng+"\t");
					System.out.print(students[i].math+"\t");
					System.out.print(students[i].total+"\t");
					System.out.println(students[i].avg+"\t");
					System.out.println("----------------------------------------------------------");
		
					check=false;
					break;		
					}
					
				} else {
					System.out.println("==해당번호 없음==");
					check=false;
					
				}

		} else if(select==3) {
			students2 = new Student[students.length+1];
			for(int i=0;i<students.length;i++) {
				students2[i]=students[i];
			}
			
			for(int i=students.length;i<students.length+1;i++) {
			Student student = new Student();
			System.out.println("추가학생 이름 입력");
			student.name = sc.next();
			System.out.println("추가학생 번호 입력");
			student.num = sc.nextInt();
			System.out.println("추가학생 국어 입력");
			student.kor = sc.nextInt();
			System.out.println("추가학생 영어 입력");
			student.eng = sc.nextInt();
			System.out.println("추가학생 수학 입력");
			student.math = sc.nextInt();
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/3.0;
			students2[i]=student;			
			
			students = students2;
			check = false;
			System.out.println("==추가학생 생성완료==");
			break;
			}
			
		} else if(select==4) {
			for(int idx=0;idx<students.length-1;idx++) {
				for(int i=idx+1;i<students.length;i++) {
					if(students[idx].avg < students[i].avg) {
						double tmp = students[i].avg;
						students[i].avg = students[idx].avg;
						students[idx].avg = tmp;
					}
				
				}
			}
			
			System.out.println("이름\t"+"평균");
			System.out.println("=============");			
			for(int i=0;i<students.length;i++) {
				System.out.print(students[i].name+"\t");
				System.out.println(students[i].avg);
				
			}
			check=false;
		} else {
			System.out.println("==프로그램 종료==");
			flag = false;
		}
		
		

		

		
		
		
		
		
		
		}

		
		System.out.println("=== fin. ===");
	}

}
