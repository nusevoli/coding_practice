package fail_pass;

public class Dictionary {
	
	// TODO: 공부해 볼것.
//	public int solution(String word) {
//        int answer = 0, per = 3905;
//        for(String s : word.split("")) answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
//        return answer;
//    }
	
	
	private final static int LIMIT = 5;
	
	String[] pattern = { "A", "E", "I", "O", "U" };
	int pos_ = 0;
	
	public int solution(String word) {
		pos_ = 0;
		
		int len = pattern.length;
		
		for(int i=0; i<len; i++)
		{
			if(dfs(word, pattern[i], 1, LIMIT))
			{
				break;
			}
		}
		
		return pos_;
	}

	private boolean dfs(String word, String string, int length, int limit) {
		
		if(length > limit) return false;
		
		++pos_;
		
		if(string.equals(word))
		{
			return true;
		}
		
		int len = pattern.length;
		
		for(int j = 0; j<len; j++)
		{
			if(dfs(word, string + pattern[j], length+1, limit)) return true;
		}
		
		return false;
	}
}
