package org.howard.edu.lsp.finalExam;

import java.util.*;
import java.util.Map.Entry;

public class MapUtilities {

	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2)
			throws NullMapException {
		int count = 0;
		map1.put("1", "2");
		map1.put("Z", "O");
		map2.put("Z", "O");
		
		//If size of hashmaps are 0 or less, return count (0)
		if (map1.size() <= 0 || map2.size() <= 0) {
			return count;

		}
		//If 1 or both null, throw exception 
		if (map1 == null || map2 == null) {
			throw new NullMapException();
		}
		
//		L
		//[1 =2,Z = O] - Go through map1 and make a list of 
		//Key value pairs
		for (HashMap.Entry<String, String> list : map1.entrySet()) {
			 //If map2 has a key from the list
			if (map2.containsKey(list.getKey())) {
				//if values are equal, add 1 to count
				if (map2.containsValue(list.getValue())) {
					count += 1;
				}
			}
			
			}

		
		return count;

	}
	// TODO Auto-generated method stub

}
