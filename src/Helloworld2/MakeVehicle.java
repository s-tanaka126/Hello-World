package Helloworld2;

public class MakeVehicle {

	public static void main(String[] args) {
		//mycar���C���X�^���g��
		//Vehicle myCar = new Vehicle("�J���[��","�g���^",1,0,100);
		//��蕨���A���[�J�[�A�w�����A���݈ʒu��X���W�A�c��R�����R���\�[���ɏo�͂���
		
		//mycar���C���X�^���g��
		Vehicle myCar = new Vehicle();
		//�w������\��������B
		myCar.setPurchaseDate(1);
		//���W��\��������B
		myCar.setCoordinate(10);
		//�c��R����\��������B
		myCar.setRemainingfuel(90);
		myCar.introduce();
	}
}
