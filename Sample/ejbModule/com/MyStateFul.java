package com;

import java.rmi.RemoteException;

import javax.annotation.Resource;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJBException;
import javax.ejb.SessionContext;
import javax.ejb.SessionSynchronization;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class MyStateFul
 */
@Stateful(name = "MyStateFul")
//@DeclareRoles({"Uno", "Dos"})
public class MyStateFul implements MyStateFulLocal, SessionSynchronization 
{

	
	@Resource
	SessionContext session;
	
    /**
     * Default constructor. 
     */
    public MyStateFul() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void sayHello() {

		//throw new MyEx();
	}

	@Override
	@RolesAllowed ({"Uno", "Dos"})
	public void sayHello2() {
		System.out.println(session.isCallerInRole("Uno"));
		System.out.println(session.getCallerPrincipal().getName());
	}

	@Override
	public void afterBegin() throws EJBException, RemoteException {
		System.out.println("After Begin");
		
	}

	@Override
	public void afterCompletion(boolean committed) throws EJBException, RemoteException {
		System.out.println("After Completion: " + committed );
		
	}

	@Override
	public void beforeCompletion() throws EJBException, RemoteException {
		System.out.println("Before Completion");
	}

}
