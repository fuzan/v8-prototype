package org.actor;

import org.actor.mailbox.MailBox;
import java.nio.ByteBuffer;


/**
 * 
 *     Distributed model, maintain a mailbox itself, and send message to other's mailbox as
 * 
 * @author fuzan
 *
 */
public interface Actor {
	
	public void setActorAuthentication();
	
	//@asynchronous 
	public void send(ByteBuffer data , MailBox<?> box);
	
	public void receive();
	
	public void notifyMessage();
	
	// connection or connectionless
	public boolean connection();
	
	public boolean setProtocol();
	
}
