/*[�ۑ�02] [�ۑ�01]��Person�N���X���g�p���āA���̃v���O�������쐬���Ă��������B
           �@Person�N���X���p�������AShain�N���X�̍쐬�B
           �AShain�N���X�ɁA��Ж���ێ�����ϐ��ucompanyName�v�ƁA��Ж���ݒ肷�郁�\�b�h�usetCompanyName�v��ǉ��B
           �BShain�N���X�̃C���X�^���X��2�쐬����B(�C���X�^���X������l�͊e�����߂Ă��������B�j
           �C���ꂼ��̃v���t�B�[����\������B
                              �����O�A�N��A��Ж�*/

package Helloworld2;
//Person�N���X���p�����Ă���
public class Shain extends Person {

	//�C���X�^���X�ϐ��ucompanyName�v��錾
	private String companyName;

	//�C���X�^���X���\�b�h�ugetCompanyName�v�̐錾
	public String getCompanyName() {
		return companyName;
	}

	//�C���X�^���X���\�b�h�ugetCompanyName�v�̐ݒ�
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//�p������Person�N���X�̃��\�b�h�ƁuCompanyName�v���v���t�B�[���Ƃ��ĕ\������
	@Override
	public void showProfile() {
		
		super.showProfile();
	
		System.out.println("��Ж���" + companyName + "�ł��B");
				
	}
}
