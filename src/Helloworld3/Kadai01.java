/*
 * [���K01]���l�̓��͂��󂯕t���A���͂��ꂽ���l�̐������A�|���Z�̕\���R���\�[���ɏo�͂��Ă��������B
	�@�@�@�@�@�@�Ⴆ�΁A15�Ɠ��͂��ꂽ��A 1�~1�`15�~15�܂ł̊|���Z�̕\���o�͂��Ă��������B
 */

package Helloworld3;
import java.util.Scanner;

public class Kadai01 {

	public static void main(String[] args) {

		// Scanner�N���X�̃C���X�^���g���쐬���A������W�����͂�System.in���w�肷
		Scanner scanner = new Scanner(System.in);
		
		// �R���\�[���Ɂu��������͂��Ă�������)�v��\������
		System.out.println("��������͂��Ă�������");

		// ���͂��ꂽ���e���ׂĂ�new Scanner (System.in)����擾����
		int num = scanner.nextInt();
		
		int valLen = String.valueOf( num * num ).length() + 1; 
		
		//num_left�̏����l��1�Ƃ��A�ő�l��num�Ƃ���
		for(int num_left = 1; num_left <= num ; num_left++) {
			
			//num_right�̏����l��1�Ƃ��A�ő�l��num�Ƃ���
			for(int num_right = 1; num_right <= num; num_right++) {
				
				int num_kuku = num_left * num_right;
	
				System.out.printf("%" + valLen + "d", num_kuku);		
			
			}
			//�R���\�[���ɕ\�������l�����s����
			System.out.println();
		}
		// Scanner�N���X�̃C���X�^���X���N���[�Y����
		scanner.close();
   }

}
