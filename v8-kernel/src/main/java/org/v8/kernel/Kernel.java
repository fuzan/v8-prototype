package org.v8.kernel;

import java.util.ArrayList;
import java.util.List;

import org.v8.kernel.bean.POJO;
import org.v8.kernel.behavior.Behavior;
import org.v8.kernel.bundles.Bundle;
import org.v8.kernel.event.Event;

/**
 *     
 *     Kernel is the factory,scheduler,monitor and event processor of bundles and beans.
 *     
 *         bundle: is the independent object, contains very functions call its entity, and decoupled 
 *                 from other bundle
 *                 
 *         bean: entity, like Message. No behaviors in that, even if,
 *               it is the self checking behavior, no other services call. 
 *     
 *         behavior: is the aggregation rules of bundles
 *         
 *         event: mapping to different behaviors
 *         
 *         
 *    Example:
 *    
 *        1 send/receive flow
 *        
 *        kernel-> construct message bean (Data)-> construct messageBundle (Send,Receive)->
 *        construct events-> construct behavior -> monitored by the observer bundle.
 *        
 *                           messageBundle <-> message
 *                           messageBundle.send(message.data)
 *                           messageBundle.receive(message.mailbox)
 *                           
 *                           send event : mb send to mb
 *                           receive/check event : mb check mailbox / flush mailbox / save mail until...
 *                           all the messageBundle are attached by another monitorBundle( dynamic injected ) 
 *                
 *        2 monitor all messages or some particular message bean
 *        kernel-> check all messages -> all message bean return
 *        kernel -> check how many message been send in last 5 mins -> check all messages by timestamps
 *        
 *        
 *        3 disable the sending function for all or for some beans
 *          assumption , we have two bundles: 1) message bundles 2) emergence message bundles
 *          
 *        kernel-> disable all normal message sending function -> unregister all message bundles
 *              -> get all normal message ( persistent or not) -> reorder all the bundle behavior to EMB.
 *        
 *        
 * @author fuzan
 *
 */

//@Singleton
public abstract class Kernel {
	
	//@Resources
	static List<POJO<?>> beans = new ArrayList<POJO<?>>();
	
	//@Resources
	static List<Bundle> bundles = new ArrayList<Bundle>();
	
	//@Inject
	Behavior behavior;
	
	
	public abstract boolean registerBundle(Bundle bundle);
	public abstract boolean unregisterBundle(Bundle bundle);
	
	public abstract boolean authentication(Behavior behavior);
	
	
	public abstract void setUpBehavior(Bundle bundle,POJO<?> bean,Behavior behavior);
	
	//behavior itself should solve the conflict 
	public abstract void execute(Behavior behavior);
	
	public abstract boolean registerResources(POJO<?> bean);
	public abstract boolean unregisterResources(POJO<?> bean);
	
	
	public abstract void setUpMapping(Event event,Behavior behavior);
	
	
}
