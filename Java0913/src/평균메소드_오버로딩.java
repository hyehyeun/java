
public class ��ո޼ҵ�_�����ε� {

	public static void main(String[] args) {
		// �޼ҵ� ȣ��
		double rs = mean(60.5,75.3,78.5);
		
		
		// ��� ���(syso)
		System.out.println(rs);
		
	}
	//�޼ҵ� ���� : kor, eng, math (mean�� ��� �����ϴ��� �����ϴ� ��)
	public static double mean(int kor, int eng, int math) {
		double result = (kor + eng + math) /(double) 3;
						                     //�谭�� �� ��ȯ(�յ� ��밡��)
											// 10/3.0 ���ε� 
		
		return result; 
	}
	// �޼ҵ� �ߺ����� : ���� �̸��� �޼ҵ带 �����ϴ� ��
	// �Ű������� ������ Ÿ���̳� ������ �ٸ��� �ۼ��ؾ� ����
	public static double mean(int kor, int eng, int math, int java) {
		double result = (kor+eng+math+java)/4.0;
		return result;
	}
	// �� ���� �Ǽ�
	public static double mean(double kor, double eng, double math) {
		double result = (kor+eng+math)/3.0;
		return result;
	}
}
