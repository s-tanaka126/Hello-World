/*
 * [���K05]���K04�̃v���O�����������āA����\�����������͂��āA���̌��̓�����\������
 * �v���O�������쐬���Ă��������B
 * 2���͈ꗥ28���Ƃ��܂��B
 * �܂��A1~12�ȊO�����͂��ꂽ�ꍇ�ɂ́A�h���͂��Ԉ���Ă��܂��B�h�ƕ\�����Ă��������B
 */

package Helloworld;

import java.util.Scanner;

public class Kadai05 {

	public static void main(String[] args) {

		// Scanner�N���X�̃C���X�^���g���쐬���A������W�����͂�System.in���w�肷��
		Scanner scanner = new Scanner(System.in);

		// �R���\�[���Ɂu���������͂��Ă��������B(Enter�L�[�ŏI��)�v��\������
		System.out.println("����1�`12�œ��͂��Ă��������B(Enter�L�[�ŏI��)");

		// ���͂��ꂽ���e���ׂĂ�new Scanner (System.in)����擾����
		String month = scanner.nextLine();

		//month�̏�������̎�
		switch (month) {
		//������̂���""�ň͂��A1,3,5,7,8,10,12�������̒l
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			//�������ꂽ������"���́A" + 31 + "���ł��B"���������\������
			System.out.println(month + "���́A" + 31 + "���ł��B");

			//�����̏I��
			break;

		//������̂���""�ň͂��A2�������̒l		
		case "2":
			//�������ꂽ������"���́A" + 28 + "���ł��B"���������\������
			System.out.println(month + "���́A" + 28 + "���ł��B");

			//�����̏I��
			break;
			
		//������̂���""�ň͂��A4,6,9,11�������̒l			
		case "4":
		case "6":
		case "9":
		case "11":
			//�������ꂽ������"���́A" + 30 + "���ł��B"���������\������
			System.out.println(month + "���́A" + 30 + "���ł��B");
			
			//�����̏I��
			break;

		//1�`12�ł͂Ȃ��l
		default:
			//1�`12�ł͂Ȃ��l�Ȃ�����"���͂��Ԉ���Ă��܂��B"�ƕ\������
			System.out.println("���͂��Ԉ���Ă��܂��B");

			//�����̏I��
			break;

		}
		// Scanner�N���X�̃C���X�^���X���N���[�Y����
		scanner.close();
	}

}
