package br.com.leandrofa1980.desafiomv.services.exception;

public class OptionNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public OptionNotFoundException(String msg) {
		super(msg);
	}
}
