package Helloworld2;

public class Human {
	
	private String name;
	private int height;
	private int weight;
	private int age;
	private int nambar;
	
/*Human(String name,int height,int weight,int age,int nambar){
	
	this.name = name ;
	this.height = height;
	this.weight = weight;
	this.age = age;
	this.nambar = nambar;
}*/

public String getName() {
	return name;
}

public void setAge(int age) {
	this.age = age;
}

public void setName(String name) {
	this.name = name;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public int getAge() {
	return age;
}

public int getNambar() {
	return nambar;
}

public void setNambar(int nambar) {
	this.nambar = nambar;
}

public void introduce() {
	System.out.println("���̖��O��" + name);
	System.out.println("�g��" + height);
	System.out.println("�̏d" + weight);
	System.out.println("�΂�" + age);
	System.out.println("���̍D���Ȑ�����" + nambar);
      }
}
