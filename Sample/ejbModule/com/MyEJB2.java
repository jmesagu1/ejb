package com;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyEJB2
 */
@Stateless(mappedName = "ejb/2")
public class MyEJB2 implements MyEJB2Local {

    /**
     * Default constructor. 
     */
    public MyEJB2() {
        // TODO Auto-generated constructor stub
    }

	@Override
	//@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void hello() {
		// TODO Auto-generated method stub
		
		System.out.println(2);
		
		MyEx my = new MyEx();
		throw my;
	}

}
