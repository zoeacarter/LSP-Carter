package org.howard.edu.lsp.finalExam;

import java.util.*;
import java.util.Map.Entry;

public class MapUtilities {

	public static int commonKeyValuePairs(
			HashMap<String, String>map1,
			HashMap<String,String> map2) throws NullMapException{
		int count = 0;
		map1.put("1","2");
		map1.put("Z","O");
		map2.put("Z", "O");
		
		
	
		if (map1.size()<= 0 || map2.size()<=0) {
			return 0;
			
		}
		if (map1.containsKey(map2)) {
			for (HashMap.Entry<String,String>set:map1.entrySet()) {
				System.out.print(set.getKey()+ "=" + set.getValue());
			}
			//if a key in map1 is in map2
			//look for value, if they are the same
			// add count +1, if not add 0 
		}
		return count;
		
	}
		// TODO Auto-generated method stub

	

}
