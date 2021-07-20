package com.shaymee.s2.ex2_1;

public class StudentView {

	public void viewAll(Student[] students) {	// 전체출력 메소드 
		
			System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균"); // \t는 Tab 누른 것처럼 띄어쓰기 하라
			System.out.println("=====================================================================");
			
			for(int i=0;i<students.length;i++) {
				System.out.print(students[i].name+"\t");
				System.out.print(students[i].number+"\t");
				System.out.print(students[i].kor+"\t");
				System.out.print(students[i].eng+"\t");
				System.out.print(students[i].math+"\t");
				System.out.print(students[i].total+"\t");
				System.out.println(students[i].avg+"\t"); // 여기(평균)는 println으로 해야됨
				System.out.println("---------------------------------------------------------------------");
				
	}
	
}

	
	
	public void viewOne(Student student) {	//선택번호 출력 메소드
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균"); 
				System.out.println("=====================================================================");
					System.out.print(student.name+"\t");
					System.out.print(student.number+"\t");
					System.out.print(student.kor+"\t");
					System.out.print(student.eng+"\t");
					System.out.print(student.math+"\t");
					System.out.print(student.total+"\t");
					System.out.println(student.avg+"\t");
					System.out.println("----------------------------------------------------------");	
		
	}
	
	
	public void viewRanking(Student[] students2) {	//등수매기기 메소드
		System.out.println("이름"+"\t"+"성적");
		System.out.println("===================");
		for(int i=0; i<students2.length;i++) {
			System.out.print(students2[i].name+"\t");
			System.out.println(students2[i].avg);
		}
		System.out.println("-------------------");
	}
	
}


