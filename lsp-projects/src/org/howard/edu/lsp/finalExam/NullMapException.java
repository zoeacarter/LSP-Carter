package org.howard.edu.lsp.finalExam;

public class NullMapException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NullMapException() {}
	public NullMapException(String message) {
		super("One or both maps are null!");
	}
	

}
