package ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ���� ���� ��� ���α׷�
		// 1. ��ü������ �����ؼ� ����
		// 2. ��� ������ ����
		// 3. �������� �̿��ؼ� Ȯ���� ���� ���α׷����� ����
		
		System.out.println("*****���� ���� ����*****");
		Scanner sc =new Scanner(System.in);
		
		while(true) {
		System.out.print("[1] �ﰢ�� [2] �簢�� [3] ����>>" );
		int choice = sc.nextInt();
		
		if(choice == 1) {
			// 1. ������ �Է�
			System.out.print(Triangle.getName() +"�� �غ�>>");
			double base = sc.nextDouble();
			System.out.print(Triangle.getName() +"�� ����>>");
			double height = sc.nextDouble();			
			// 2. �ﰢ�� ��ü ����
			Triangle t = new Triangle(base,height);
			// 3. �ﰢ���� ���� ��� �� ���
			System.out.println(Triangle.getName() +"�� ���� : " +t.calAtra());
			
		}else if(choice == 2) {
			// 1. ������ �Է�
			System.out.print(Renctangle.getName()+"�� �غ�>>");
			double width = sc.nextDouble();
			System.out.print(Renctangle.getName()+"�� ����>>");
			double height = sc.nextDouble();
			// 2. �簢�� ��ü ����
			Renctangle r = new Renctangle(width,height);
			// 3. �簢���� ���� ��� �� ���
			System.out.println(Renctangle.getName()+"�� ���� :" + r.calArea());
		}else if(choice ==3) {
			break;
		}
		
	}
}
}

