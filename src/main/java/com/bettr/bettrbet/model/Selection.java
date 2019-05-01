package com.bettr.bettrbet.model;

/**
 * Represents a possible outcome for a market
 */
public class Selection {

    private String marketOutcome;
    private Price odds;

    public String getMarketOutcome() {
        return marketOutcome;
    }

    public void setMarketOutcome(String market) {
        this.marketOutcome = market;
    }

    public Price getPrice() {
        return odds;
    }

    public void setPrice(Price odds) {
        this.odds = odds;
    }
}
