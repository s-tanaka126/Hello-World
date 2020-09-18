package Helloworld2;

public class MakeVehicle {

	public static void main(String[] args) {
		//mycarをインスタント化
		//Vehicle myCar = new Vehicle("カローラ","トヨタ",1,0,100);
		//乗り物名、メーカー、購入日、現在位置のX座標、残り燃料をコンソールに出力する
		
		//mycarをインスタント化
		Vehicle myCar = new Vehicle();
		//購入日を表示させる。
		myCar.setPurchaseDate(1);
		//座標を表示させる。
		myCar.setCoordinate(10);
		//残り燃料を表示させる。
		myCar.setRemainingfuel(90);
		myCar.introduce();
	}
}
