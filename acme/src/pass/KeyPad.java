package pass;

public class KeyPad {
	private static final int FOCED_LEFT = 1;
	private static final int FORCED_RIGHT = 0;

	/**
	 * 2020 īī�� ���Ͻ�
Ű�е� ������

�� ��ȭ Ű�е忡�� �޼հ� �������� �����հ������� �̿��ؼ� ���ڸ��� �Է��Ϸ��� �մϴ�.
�� ó�� �޼� �����հ����� * Ű�е忡 ������ �����հ����� # Ű�е� ��ġ���� �����ϸ�, �����հ����� ����ϴ� ��Ģ�� ������ �����ϴ�.

�����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.
������� ���� ��ȣ�� ��� �迭 numbers, �޼��������� ������������ ���� ��Ÿ���� ���ڿ� hand�� �Ű������� �־��� ��, �� ��ȣ�� ���� �����հ����� �޼��� �� �������� ���� ��Ÿ���� ���ӵ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.


numbers	hand	result
[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"	"LRLLRRLLLRR"
[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]	"right"	"LLRLLRLLRL"
	 */

	
	public String solution(int[] numbers, String hand) {
		System.out.println(hand);
        StringBuilder builder = new StringBuilder();
        
        int lYPos = 4;
        int lXPos = 1;
        int rYPos = 4;
        int rXPos = 1;
        boolean preferedR = hand.equals("right");
        
        for(int no : numbers) {
//        	System.out.println("S" + no + " " + lXPos + " " + rXPos);
        	int noPos = (no == 0) ? 4 : no / 3 +1;
    		int distL = dist(lYPos, noPos, lXPos);
    		int distR = dist(rYPos, noPos, rXPos);
    		boolean shouldPressR = false;
    		
    		System.out.print(lYPos + " " + lXPos +  "|" + rYPos + " " + rXPos + "[" + no + "]" + distL + " " + distR);
        	
        	switch((no == 0) ? 2 : no % 3) {
        	case FORCED_RIGHT:
        		shouldPressR = true;
        		rYPos = no / 3;
        		rXPos = 1;
        		break;
        		
        	case FOCED_LEFT:
        		shouldPressR = false;
        		lYPos = no / 3 + 1;
        		lXPos = 1;
        		break;
        		
        	default:
        		// right
        		if(distL < distR)
        		{
        			shouldPressR = false;
        			lYPos = noPos;
        			lXPos = 0;
        		}
        		// left
        		else if(distL > distR)
        		{
        			shouldPressR = true;
        			rYPos = noPos;
        			rXPos = 0;
        		}
        		// right
        		else if(distL == distR && preferedR)
        		{
        			shouldPressR = true;
        			rYPos = noPos;
        			rXPos = 0;
        		}
        		// left
        		else
        		{
        			shouldPressR = false;
        			lYPos = noPos;
        			lXPos = 0;
        		}
        	}
        	
        	System.out.println("->" + ((shouldPressR) ? "R" : "L"));
        	builder.append((shouldPressR) ? "R" : "L");
        }
        
        System.out.println("****************");
        return builder.toString();
    }
	
	int dist(int a, int b, int c) {
		return Math.abs(a - b) + c;
	}
}
