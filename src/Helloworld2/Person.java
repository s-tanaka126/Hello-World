/*
 * [演習01]以下のPersonクラスを変更してください。
           ① Personクラスに年齢を保持するメンバ変数ageと、年齢を設定するメソッドsetAgeを追
                             加する。
           ② showProfileメソッドを名前と年齢を表示するように変更する。
           ③ MainクラスでPersonクラスのインスタンスを作成する。
                              ※コンストラクタは使用しない。
           ④ 名前に「Taro Yamada」、年齢に「47」を設定する。
           ⑤ プロフィールを表示する。
 */


package Helloworld2;

public class Person {
	
	//インスタント変数「name」を宣言
	private String name;
	//インスタント変数「age」を宣言
	private int age;

	//インスタントメソッド「getName」の宣言
	public String getName() {
		return name;
	}

    //インスタントメソッド「setName」を設定
	public void setName(String name) {
		this.name = name;
	}

    //インスタントメソッド「getAge」の宣言
	public int getAge() {
		return age;
	}

    //インスタントメソッド「getAge」を設定
	public void setAge(int age) {
		this.age = age;
	}

    //プロフィールの表示
	public void showProfile(){
	//「名前は」+name+「です」を結合し表示
	System.out.println( "名前は、" + name + "です。" );
	//「年齢は」+age+「です」を結合し表示
	System.out.println( "年齢は、" + age + "です。" );
	}
}