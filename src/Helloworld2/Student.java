package Helloworld2;

public class Student extends Human {
	
	private String birthday;
	private String schoolName;
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
		
	public void introduce() {
		
		super.introduce();
		
		System.out.println("���̒a������" + birthday);
		System.out.println("�w�Z����" + schoolName);
	}

}