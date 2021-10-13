package pass;

import java.util.ArrayList;
import java.util.HashMap;

public class NonCompletedParticipant {

	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> all = new HashMap<String, Integer>();
        
        for(String p : participant)
        {
        	int count = 0;
        	
        	if(all.containsKey(p))
        	{
        		count = all.get(p);
        	}
        	all.put(p, ++count);
        }
        
        for(String completedParticipant : completion)
        {
        	if(all.containsKey(completedParticipant))
        	{
        		int count = all.get(completedParticipant);
        				
        		if(count == 1) {
        			all.remove(completedParticipant);
        		}
        		else
        		{
        			all.put(completedParticipant, --count);
        		}	
        	}
        }
        
        return all.keySet().iterator().next();
    }
	
	
	// time-over
	public String solution1(String[] participant, String[] completion) {
		ArrayList<String> all = new ArrayList<String>();
        
        for(String p : participant)
        {
        	all.add(p);
        }
        
        for(String completedParticipant : completion)
        {
        	all.remove(completedParticipant);
        }
        
        return all.get(0);
    }
}
