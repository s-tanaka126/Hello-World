/*[課題04]	  課題03で作成した「Vehicleクラス」に対して、下記メソッドを追加してください。*/

package Helloworld2;

public class Vehicle {

	//インスタンス変数「carName」を宣言
	String carName;
	//インスタンス変数「maker」を宣言
	String maker;
	//インスタンス変数「purchaseDate」を宣言
	private int purchaseDate;
	//インスタンス変数「coordinate」を宣言
	private int coordinate = 0;
	//インスタンス変数「remainingfuel」を宣言
	private int remainingfuel = 100;
	
	//受け取った引数でメンバ変数を初期化する
	/*Vehicle(String carName,String maker,int purchaseDate,int coordinate,int remainingfuel){
		
		//「carName」を初期化する
		this.carName = carName;
		//「maker」を初期化する
		this.maker = maker;
		//「purchaseDate」を初期化する
		this.purchaseDate = purchaseDate;
		//「coordinate」を初期化する
		this.coordinate = coordinate;
		//「remainingfuel」を初期化する
		this.remainingfuel = remainingfuel;
			
	}*/
	
	//インスタントメソッドの「getPurchaseDate」を宣言
	public int getPurchaseDate() {
		return purchaseDate;
	}

	//インスタントメソッドの「PurchaseDate」を設定
	public void setPurchaseDate(int purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(int coordinate) {
		this.coordinate = coordinate;
	}

	public int getRemainingfuel() {
		return remainingfuel;
	}

	public void setRemainingfuel(int remainingfuel) {
		this.remainingfuel = remainingfuel;
	}
	
	public void run(int remainingfuel) {
		this.coordinate -= remainingfuel;
		this.coordinate += coordinate;
	}

	
	//メンバ変数をコンソールに出力するメソッド
	public void introduce() {
		System.out.println("乗り物名は" + carName + "です。");
		System.out.println("メーカーは" + maker + "です。");
		System.out.println("購入日は" + purchaseDate + "日です。");
		System.out.println("現在位置のX座標は" + coordinate + "です。");
		System.out.println("残り燃料は" + remainingfuel + "です。");
	}
}
