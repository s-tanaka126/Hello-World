package Helloworld2;

public class Kadai02 {

	public static void main(String[] args) {
	
		//Shainをインスタント化
		Shain shain = new Shain();
		
		shain.setName("Taro Yamada");
		shain.setAge(47);
		//会社名をセットし表示させる
		shain.setCompanyName("CROWD");
		//プロフィールを表示させる
		shain.showProfile();

	}
}
