import java.util.Scanner;

public class �������迭���06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] answer = {{4,5,4,1,2}, //�� �ִ� ��
						{0,0,0,0,0},
						{10,20,30,20,20}}; //�� ������ ���� ������

		
		
		for(int i=0; i <answer[1].length; i++) {
			System.out.print((i+1) + "��° ��>>");
			answer[1][i]=sc.nextInt();
				
			}
		
		int total = 0;//������ ������ ����		
		for(int i=0; i<answer[0].length; i++) {
			if(answer[0][i] == answer[1][i]) {
				System.out.print("O ");
				total=total+answer[2][i];
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println("���� :" + total);

	
	}
		}