
public class 산술연산자 {

	public static void main(String[] args) {
       int num1 = 10;
       int num2 = 7;
       float num3 = 10.0f;
       double num4 = 7.0; //자바에서 실수는 기본적으로 double 타입으로 인식
       
       System.out.println(num1/num2);
       System.out.println(num3/num4);
       System.out.println(num1/num4);
       
       //문자열 타입 다루기
       String str1 = "10";
       String str2 = "7";
       
       System.out.println(str1 + str2);
       System.out.println(num1 + str1); // 형변환 -> 숫자 num1이 문자열로 변환
       
       int num = 456;
       
       System.out.println("결과확인 :" + num / 100 + "00");
       System.out.println(num - num % 100);
       System.out.println( num/100 + "00");
       System.out.println(num/100 * 100);
       
       
       //오렌지 박스 구하기
       int orange = 3729;
       int number = 52;
       
       System.out.println("김모씨가 귤 박스를 줄 수 있는 박스의 수는 :" + orange / number);
      
       int i = 3;
       
       System.out.println(++i);
       System.out.println(i++);
       System.out.println(i);

 
	}
     
	}
