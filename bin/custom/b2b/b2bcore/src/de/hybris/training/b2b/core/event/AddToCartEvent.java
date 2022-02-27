package de.hybris.training.b2b.core.event;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class AddToCartEvent extends AbstractEvent {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
