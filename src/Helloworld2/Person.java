/*
 * [���K01]�ȉ���Person�N���X��ύX���Ă��������B
           �@ Person�N���X�ɔN���ێ����郁���o�ϐ�age�ƁA�N���ݒ肷�郁�\�b�hsetAge���
                             ������B
           �A showProfile���\�b�h�𖼑O�ƔN���\������悤�ɕύX����B
           �B Main�N���X��Person�N���X�̃C���X�^���X���쐬����B
                              ���R���X�g���N�^�͎g�p���Ȃ��B
           �C ���O�ɁuTaro Yamada�v�A�N��Ɂu47�v��ݒ肷��B
           �D �v���t�B�[����\������B
 */


package Helloworld2;

public class Person {
	
	//�C���X�^���g�ϐ��uname�v��錾
	private String name;
	//�C���X�^���g�ϐ��uage�v��錾
	private int age;

	//�C���X�^���g���\�b�h�ugetName�v�̐錾
	public String getName() {
		return name;
	}

    //�C���X�^���g���\�b�h�usetName�v��ݒ�
	public void setName(String name) {
		this.name = name;
	}

    //�C���X�^���g���\�b�h�ugetAge�v�̐錾
	public int getAge() {
		return age;
	}

    //�C���X�^���g���\�b�h�ugetAge�v��ݒ�
	public void setAge(int age) {
		this.age = age;
	}

    //�v���t�B�[���̕\��
	public void showProfile(){
	//�u���O�́v+name+�u�ł��v���������\��
	System.out.println( "���O�́A" + name + "�ł��B" );
	//�u�N��́v+age+�u�ł��v���������\��
	System.out.println( "�N��́A" + age + "�ł��B" );
	}
}