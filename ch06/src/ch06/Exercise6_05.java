package ch06;

public class Exercise6_05 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student2{
	int sum;	// 총점
	double avg;	// 평균
	String name;	//학생이름
	int ban;	//반
	int no;		//번호
	int kor;	//국어점수
	int eng;	//영어점수
	int math;	//수학점수

	Student2(String name, int ban, int no,int kor,int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum += kor+eng+math;
		avg = Math.round(sum/3.0*10)/10.0;
	}
	String info() {
		return name +","+ ban +","+ no +","+ kor +","+ eng +","+ math +","+ sum +","+ avg;
	}
}
