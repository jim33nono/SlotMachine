package com.genesis.exams.slot;

import java.util.Arrays;

/**
 * Represents the result of Spin on a Slot Machine
 * 
 * @author etc
 */
public class SpinResult {
    private Symbol[] symbols;
    private long payout;
    
    /**
     * Creates an instance of SpinResult
     * @param symbols symbols as a result of a spin
     * @param payout amount of payout of the spin
     */
    public SpinResult(Symbol[] symbols, long payout) {
        super();
        this.symbols = symbols;
        this.payout = payout;
    }

    /**
     * method to get the symbols as a result of the spin, index 0 represents the result of the leftmost reel.
     * 
     * @return an array of string - symbols as a result of the spin, index 0 represents the result of the leftmost reel
     */
    public Symbol[] getSymbols() {
        return symbols;
    }

    /**
     * method to get the payout won by the spin.
     * 
     * @return a payout is simply. 0 if the player wins nothing
     */
    public long getPayout() {
        return payout;
    }

	@Override
	public String toString() {
		return "SpinResult [symbols=" + Arrays.toString(symbols) + ", payout=" + payout + "]";
	}

}
