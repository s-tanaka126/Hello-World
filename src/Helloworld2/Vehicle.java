/*[�ۑ�04]	  �ۑ�03�ō쐬�����uVehicle�N���X�v�ɑ΂��āA���L���\�b�h��ǉ����Ă��������B*/

package Helloworld2;

public class Vehicle {

	//�C���X�^���X�ϐ��ucarName�v��錾
	String carName;
	//�C���X�^���X�ϐ��umaker�v��錾
	String maker;
	//�C���X�^���X�ϐ��upurchaseDate�v��錾
	private int purchaseDate;
	//�C���X�^���X�ϐ��ucoordinate�v��錾
	private int coordinate = 0;
	//�C���X�^���X�ϐ��uremainingfuel�v��錾
	private int remainingfuel = 100;
	
	//�󂯎���������Ń����o�ϐ�������������
	/*Vehicle(String carName,String maker,int purchaseDate,int coordinate,int remainingfuel){
		
		//�ucarName�v������������
		this.carName = carName;
		//�umaker�v������������
		this.maker = maker;
		//�upurchaseDate�v������������
		this.purchaseDate = purchaseDate;
		//�ucoordinate�v������������
		this.coordinate = coordinate;
		//�uremainingfuel�v������������
		this.remainingfuel = remainingfuel;
			
	}*/
	
	//�C���X�^���g���\�b�h�́ugetPurchaseDate�v��錾
	public int getPurchaseDate() {
		return purchaseDate;
	}

	//�C���X�^���g���\�b�h�́uPurchaseDate�v��ݒ�
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

	
	//�����o�ϐ����R���\�[���ɏo�͂��郁�\�b�h
	public void introduce() {
		System.out.println("��蕨����" + carName + "�ł��B");
		System.out.println("���[�J�[��" + maker + "�ł��B");
		System.out.println("�w������" + purchaseDate + "���ł��B");
		System.out.println("���݈ʒu��X���W��" + coordinate + "�ł��B");
		System.out.println("�c��R����" + remainingfuel + "�ł��B");
	}
}
