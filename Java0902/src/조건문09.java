import java.util.Scanner;

public class ���ǹ�09 {

	public static void main(String[] args) {
//if(menu==?)

		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt(); // Money => ����ڰ� ���� �ݾ�
		System.out.println("�޴��� ������");
		System.out.println("1. �ݶ�(800��) 2.����(500��) 3. ��Ÿ�ο���(1500��)");
		int menu = sc.nextInt(); // --> ����ڰ� ��Ÿ� �Է��ߴ���?

		int coka = 800;
		int water = 700;
		int bitawater = 2000;

		// ����ڰ� ������ �޴��� ���� money�� �� ����-->�ܵ�
		// ���� ����ڰ� �Է��� �ݾ��� ��ǰ�� ������ �۴ٸ�
		// '�ݾ��̺����մϴ�.' -> ���x, ����ڰ� �Է��� �ݾ��� ���

		if (menu == 1) {
			if (Money < coka) {
				System.out.println("�ݾ��� �����մϴ�");
			} else {
				Money = Money - coka;
			}

		}

		else if (menu == 2) {
			if (Money < water) {
				System.out.println("�ݾ��� �����մϴ�");
			}

			else {
				Money = Money - water;
			}
		} else if (menu == 3) {
			if (Money < bitawater) {
				System.out.println("���� �����ؿ�Ф�");
			} else {
				Money = Money - 1500;
			}
		}

		System.out.println("�ܵ� : " + Money + "��");
	
		//õ��¥�� �ܵ� ���� ���ϱ�
      //  System.out.println("õ�� : " + Money/1000);
        
        int õ�� = Money/1000;
        int ����� = Money%1000/500;
        int ��� = Money%1000%500/100;
        		
        System.out.println(" 1000�� : " + õ�� +" 500�� :" + ����� + " 100�� :" +���);
		

        
        
        
        
	}
}