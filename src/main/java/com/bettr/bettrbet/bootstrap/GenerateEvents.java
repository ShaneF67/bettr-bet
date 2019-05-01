package com.bettr.bettrbet.bootstrap;

import com.bettr.bettrbet.model.*;

import java.util.HashSet;
import java.util.Set;

public class GenerateEvents {


    public void generateSoccerMatch() {
        Event cupFinal = GenericBuilder.of(Event::new)
                .with(Event::setHomeTeam, "Clonskeagh")
                .with(Event::setAwayTeam, "Tallaght")
                .with(Event::setEventType, EventType.FOOTBALL)
                .build();

        Bookmaker paddyPower = GenericBuilder.of(Bookmaker::new)
                .with(Bookmaker::setName, "Paddy Power")
                .with(Bookmaker::setAddress, "Dublin, Ireland")
                .build();

        Set<Market> markets = new HashSet<>();

        Market wdwMarket = GenericBuilder.of(Market::new)
                .with(Market::setEvent, cupFinal)
                .with(Market::setMarketType, MarketType.WDW)
                .build();

        Set<Selection> wdwSelections = new HashSet<>();
        wdwSelections.add(createSelection("Closkeagh", 2.75, paddyPower));
        wdwSelections.add(createSelection("Draw", 0.67, paddyPower));
        wdwSelections.add(createSelection("Tallaght", 2.6, paddyPower));

        wdwMarket.setSelections(wdwSelections);
        markets.add(wdwMarket);

        Market scoreMarket = GenericBuilder.of(Market::new)
                .with(Market::setEvent, cupFinal)
                .with(Market::setMarketType, MarketType.CORRECT_SCORE)
                .build();

        Set<Selection> scoreSelections = new HashSet<>();
        scoreSelections.add(createSelection("1-0", .45, paddyPower));
        scoreSelections.add(createSelection("2-0", 5.5, paddyPower));
        scoreSelections.add(createSelection("2-1", 22.0, paddyPower));
        scoreSelections.add(createSelection("3-0", 55.0, paddyPower));
        scoreSelections.add(createSelection("3-1", 255.0, paddyPower));

        scoreSelections.add(createSelection("0-0", 4.5, paddyPower));
        scoreSelections.add(createSelection("1-1", 175.0, paddyPower));
        scoreSelections.add(createSelection("2-2", 225.0, paddyPower));

        scoreSelections.add(createSelection("0-1", 12.0, paddyPower));
        scoreSelections.add(createSelection("0-2", 4.5, paddyPower));
        scoreSelections.add(createSelection("1-2", 17.0, paddyPower));
        scoreSelections.add(createSelection("0-3", 3.2, paddyPower));
        scoreSelections.add(createSelection("1-3", 14.0, paddyPower));

        scoreMarket.setSelections(scoreSelections);
        markets.add(scoreMarket);

        cupFinal.setMarkets(markets);
    }

    private Selection createSelection(String marketOutcome, Double odds, Bookmaker bookmaker) {
        return GenericBuilder.of(Selection::new)
                .with(Selection::setMarketOutcome, marketOutcome)
                .with(Selection::setPrice, GenericBuilder.of(Price::new)
                        .with(Price::setOdds, odds)
                        .with(Price::setBookmaker, bookmaker)
                        .build())
                .build();

    }

}
