package org.v8.kernel.jmx.observer;

public abstract class Observer<T> {

	public abstract void notifyChangeBefore();
	
	public abstract void notifyChangeAfter();
	
	
	public abstract void notifyChangeBefore(T t);
	
	public abstract void notifyChangeAfter(T t);
	
}
