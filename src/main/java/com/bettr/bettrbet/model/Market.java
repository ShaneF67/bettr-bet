package com.bettr.bettrbet.model;

import java.util.HashSet;
import java.util.Set;

public class Market {

    private MarketType marketType;
    private Event event;
    private Set<Selection> selections = new HashSet<>();

    public MarketType getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketType marketType) {
        this.marketType = marketType;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Set<Selection> getSelections() {
        return selections;
    }

    public void setSelections(Set<Selection> selections) {
        this.selections = selections;
    }
}
