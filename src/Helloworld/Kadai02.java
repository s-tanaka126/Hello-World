/*
 * [���K02]
 * �����^�̔z��unumbers�v��錾���āA{10,4,340,180,79}�������Ă��������B
 * �܂��A�z��̒�����ő�l���R���\�[���ɕ\������v���O�������쐬���Ă��������B
 */


package Helloworld;

public class Kadai02 {

	public static void main(String[] ags) {
 
		//�ϐ�numbers�̔z���錾����
		int numbers[] = {10,4,340,180,79};
		
		//�z��̍ő�l��0�̏ꍇ�����邽�߁A�z��̗v�f��1�Ԗڂŏ���������
        int max = numbers[0];
        
        //index��1�Ԗڂ���Ƃ��Anumbers�̍ő�l�܂łƂ���
        for(int index = 1 ;  index < numbers.length; index++){
        	
        	//Max�ɑ������Ă���l�Ɣz��̗v�f���r����
            if(max < numbers[index]){
            	
            	//�z��̗v�f�̂ق����傫���ꍇ�l���㏑������
                max = numbers[index];
                }
            }
        
            //�㏑�����ꂽ�ő�l���o�͂���A���̍ۂɕ�����́u�ő�l�́v�Ɓu�ł��v��+����
            System.out.println("�ő�l��" +max +"�ł�");
        }
    } 