package com;

import javax.ejb.Local;
import javax.ejb.Remote;

@Local
@Remote
public interface MyStateFulLocal {

	void sayHello();
	void sayHello2();
	MyStateFulLocal getRef();
}
