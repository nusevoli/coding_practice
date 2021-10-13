package pass;

import java.util.ArrayList;

public class Prim {
	
	
	
	public int solution(int[] nums) {
        
		ArrayList<Integer> list = getPrims();
		
		int answer = 0;

		for(int i=0; i<nums.length; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(i == j) continue;
				
				for(int k=j+1; k<nums.length; k++)
				{
					if(j == k) continue;
					if(i == k) continue;
					
					int sum = nums[i] + nums[j] + nums[k];
					
					if(list.contains(sum))
					{
						System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
						answer++;
					}
				}
			}
		}

		System.out.println("#################");
        return answer;
    }
	
	public ArrayList<Integer> getPrims() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=7; i<3000; i++)
		{
			if(isPrimNo(i))
			{
				list.add(i);
			}
		}
		
		return list;
	}
	
	public boolean isPrimNo(int n)
	{
		for(int i=2; i<n; i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
