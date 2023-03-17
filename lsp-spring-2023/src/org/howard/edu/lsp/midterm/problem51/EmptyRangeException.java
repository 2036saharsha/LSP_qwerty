package org.howard.edu.lsp.midterm.problem51;

public class EmptyRangeException extends Exception {

	/**
	 * @throws Exception when the set is empty
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Exception when the set is empty
	 */
	public EmptyRangeException(String e) {
		super(e);
	}
	}