package Helloworld;

import java.util.Scanner;

public class Kadai06 {

	public static void main(String[] args) {

		// Scanner�N���X�̃C���X�^���g���쐬���A������W�����͂�System.in���w�肷��
		Scanner scanner = new Scanner(System.in);

		// �R���\�[���Ɂu���������͂��Ă��������B(Enter�L�[�ŏI��)�v��\������
		System.out.println("����1�`12�œ��͂��Ă��������B(Enter�L�[�ŏI��)");
		
		int month = 1 ;


		//month�̏�������̎�
		while (month < 13) {
			// ���͂��ꂽ���e���ׂĂ�new Scanner (System.in)����擾����
			month = scanner.nextInt();

		//�������ꂽ������"���́A" + 31 + "���ł��B"���������\������
		System.out.println(month + "���́A" + 31 + "���ł��B");		

		break;
		
		}
		
		System.out.println("���͂��Ԉ���Ă��܂��B�ē��͂��Ă�������");
		

		// Scanner�N���X�̃C���X�^���X���N���[�Y����
		scanner.close();


	}
		


}