package org.v8.kernel.behavior;

import java.util.List;

import org.v8.kernel.bean.POJO;
import org.v8.kernel.bundles.Bundle;


public interface Behavior {
	
	void visit(Bundle bundle);
	void visit(POJO<?> bean);
	
	
	void execute(ExecutionOrder eo, List<Bundle> bundles);
}
