package com.nunesd66.util.cdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class WeldContext {

	public static final WeldContext INSTANCE = new WeldContext();

    private final Weld weld;
    private final WeldContainer container;

    private WeldContext() {
        this.weld = new Weld();
        this.container = weld.initialize();
    }

    @SuppressWarnings("removal")
	public <T> T getBean(Class<T> type) {
        return container.instance().select(type).get();
    }
	
}
