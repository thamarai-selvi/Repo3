package com.bean.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee, InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
System.out.println("Perform tasks while destroying of bean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Perform tasks while initialising of bean");

	}

	@Override
	public void job() {
		// TODO Auto-generated method stub
System.out.println("Employee do their own ");
	}

}
