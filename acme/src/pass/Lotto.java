package pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] result = lotto.solution(lottos, win_nums);
		System.out.println(result[0] + " " + result[1]);
	}

	/**
	 * 
	 * lottos	win_nums	result
[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
	 * 
	 * 
	 * 
	 * @param lottos : 로또 입력값, 0은 알아볼 수 없는 번호
	 * @param win_nums : 로또 당첨번호
	 * @return 최고등수, 최저등수
	 */
	public int[] solution(int[] lottos, int[] win_nums) {
		
		List<Integer> lottos_ = new ArrayList<Integer>();
		
		for(int i=0; i<lottos.length; i++)
		{
			if(lottos[i] != 0)
			{
				lottos_.add(lottos[i]);
			}
		}

		int winCount = 0;
		List<Integer> winNums = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

		for(int lotto : lottos)
		{
			if(winNums.contains(lotto))	
			{
				winCount++;
			}
		}
		
		int worst = (winCount == 0) ? 6 : 7 - winCount;
		int best = worst - (6 - lottos_.size());
		best = (best == 0) ? 1 : best;
		
        int[] answer = {best, worst};
        return answer;
    }
}
