package com.rossini.cursomc.services.exceptions;

/* erro que não permite apagar uma classe
 * na qual outros objetos dependem dela*/
public class DataIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException (String msg) {
		super(msg);
	}
	
	public DataIntegrityException (String msg, Throwable cause) {
		super(msg, cause);
	}
	
	

}
