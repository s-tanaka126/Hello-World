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
		
		System.out.println("私の誕生日は" + birthday);
		System.out.println("学校名は" + schoolName);
	}

}