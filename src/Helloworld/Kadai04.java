/*
 * [���K04]�L�[�{�[�h����ǂݍ��񂾕�������o�͂���v���O�������쐬���Ă��������B
 *        ���͂ɂ͂���������܂����AScanner�𗘗p���Ă��������B
 */

package Helloworld;

import java.util.Scanner;

public class Kadai04 {

	public static void main(String[] args) {

		// Scanner�N���X�̃C���X�^���g���쐬���A������W�����͂�System.in���w�肷��
		Scanner scanner = new Scanner(System.in);

		// �R���\�[���Ɂu���������͂��Ă��������B(Enter�L�[�ŏI��)�v��\������
		System.out.println("���������͂��Ă��������B(Enter�L�[�ŏI��)");

		// ���͂��ꂽ���e��new Scanner (System.in)����擾����
		String inport_text = scanner.nextLine();

		// ���͂��ꂽ���e�� �{ �u���͂���܂����v�ƌ������A�R���\�[���ɕ\������
		System.out.println(inport_text + "�Ɠ��͂���܂���");

		// Scanner�N���X�̃C���X�^���X���N���[�Y����
		scanner.close();

	}

}
