package pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GiveUpMath {

	public int[] solution(int[] answers) {
		
		int[] pattern1 = {1, 2, 3, 4, 5};
		int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		List<Integer> p1 = Arrays.stream(pattern1).boxed().collect(Collectors.toList());
		List<Integer> p2 = Arrays.stream(pattern2).boxed().collect(Collectors.toList());
		List<Integer> p3 = Arrays.stream(pattern3).boxed().collect(Collectors.toList());
	
		int loopCount = answers.length / pattern1.length + 1;
		
		ArrayList<Integer> ans1 = new ArrayList<Integer>();
		ArrayList<Integer> ans2 = new ArrayList<Integer>();
		ArrayList<Integer> ans3 = new ArrayList<Integer>();
		
		// fill answers
		for(int i=0; i<loopCount; i++)
		{
			ans1.addAll(p1);
			ans2.addAll(p2);
			ans3.addAll(p3);
		}
		
		int[] solvedCount = new int[3];
		
		for(int i = 0; i<answers.length; i++)
		{
			if(answers[i] == ans1.get(i))
			{
				solvedCount[0]++;
			}
			
			if(answers[i] == ans2.get(i))
			{
				solvedCount[1]++;
			}
			
			if(answers[i] == ans3.get(i))
			{
				solvedCount[2]++;
			}
		}
//		System.out.println(Arrays.stream(solvedCount).boxed().collect(Collectors.toList()));
		
		int maxSolvedCount = 0;
		
		for(int i=0; i<solvedCount.length; i++)
		{
			if(maxSolvedCount < solvedCount[i])
			{
				maxSolvedCount = solvedCount[i];
			}
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<solvedCount.length; i++)
		{
			if(solvedCount[i] == maxSolvedCount)
			{
				result.add(i + 1);
			}
		}
		
		Collections.sort(result);
		
		int[] arr = new int[result.size()];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = result.get(i);
		}
		
//		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		return arr;
    }
}
