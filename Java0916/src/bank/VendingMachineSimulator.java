package bank;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== B반 자판기 ====");
		System.out.print("금액 투입>> ");
		int input_money = sc.nextInt();
		
		int res = vm.input_money(input_money);
		System.out.println("잔액 : " + res);
		
		while(true) {
			System.out.println("[1]스프라이트>>900원 [2]코카콜라>>1000원 [3]잔액반환");
			System.out.print("입력 : ");
			int choice_manu = sc.nextInt();
			if(choice_manu == 1 || choice_manu == 2) {
				res = vm.choice_manu(choice_manu);
				System.out.println("잔액: " + res);
			} else if(choice_manu == 3) {
				vm.output_money();
				break;
			}
		}
		System.out.println();
		System.out.println("이용해 주셔서 감사합니다!!");
		int secreat = sc.nextInt();
		if(secreat == 486) {
			vm.manager();
		}

	}

}
