package org.v8.kernel.impl;

import org.v8.kernel.Kernel;
import org.v8.kernel.bean.POJO;
import org.v8.kernel.behavior.Behavior;
import org.v8.kernel.bundles.Bundle;

public class KernelImpl extends Kernel{

	@Override
	public boolean registerBundle(Bundle bundle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unregisterBundle(Bundle bundle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkSecurity(Behavior behavior) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setUpBehavior(Bundle bundle, POJO<?> bean, Behavior behavior) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void execute(Behavior behavior) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean registerResources(POJO<?> bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unregisterResources(POJO<?> bean) {
		// TODO Auto-generated method stub
		return false;
	}



}
