package de.hybris.training.b2b.core.event;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class AddToCartEventListener extends AbstractEventListener<AddToCartEvent> {
    @Override
    protected void onEvent(AddToCartEvent addToCartEvent) {
        String fullName = addToCartEvent.getFullName();
        System.out.println("EventTriggered: " + fullName);
    }
}
