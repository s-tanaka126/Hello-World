package Helloworld2;

public class Kadai01 {

	public static void main(String[] args) {
		//Personをインスタント化
		Person person = new Person();
		
		//名前をセットし表示
		person.setName("Taro Yamada");
		//年齢をセットし表示
		person.setAge(47);
		//プロフィールを表示させる
		person.showProfile();
	}

}
