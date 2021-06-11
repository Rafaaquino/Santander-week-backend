package com.project.bootcamp.exceptions;

import com.project.bootcamp.utils.MessageUtils;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotFoundException(String message) {
		super(MessageUtils.NOT_FOUND_MESSAGE);
	}

}
