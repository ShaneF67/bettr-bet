package com.bettr.bettrbet.model;

import java.time.LocalDateTime;

public class Bet {

    private Punter punter;
    private Selection selection;
    private LocalDateTime timeOfBet;
    private BetType betType;
    private boolean result;

    public Punter getPunter() {
        return punter;
    }

    public void setPunter(Punter punter) {
        this.punter = punter;
    }

    public Selection getSelection() {
        return selection;
    }

    public void setSelection(Selection selection) {
        this.selection = selection;
    }

    public LocalDateTime getTimeOfBet() {
        return timeOfBet;
    }

    public void setTimeOfBet(LocalDateTime timeOfBet) {
        this.timeOfBet = timeOfBet;
    }

    public BetType getBetType() {
        return betType;
    }

    public void setBetType(BetType betType) {
        this.betType = betType;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
