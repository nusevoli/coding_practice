package fail;

public class NewId {

	/*
	 * 
2021 KAKAO BLIND RECRUITMENT
�ű� ���̵� ��õ

1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewId newId = new NewId();
		System.out.println(newId.solution("0123ABCDabcd!@#$%^&*()_.?/"));
	}

	
	/**
	 * no	new_id	result
��1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
��2	"z-+.^."	"z--"
��3	"=.="	"aaa"
��4	"123_.def"	"123_.def"
��5	"abcdefghijklmn.p"	"abcdefghijklmn"
	 * 
	 * @param args
	 */
	public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        answer.replaceAll("^[0-9a-z-_.]", "");
        return answer;
    }
}