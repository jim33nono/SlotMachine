package com.genesis.exams.slot;

/**
 * A Reel instance is composed of symbols.
 * 
 * @author etc
 */
public class Reel {
    private Symbol[] symbols;

    /**
     * Creates an instance of Reel with symbols
     * 
     * @param symbols
     */
    public Reel(Symbol[] symbols) {
        this.symbols = symbols;
    }

    /**
     * Returns the symbols of this reel
     * 
     * @return the symbols of this reel
     */
    public Symbol[] getSymbols() {
        return symbols;
    }

}
