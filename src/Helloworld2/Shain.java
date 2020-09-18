/*[課題02] [課題01]のPersonクラスを使用して、次のプログラムを作成してください。
           ①Personクラスを継承した、Shainクラスの作成。
           ②Shainクラスに、会社名を保持する変数「companyName」と、会社名を設定するメソッド「setCompanyName」を追加。
           ③Shainクラスのインスタンスを2つ作成する。(インスタンス化する値は各自決めてください。）
           ④それぞれのプロフィールを表示する。
                              ※名前、年齢、会社名*/

package Helloworld2;
//Personクラスを継承している
public class Shain extends Person {

	//インスタンス変数「companyName」を宣言
	private String companyName;

	//インスタンスメソッド「getCompanyName」の宣言
	public String getCompanyName() {
		return companyName;
	}

	//インスタンスメソッド「getCompanyName」の設定
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//継承したPersonクラスのメソッドと「CompanyName」をプロフィールとして表示する
	@Override
	public void showProfile() {
		
		super.showProfile();
	
		System.out.println("会社名は" + companyName + "です。");
				
	}
}
