import java.util.ArrayList;
import java.util.Scanner;

public class PoketMain {

   public static void main(String[] args) {
      
      //���ϸ� ���� ��Ȯ�� �˼� ����. 
      //���ϸ� ������ ����� �����ϴ��� �˼� ����
      
      //���ϸ� ������ �� ��� ����Ʈ
	  Scanner sc = new Scanner(System.in);
      ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
      for(int i=0; i<5;i++) {
      System.out.print("�̸� �Է�>>");
      String name = sc.next();
      System.out.print("Ÿ�� �Է�>>");
      String type = sc.next();
      System.out.print("���ݷ� �Է�>>");
      int attack = sc.nextInt();
      System.out.print("���� �Է�>>");
      int sheild = sc.nextInt();
      System.out.print("ü���Է�>>");
      int hp = sc.nextInt();
      
      //����ڰ� �Է��� ������ ��ü �����
      Poketmon poket = new Poketmon(name,type,attack,sheild,hp);
      poktList.add(poket);
      }
      
      Poketmon pika = new Poketmon("��ī��", "����", 80, 60, 70);
      Poketmon piri = new Poketmon("���̸�", "��", 90, 40, 50);
      Poketmon kkobuk = new Poketmon("���α�", "��", 70, 70, 60);
      Poketmon zambo = new Poketmon("�Ḹ��", "���", 100, 80, 30);
      
      //���ϸ󵵰� �߰�
      poktList.add(pika);
      poktList.add(piri);
      poktList.add(kkobuk);
      poktList.add(zambo);
      
      //���ϸ� Ȯ��
      System.out.println("===���ϸ� ����Ʈ ���===");
      for(int i =0; i<poktList.size(); i++) {
    	 String name = poktList.get(i).getName(); 
    	 System.out.println((i+1)+ "." + name);
      }
      
      //���ϸ� �θ��� ����
      System.out.print("ù��° ���ϸ� ��ȣ �Է�>>");
      int num1 = sc.nextInt();
      
      System.out.println("�ι�° ���ϸ� ��ȣ �Է�>>");
      int num2 = sc.nextInt();
      
      int attack1 = poktList.get(num1-1).getAttack();
      int attack2 = poktList.get(num2-1).getAttack();
      
      if(attack1>attack2) {   	  
    	  //ù��° ���ϸ��� �̰���ϴ�. -->ù ��° ���ϸ��� �̸� ���
    	  System.out.print("ù ��° ���ϸ��� �̰���ϴ�."+poktList.get(0).getAttack());
      }else if(attack2>attack1) {
    	  //�ι�° ���ϸ��� �̰���ϴ� -->�� ��° ���ϸ��� �̸� ���
    	  System.out.print("�� ��° ���ϸ��� �̰���ϴ�."+poktList.get(0).getAttack());
      }else {
    	  //���º��Դϴ�.���
    	  System.out.print("���º��Դϴ�.");
      }
      System.out.println("��ī�� ���ݷ� :"+poktList.get(0).getAttack());
      
      //���ϸ� ���� ����� 5����
      
      
      
      
      
      
   }

}