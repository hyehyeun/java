import java.util.Scanner;

public class 조건문05 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("일한시간을 입력하세요 : >>");
//		int hour = sc.nextInt();
//		int A = hour*5000;
//		hour = (number*1.5);
//		if(hour>8){
//	
//		System.out.println("총 임금은"+(40000+)"원 입니다.");}

		//컴퓨터야 너가 일한 시간 입력 이라고 말하면 내가 일한 시간을 입력할게
		//그럼 너는 그 값을 workTime이라는 변수에 담아줘
		//그리고 workTime에 담긴 값이 8보다 크다면
		//8시간 이후로는 이한 시간 부터는 5000원에 1.5배인 7500원으로 시급을 계산해줘
		//그후에 너는 총 일당을 출력해 주면되!
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간 입력 >>");
		int workTime = sc.nextInt();
		int resultMoney=0;
		
		if(workTime>8) {
		 resultMoney = (int) (8*5000+(workTime-8)*5000*1.5);
			System.out.println("총 임금 : "+ resultMoney);
		}
		
		else {
			 resultMoney = workTime*5000;
			System.out.println("총 임금 :"+resultMoney);
		    
		}
	
	}

}
