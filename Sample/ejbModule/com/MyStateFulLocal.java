package com;

import javax.ejb.Local;

@Local
public interface MyStateFulLocal {

	void sayHello();
	void sayHello2();
}
