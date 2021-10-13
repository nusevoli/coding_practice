package pass;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MutualEvaluation {
	
	private static final int SELF = 0;
	private static final int NORMAL = 1;
	
	public String solution(int[][] scores) {
		
		int len = scores.length;
		double[] avg = new double[len];
		
		StringBuilder builder = new StringBuilder();
		
		for(int j = 0; j<len; j++)
		{
			int best = 0;
			int bestStatus = NORMAL;
			int worst = 101;
			int worstStatus = NORMAL;
			
			int total = 0;
			
			for(int i = 0; i<len; i++)
			{
				total += scores[i][j];
				
				// find best
				{
					if(scores[i][j] > best)
					{
						best = scores[i][j];
						
						if(i == j)
						{
							bestStatus = SELF;
						}
						else
						{
							bestStatus = NORMAL;
						}
					}
					else if(bestStatus == SELF && scores[i][j] == best)
					{
						bestStatus = NORMAL;
					}
				}
				
				// find worst
				{
					if(scores[i][j] < worst)
					{
						worst = scores[i][j];
						
						if(i == j)
						{
							worstStatus = SELF;
						}
						else
						{
							worstStatus = NORMAL;
						}
					}
					else if(worstStatus == SELF && scores[i][j] == worst)
					{
						worstStatus = NORMAL;
					}
				}
			}
			
			if(bestStatus == SELF)
			{
				total -= best;
			}
			
			if(worstStatus == SELF)
			{
				total -= worst;
			}
			
			avg[j] = (double)total / ((bestStatus == SELF || worstStatus == SELF) ? len - 1 : len);
		}
		
//		System.out.println(Arrays.stream(avg).boxed().collect(Collectors.toList()));

		for(int i=0; i<len; i++)
		{
			switch ((int) avg[i] / 10) {
			case 9:
				builder.append("A");
				break;
			case 8:
				builder.append("B");
				break;
			case 7:
				builder.append("C");
				break;
			case 6:
			case 5:
				builder.append("D");
				break;
			default:
				builder.append("F");
			}
		}

        return builder.toString();
    }
}
