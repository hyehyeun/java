
public class �ݺ�������2 {

	public static void main(String[] args) {
		//1~20���� ���ڸ� ����غ���.
		// Ȧ���� ����� ����ϰ�, ¦���� ������ ��� �غ��ô�.
		// 1 -2 3 -4 5 -6 7 -8..... 19 -20
		
		// ¦�� : 2 4 6 8 -> 2�� ��� -> 2�� �������� ��������  0        i%2=0
		// Ȧ�� : 1 3 5 7 -> 2�� �������� �������� 1
		
//		for(int i = 1;i<=20; i++) {
//			if(i%2==0) {  //¦��
//			System.out.print(-i +" ");
//		}else {  //Ȧ��
//			System.out.print(i+" ");
//		}
//		
//		
//		}  
                                 //even�� 20�� �� ������           //2�� ���� 		
		for (int even=2, odd=1; even<=20 ; even+=2,odd+=2) {
			System.out.print(odd + " " +-even + " ");
		}

	}

	}
