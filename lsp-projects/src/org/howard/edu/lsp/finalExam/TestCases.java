package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import org.howard.edu.lsp.finalExam.*;
class TestCases {

	@Test
	
	void commonKeyValuePairs() throws NullMapException{
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "2");
		map1.put("Z", "O");
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Um", "Chile");
		map2.put("1", "2");
		
		//assertEquals(2,commonKeyValuePairs(map1, map2));
		
	}
		
	}


