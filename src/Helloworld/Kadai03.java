/*
 * [���K03]�R���\�[���ɋ��̕\��\�����Ă��������B�\���͌��h���ǂ����𑵂��Ă��������B
 */

package Helloworld;

public class Kadai03 {

	public static void main(String[] args) {
		
		//left�̏����l��1�Ƃ��A�ő�l��9�܂łƂ���
		for(int left = 1; left <= 9; left++) {
			
			//right�̏����l��1�Ƃ��A�ő�l��9�܂łƂ���
			for(int right = 1; right <= 9; right++) {
			
				//left��right�̌v�Z���ꂽ�l��3���ŕ\������
				System.out.printf("%3d",left * right);
			}
			//�R���\�[���ɕ\�������l�����s����
			System.out.println();
		}
	}

}
