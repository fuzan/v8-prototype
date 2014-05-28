package org.v8.kernel.bundles;

import org.v8.kernel.jmx.observer.Observer;

public interface Bundle {

	void setObserver( Observer<?> ob );
	
}
