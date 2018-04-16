package com.genesis.exams.slot;

/**
 * Spins a reels and returning the symbol
 * as a result of the spin.
 * @author etc
 *
 */
public interface Spinner {
    public Symbol spin(Reel reel);
}
