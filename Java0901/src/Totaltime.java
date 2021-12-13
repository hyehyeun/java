import java.util.Scanner;

public class Totaltime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 :");
		int totalSecond = sc.nextInt();
		
		//시(hour), 분(minute), 초(second)
		int hour = totalSecond/3600;
		int minute = totalSecond%3600/60;
		int second = totalSecond%3600%60;
		
		System.out.println(hour+"시"+minute+"분"+second+"초");
		
		
		// System.out.println(totalSecond);
		

	}

}
