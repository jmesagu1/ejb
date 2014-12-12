package com;

import javax.ejb.ApplicationException;


@ApplicationException(rollback = true)
public class MyEx extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
}
