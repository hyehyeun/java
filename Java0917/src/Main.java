
public class Main {

	public static void main(String[] args) {
		// 학생 성적을 관리하는 시스템
		// 학생 객체가 중요하다 .
		
		// 객체 만들기
		// 클래스명 변수명 = new 클래스명();
		//					생성자 호출
		// 생성자 : 클래스로부터 객체를 생성(메모리에 할당)
		Student stu1 = new Student("황해도","111111");  //객체만들기1 (); 생성자 메소드(메소드 호출과 흡사)
		Student stu2 = new Student("임승환","222222");  //객체만들기2   객체는 살아있는놈 
		Student stu3 = new Student("서대희","333333");
		
		stu1.changeJava(90);
		stu2.changeJava(85);
		stu3.changeJava(10);

	
	

		
	}

}