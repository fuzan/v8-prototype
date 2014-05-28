package org.actor;

import java.nio.ByteBuffer;

import org.actor.mailbox.MailBox;
import org.v8.kernel.bean.POJO;
import org.v8.kernel.behavior.Behavior;
import org.v8.kernel.bundles.Bundle;

public class ActorImpl implements Actor{

	Bundle bundle;
	Behavior behavior;
	POJO<ByteBuffer[]> bean;
	
	@Override
	public void setActorAuthentication() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(ByteBuffer data, MailBox<?> box) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean connection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setProtocol() {
		// TODO Auto-generated method stub
		return false;
	}

}
