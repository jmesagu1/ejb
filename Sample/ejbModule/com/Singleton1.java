package com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton (mappedName = "ejb/s1")
@Startup
public class Singleton1 implements ISingleton{

	private int count = 0;
	
	@Override
	
	public void hi() {
	
		System.out.println("Count: " + count ++);
	}
	
	@PostConstruct
	public void pos()
	{
		System.out.println(3);
	}
	
	@PreDestroy
	public void pre()
	{
		System.out.println(this);
		System.out.println("Pre:" + count);
	}

}
