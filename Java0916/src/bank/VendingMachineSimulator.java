package bank;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== B�� ���Ǳ� ====");
		System.out.print("�ݾ� ����>> ");
		int input_money = sc.nextInt();
		
		int res = vm.input_money(input_money);
		System.out.println("�ܾ� : " + res);
		
		while(true) {
			System.out.println("[1]��������Ʈ>>900�� [2]��ī�ݶ�>>1000�� [3]�ܾ׹�ȯ");
			System.out.print("�Է� : ");
			int choice_manu = sc.nextInt();
			if(choice_manu == 1 || choice_manu == 2) {
				res = vm.choice_manu(choice_manu);
				System.out.println("�ܾ�: " + res);
			} else if(choice_manu == 3) {
				vm.output_money();
				break;
			}
		}
		System.out.println();
		System.out.println("�̿��� �ּż� �����մϴ�!!");
		int secreat = sc.nextInt();
		if(secreat == 486) {
			vm.manager();
		}

	}

}
