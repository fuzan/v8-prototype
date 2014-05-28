package org.v8.kernel.bean;
import java.nio.ByteBuffer;

public class Message extends POJO<Byte>{

	ByteBuffer[] receivedMessage;
	
	ByteBuffer[] message;
	
	ByteBuffer[] historySentMessage;
}
