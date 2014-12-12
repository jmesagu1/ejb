package com;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyEJB
 */
@Stateless(mappedName = "MyEJB")
@RolesAllowed("1")
 public class MyEJB implements MyEJBLocal {

    /**
     * Default constructor. 
     */
	
	
	@EJB
	MyEJB2Local local;
	
	
	@EJB(mappedName = "ejb/s1")
	ISingleton s1;
//	
	@EJB(mappedName  = "ejb/s1")
	ISingleton s2;
	
	@Resource
	SessionContext sessionContext;
	
    public MyEJB() {
        // TODO Auto-generated constructor stub
    }

	@Override
	@PermitAll
	public void sayHello() {
		try {
			
			local.hello();		
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println( "RollBack: " + sessionContext.getRollbackOnly());
		
	}

}
