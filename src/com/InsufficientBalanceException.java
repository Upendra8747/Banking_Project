package com;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	InsufficientBalanceException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}
/*  ------	RULES FOR CREATING USER DEFINED EXCEPTION --------
 * 
 * 
 * 1. CREATE A CLASS WITH EXCEPTION NAME.
 * 2. IF CLASS extends RuntimeException --> UNCHECKED EXCEPTION
 * 3. IF CLASS extends Exception --> CHECKED EXCEPTION
 * 4. OVERRIDE THE getMessage().  (Present in throwable class)
 * 5. INVOKE THE EXCEPTION OBJECT USING throw KEYWORD.
 * 6. HANDLE IT BY USING try AND catch BLOCKS.
 * 
 * 
 */
