
public class PersonInfo {
	
	//�̸�
	//��ȭ��ȣ
	//����	
	private String name;
	private String number;
	private String birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PersonInfo(String name, String number, String birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	//������ ����/�����������ؼ�
	// get, set Ȱ��
	

}
