// ������ ����

package Chapter03;

public class ScopeEx {	 // Ŭ���� ��
	
	int no; 	// Ŭ���� �� ������ ��� ������ ����
	
	public static void main(String[] args) { 	// main �޼��� ��
		
		String name; 		// main �޼��� �� ������ ��� ������ ����
		
		if(true) {
			name = "ȫ�浿";
			
			String email = "hong@test.com";
		}
		email  = "hong@test.com"	// if�� �ۿ��� email ������ ����ϸ� ���� �߻�
	}

}
