import java.util.Scanner;

public class �迭���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]score = new int[5];
//		int i = 0;
//		System.out.println("�Էµ� ����: " + score[i]);
//		score[0] = sc.nextInt();
//		System.out.println("�ְ� ����: " + score[i]);
//		score[1] = sc.nextInt();
//		System.out.println("���� ���� : " + score[i]);
//		score[2] = sc.nextInt();
//		System.out.println("����: " + score[i]);
//		score[3] = sc.nextInt();
//		System.out.println("���: " + score[i]);
//		score[4] = sc.nextInt();
		
		for(int n=0 ;n < score.length; n++) {
			System.out.print( (n+1) + "��° �Է�>>");
			score[n] = sc.nextInt();
		}
		System.out.print("�Է����� : ");
	   for(int i=0; i<score.length; i++) {
		   System.out.print(score[i] + " ");
	   }
	   //�ִ밪��, �ּҰ� ���ϱ�
	   //int max �� int min �� �����ѵ�
	   //�迭�� �ִ밪�� �ּڰ����� �ʱ�ȭ �����ָ��!
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
	   System.out.println("�ְ� ���� : "+max);
	   System.out.println("���� ���� : "+min);
	   
	   //int sum Ȱ�� -> �ݺ��� �������� sum�� ���� ���ϱ�!
	   //����� sum�� �迭�� ���̷� ������!
	   
	   int sum = 0;
	   for(int i=0; i<score.length;i++) {
		   sum = sum+score[i];
	   }
	   System.out.println("���� : " + sum);
	   System.out.println("��� : " + (double)sum/score.length);
	   
	   

}
}
