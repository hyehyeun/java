import java.util.Scanner;

public class ���ڿ��ּ� {

	public static void main(String[] args) {
		// ���ͷ� ���
		int num = 10;
		float f = 3.14f;
		String s = "�ٳ���";		//�ٳ��� �ΰ����� ���� �ϳ���! �Ȱ����Ƿ�!! 
		String s2 = "�ٳ���";    //������ �� �� �̸� �ۼ��� ����
		
		System.out.println(s == s2);
		
		Scanner sc = new Scanner(System.in);  //�� ���Ӱ� ���� �Ҵ�Ǿ� �Էµ�
		String s3 = sc.next();  
		
		System.out.println(s==s3);

	}

}
