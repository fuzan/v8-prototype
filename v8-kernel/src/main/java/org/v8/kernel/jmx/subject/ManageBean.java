package org.v8.kernel.jmx.subject;

import org.v8.kernel.bean.POJO;
import org.v8.kernel.bundles.Bundle;
import org.v8.kernel.jmx.observer.Observer;

public abstract class ManageBean {

	Observer<POJO<?>> obBean;
	Observer<Bundle> obBundle;
	POJO<?> bean;
	Bundle bundle;
	
	/**
	 *  check all methods dyna by reflection 
	 */
	public void run(){
		obBean.notifyChangeBefore(bean);
		obBundle.notifyChangeBefore(bundle);
		
		beanService();
		
		obBean.notifyChangeAfter(bean);
		obBundle.notifyChangeAfter(bundle);
		
	}
	
	public abstract void beanService();
	
}


