package pass;

import java.util.Arrays;
import java.util.stream.Collectors;

public class K_Num {
	public int[] solution(int[] array, int[][] commands) {
		
		int length = commands.length;
		int[] result = new int[length];
		
		for(int i=0; i<length; i++)
		{
//			System.out.println(Arrays.stream(array).boxed().collect(Collectors.toList()));
//			System.out.println(Arrays.stream(commands[i]).boxed().collect(Collectors.toList()));
			
			int s = commands[i][0] -1;
			int e = commands[i][1];
			int p = commands[i][2] -1;
			
			int[] newArr = Arrays.copyOfRange(array, s, e);
			Arrays.sort(newArr);
//			System.out.println(">" + Arrays.stream(newArr).boxed().collect(Collectors.toList()));
			
			result[i] = newArr[p];
		}
		
        return result;
    }
}
