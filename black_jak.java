import java.util.Scanner;

public class black_jak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); 
		int m = sc.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = search(arr,n,m);
		System.out.println(res);

	}
	
	static int search(int[]arr,int n,int m) {
		//���� ��
		int res = 0;
		//0~3
		for(int i=0; i<n-2; i++) {
			//1~4 = 3��
			for(int j=i+1; j<n-1; j++) {
				
				//2~5 = 3��
				for(int k=j+1; k<n; k++) {
					int temp=arr[i]+arr[j]+arr[k];
				
				if(m==temp) {
					return temp;
				}
				// ī�� ���� �����պ��� ũ�ų� m���� ������ ��� �����ϰ� �������
				if(res < temp && temp<m) {
					res=temp;
					}
				}
			}
		}
		return res;
	}	
}
