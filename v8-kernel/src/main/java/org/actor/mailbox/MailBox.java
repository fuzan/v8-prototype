package org.actor.mailbox;

import java.util.Queue;

import org.actor.mailbox.data.Data;

public abstract class MailBox<T> {

	int boxId;
	Queue<T> mailbox;
	Data data;
	
	public abstract void enqueue();
	
	public abstract byte[] peekMessage();
	
	
}
