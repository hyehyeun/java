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
		//이전 합
		int res = 0;
		//0~3
		for(int i=0; i<n-2; i++) {
			//1~4 = 3장
			for(int j=i+1; j<n-1; j++) {
				
				//2~5 = 3장
				for(int k=j+1; k<n; k++) {
					int temp=arr[i]+arr[j]+arr[k];
				
				if(m==temp) {
					return temp;
				}
				// 카드 값이 이전합보다 크거나 m보다 작으면 계속 실행하게 만들어줌
				if(res < temp && temp<m) {
					res=temp;
					}
				}
			}
		}
		return res;
	}	
}
