
public class Student {
	// �ʵ� 
	private String name; // �̸� 
	private String stuNumber; // �й�
	private int grade;// �г�
	private int java; // java ����
	private int web; // web ���� ����
	private int iot; // iot ���� ����
	// �޼ҵ�
	// ������ : ��ü�� �����ϴ� �޼ҵ�
	// 1. ��ȯŸ���� ����(void�� ���� x)
	// 2. �޼ҵ� �̸��� Ŭ���� �̸��� ����
	// 3. �޸𸮿� ��ü ������ �Ҵ�
	// 4. �����ÿ� �� �ѹ��� ȣ��
	//    void�� �ʿ����, Ŭ���� �̸��� ������ �Ȱ���.
	//    �����޼ҵ�=> �Ҵ��� ���ִ°��� �����̱⿡ ��ȯŸ�� ��� ��!!
	public Student(String name, String stuNumber) {
		this.name = name; //this. �� �ڱ��ڽ��� ����Ű�� Ű���� 
		this.stuNumber = stuNumber;
		System.out.println("�л� ��ü ����");
		

	}
	// Java ������ �����ϴ� �޼ҵ�
	public void changeJava(int java) {
		this.java = java;
	}
	
	// web ������ �����ϴ� �޼ҵ�
	public void changeWeb(int web) {
		this.web = web;
	}
	
	// IoT ������ �����ϴ� �޼ҵ�
	public void changeIot(int iot) {
		this.iot = iot;
	}
	
	public String getName() {
		return name;
	}

}
