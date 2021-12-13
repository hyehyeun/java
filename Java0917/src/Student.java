
public class Student {
	// 필드 
	private String name; // 이름 
	private String stuNumber; // 학번
	private int grade;// 학년
	private int java; // java 과목
	private int web; // web 과목 점수
	private int iot; // iot 과목 점수
	// 메소드
	// 생성자 : 객체를 생성하는 메소드
	// 1. 반환타입이 없다(void도 쓰지 x)
	// 2. 메소드 이름은 클래스 이름과 동일
	// 3. 메모리에 객체 공간을 할당
	// 4. 생성시에 딱 한번만 호출
	//    void도 필요없음, 클래스 이름과 완전히 똑같음.
	//    생성메소드=> 할당을 해주는것이 목적이기에 반환타입 없어도 됨!!
	public Student(String name, String stuNumber) {
		this.name = name; //this. 은 자기자신을 가르키는 키워드 
		this.stuNumber = stuNumber;
		System.out.println("학생 객체 생성");
		

	}
	// Java 점수를 수정하는 메소드
	public void changeJava(int java) {
		this.java = java;
	}
	
	// web 점수를 수정하는 메소드
	public void changeWeb(int web) {
		this.web = web;
	}
	
	// IoT 점수를 수정하는 메소드
	public void changeIot(int iot) {
		this.iot = iot;
	}
	
	public String getName() {
		return name;
	}

}
