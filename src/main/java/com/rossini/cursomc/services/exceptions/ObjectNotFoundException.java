package com.rossini.cursomc.services.exceptions;


/* erro ao procurar um objeto que não existe */
public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException (String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException (String msg, Throwable cause) {
		super(msg, cause);
	}

}
