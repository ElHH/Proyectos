package com.aeromexico.world.capacitacion.exceptions;

public class UnableBook extends AssertionError {

	
	private static final String UNABLE_GET_BOOKS = "Unable get books";
	public static String getUnableBookMessage() {
		return UNABLE_GET_BOOKS;
	}
	

	public UnableBook(String mensage, Throwable causa) {
		super(mensage, causa);
	}
}
