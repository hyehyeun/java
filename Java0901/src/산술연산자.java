
public class ��������� {

	public static void main(String[] args) {
       int num1 = 10;
       int num2 = 7;
       float num3 = 10.0f;
       double num4 = 7.0; //�ڹٿ��� �Ǽ��� �⺻������ double Ÿ������ �ν�
       
       System.out.println(num1/num2);
       System.out.println(num3/num4);
       System.out.println(num1/num4);
       
       //���ڿ� Ÿ�� �ٷ��
       String str1 = "10";
       String str2 = "7";
       
       System.out.println(str1 + str2);
       System.out.println(num1 + str1); // ����ȯ -> ���� num1�� ���ڿ��� ��ȯ
       
       int num = 456;
       
       System.out.println("���Ȯ�� :" + num / 100 + "00");
       System.out.println(num - num % 100);
       System.out.println( num/100 + "00");
       System.out.println(num/100 * 100);
       
       
       //������ �ڽ� ���ϱ�
       int orange = 3729;
       int number = 52;
       
       System.out.println("��𾾰� �� �ڽ��� �� �� �ִ� �ڽ��� ���� :" + orange / number);
      
       int i = 3;
       
       System.out.println(++i);
       System.out.println(i++);
       System.out.println(i);

 
	}
     
	}
