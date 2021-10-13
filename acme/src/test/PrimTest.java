package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pass.Prim;

class PrimTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	
	/*
	 * ���� ����
�־��� ���� �� 3���� ���� ������ �� �Ҽ��� �Ǵ� ����� ������ ���Ϸ��� �մϴ�. ���ڵ��� ����ִ� �迭 nums�� �Ű������� �־��� ��, nums�� �ִ� ���ڵ� �� ���� �ٸ� 3���� ��� ������ �� �Ҽ��� �Ǵ� ����� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
nums�� ����ִ� ������ ������ 3�� �̻� 50�� �����Դϴ�.
nums�� �� ���Ҵ� 1 �̻� 1,000 ������ �ڿ����̸�, �ߺ��� ���ڰ� ������� �ʽ��ϴ�.
����� ��
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4
����� �� ����
����� �� #1
[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.

����� �� #2
[1,2,4]�� �̿��ؼ� 7�� ���� �� �ֽ��ϴ�.
[1,4,6]�� �̿��ؼ� 11�� ���� �� �ֽ��ϴ�.
[2,4,7]�� �̿��ؼ� 13�� ���� �� �ֽ��ϴ�.
[4,6,7]�� �̿��ؼ� 17�� ���� �� �ֽ��ϴ�.
	 */

	@Test
	void test() {
		Prim prim = new Prim();
		
		assertEquals(1, prim.solution(new int[]{1,2,3,4}));
		assertEquals(4, prim.solution(new int[]{1,2,7,6,4}));
	}

}
