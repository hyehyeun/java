import java.util.ArrayList;
import java.util.Scanner;

public class PoketMain {

   public static void main(String[] args) {
      
      //포켓몬 수는 정확히 알수 없다. 
      //포켓몬 도감에 몇마리가 들어가야하는지 알수 없다
      
      //포켓몬 도감이 될 어레이 리스트
	  Scanner sc = new Scanner(System.in);
      ArrayList<Poketmon> poktList = new ArrayList<Poketmon>();
      for(int i=0; i<5;i++) {
      System.out.print("이름 입력>>");
      String name = sc.next();
      System.out.print("타입 입력>>");
      String type = sc.next();
      System.out.print("공격력 입력>>");
      int attack = sc.nextInt();
      System.out.print("방어력 입력>>");
      int sheild = sc.nextInt();
      System.out.print("체력입력>>");
      int hp = sc.nextInt();
      
      //사용자가 입력한 값으로 객체 만들기
      Poketmon poket = new Poketmon(name,type,attack,sheild,hp);
      poktList.add(poket);
      }
      
      Poketmon pika = new Poketmon("피카츄", "번개", 80, 60, 70);
      Poketmon piri = new Poketmon("파이리", "불", 90, 40, 50);
      Poketmon kkobuk = new Poketmon("꼬부기", "물", 70, 70, 60);
      Poketmon zambo = new Poketmon("잠만보", "노멀", 100, 80, 30);
      
      //포켓몬도감 추가
      poktList.add(pika);
      poktList.add(piri);
      poktList.add(kkobuk);
      poktList.add(zambo);
      
      //포켓몬 확인
      System.out.println("===포켓몬 리스트 출력===");
      for(int i =0; i<poktList.size(); i++) {
    	 String name = poktList.get(i).getName(); 
    	 System.out.println((i+1)+ "." + name);
      }
      
      //포켓몬 두마리 선택
      System.out.print("첫번째 포켓몬 번호 입력>>");
      int num1 = sc.nextInt();
      
      System.out.println("두번째 포켓몬 번호 입력>>");
      int num2 = sc.nextInt();
      
      int attack1 = poktList.get(num1-1).getAttack();
      int attack2 = poktList.get(num2-1).getAttack();
      
      if(attack1>attack2) {   	  
    	  //첫번째 포켓몬이 이겼습니다. -->첫 번째 포켓몬의 이름 출력
    	  System.out.print("첫 번째 포켓몬이 이겼습니다."+poktList.get(0).getAttack());
      }else if(attack2>attack1) {
    	  //두번째 포켓몬이 이겼습니다 -->두 번째 포켓몬의 이름 출력
    	  System.out.print("두 번째 포켓몬이 이겼습니다."+poktList.get(0).getAttack());
      }else {
    	  //무승부입니다.출력
    	  System.out.print("무승부입니다.");
      }
      System.out.println("피카츄 공격력 :"+poktList.get(0).getAttack());
      
      //포켓몬 도감 만들기 5마리
      
      
      
      
      
      
   }

}