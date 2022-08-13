package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidateException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>();
	
	public ValidateException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors() {
		return this.errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		this.errors.put(fieldName, errorMessage);
	}
	
}
