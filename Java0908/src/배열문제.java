import java.util.Scanner;

public class 배열문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]score = new int[5];
//		int i = 0;
//		System.out.println("입력된 점수: " + score[i]);
//		score[0] = sc.nextInt();
//		System.out.println("최고 점수: " + score[i]);
//		score[1] = sc.nextInt();
//		System.out.println("최저 점수 : " + score[i]);
//		score[2] = sc.nextInt();
//		System.out.println("총합: " + score[i]);
//		score[3] = sc.nextInt();
//		System.out.println("평균: " + score[i]);
//		score[4] = sc.nextInt();
		
		for(int n=0 ;n < score.length; n++) {
			System.out.print( (n+1) + "번째 입력>>");
			score[n] = sc.nextInt();
		}
		System.out.print("입력점수 : ");
	   for(int i=0; i<score.length; i++) {
		   System.out.print(score[i] + " ");
	   }
	   //최대값과, 최소값 구하기
	   //int max 와 int min 을 선언한뒤
	   //배열의 최대값과 최솟값으로 초기화 시켜주면됨!
	   int max = score[0];
	   int min = score[0];
	   
	   for(int i=0; i < score.length; i++) {
		   if(max < score[i]);{
		   max = score[i];
	   }
	   
	   if(min > score[i]) {
		   min = score[i];
	   }

	}
	   System.out.println();
	   System.out.println("최고 점수 : "+max);
	   System.out.println("최저 점수 : "+min);
	   
	   //int sum 활용 -> 반복문 돌때마다 sum에 값을 더하기!
	   //평균은 sum을 배열의 길이로 나누기!
	   
	   int sum = 0;
	   for(int i=0; i<score.length;i++) {
		   sum = sum+score[i];
	   }
	   System.out.println("총합 : " + sum);
	   System.out.println("평균 : " + (double)sum/score.length);
	   
	   

}
}
