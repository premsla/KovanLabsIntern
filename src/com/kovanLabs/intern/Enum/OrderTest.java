package com.kovanLabs.intern.Enum;

enum OrderState {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED;

    public boolean canTransitionTo(OrderState next) {
        switch (this) {
            case NEW:
                return next == PROCESSING;
            case PROCESSING:
                return next == SHIPPED;
            case SHIPPED:
                return next == DELIVERED;
            case DELIVERED:
                return false;
            default:
                return false;
        }
    }
}

class Order {
    private OrderState state;

    public Order() {
        this.state = OrderState.NEW;
    }

    public void updateState(OrderState newState) {
        if (state.canTransitionTo(newState)) {
            System.out.println("State changed: " + state + " → " + newState);
            state = newState;
        } else {
            System.out.println("Invalid transition: " + state + " → " + newState);
        }
    }

    public OrderState getState() {
        return state;
    }
}


