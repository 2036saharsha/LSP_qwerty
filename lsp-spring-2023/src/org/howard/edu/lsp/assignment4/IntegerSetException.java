package org.howard.edu.lsp.assignment4;

/**
 * 
 * @author saharsha
 * Custom Exception, IntegerSetException to throw error if the largest and smallest methods are called when set in empty.
 */
public class IntegerSetException extends Exception {

	/**
	 * @throws Exception when the set is empty
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Exception when the set is empty
	 */
	public IntegerSetException(String e) {
		super(e);
	}
	}