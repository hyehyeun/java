import java.util.Scanner;

public class 이차원배열출력06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] answer = {{4,5,4,1,2}, //답 있는 행
						{0,0,0,0,0},
						{10,20,30,20,20}}; //각 문제에 대한 배점행

		
		
		for(int i=0; i <answer[1].length; i++) {
			System.out.print((i+1) + "번째 답>>");
			answer[1][i]=sc.nextInt();
				
			}
		
		int total = 0;//총점을 저장할 변수		
		for(int i=0; i<answer[0].length; i++) {
			if(answer[0][i] == answer[1][i]) {
				System.out.print("O ");
				total=total+answer[2][i];
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("총점 :" + total);

	
	}
		}