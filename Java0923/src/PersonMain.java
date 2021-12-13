import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10명이 들어갈 전화번호부 배열생성
		PersonInfo[] list = new PersonInfo[10];
		
		System.out.print("이름입력>>");
		String name = sc.next();
		
		System.out.print("번호>>");
		String number = sc.next();
		
		System.out.print("생일입력>>");
		String birthday = sc.next();
		
		PersonInfo info = new PersonInfo(name,number,birthday);
//		info.setName(name);
//		info.setNumber(number);
//		info.setBirthday(birthday);
		
		System.out.println(info.getName()); //name 값 가져오기
		System.out.println(info.getNumber()); //number값 가져오기
		System.out.println(info.getBirthday()); //birth값 가져오기
		
		list[0] = info; //전화번호 데이터 저장
		//여러분들의 팀원 전화번호부를 (list)를 만들어주세요
		
		PersonInfo info2 = new PersonInfo("","","");		
		list[1] = info2;
		
		for(int i = 0; i<list.length; i++) {			
			System.out.print("이름입력>>");
			String name1 = sc.next();
			
			System.out.print("번호>>");
			String number1 = sc.next();
			
			System.out.print("생일입력>>");
			String birthday1 = sc.next();
			list[i] = info3;
		}
		System.out.println("이름출력>>"+list[1].getName());
		System.out.println("번호출력>>"+list[1].getNumber());
		System.out.println("생일출력>>"+list[1].getBirthday());
	}

}
