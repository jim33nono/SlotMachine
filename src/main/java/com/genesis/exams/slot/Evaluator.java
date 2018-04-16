package com.genesis.exams.slot;

/**
 * Evaluates the outcome of spin. 
 * @author etc
 *
 */
public interface Evaluator {

    /**
     * see top level interface description
     * @param symbols resulting symbols from a spin
     * @param bet placed for the spin
     * @return the amount of payout evaluated depending on the symboles. 0 for losing symbols combination
     */
   public long evaluate(Symbol[] symbols, long bet);
    
}
