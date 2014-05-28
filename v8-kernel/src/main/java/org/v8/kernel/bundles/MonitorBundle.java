package org.v8.kernel.bundles;

import org.v8.kernel.jmx.observer.Observer;


public class MonitorBundle implements Bundle{

	//@Inject
	Observer<?> ob;
	
	@Override
	public void setObserver(Observer<?> ob) {
		// TODO Auto-generated method stub
		this.ob = ob;
	}


	
}
