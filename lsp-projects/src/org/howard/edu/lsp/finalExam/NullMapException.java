package org.howard.edu.lsp.finalExam;

public class NullMapException extends Exception{
	if (map1==null || map2 == null){
		throw new NullMapException("One or both maps are null!");
		
	}

}
