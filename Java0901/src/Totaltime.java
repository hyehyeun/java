import java.util.Scanner;

public class Totaltime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� :");
		int totalSecond = sc.nextInt();
		
		//��(hour), ��(minute), ��(second)
		int hour = totalSecond/3600;
		int minute = totalSecond%3600/60;
		int second = totalSecond%3600%60;
		
		System.out.println(hour+"��"+minute+"��"+second+"��");
		
		
		// System.out.println(totalSecond);
		

	}

}
