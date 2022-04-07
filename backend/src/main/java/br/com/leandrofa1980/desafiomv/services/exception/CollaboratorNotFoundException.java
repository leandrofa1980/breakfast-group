package br.com.leandrofa1980.desafiomv.services.exception;

public class CollaboratorNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public CollaboratorNotFoundException(String msg) {
		super(msg);
	}
}
