package com.genesis.exams.slot;

public class EvaluatorImp implements Evaluator {
	 private Symbol aSymbol = new Symbol("A", 1);
	 private Symbol bSymbol = new Symbol("B", 1);
	 private Symbol cSymbol = new Symbol("C", 1);
	
	public long evaluate(Symbol[] symbols, long bet) {
		
		if (symbols[0].equals(symbols[1]) && symbols[1].equals(symbols[2]) && symbols[2].equals(aSymbol)) {
			return 20 * bet;
		} else if (symbols[0].equals(symbols[1]) && symbols[1].equals(bSymbol)
				&& symbols[2].equals(new Symbol("B", 1))) {
			return 20 * bet;
		} else if (symbols[0].equals(symbols[1]) && symbols[1].equals(cSymbol)
				&& symbols[2].equals(new Symbol("C", 1))) {
			return 20 * bet;
		} else if ((symbols[0].equals(aSymbol) && symbols[1].equals(bSymbol) && symbols[2].equals(cSymbol))
				|| (symbols[0].equals(aSymbol) && symbols[1].equals(cSymbol) && symbols[2].equals(bSymbol))
				|| (symbols[0].equals(bSymbol) && symbols[1].equals(aSymbol) && symbols[2].equals(cSymbol))
				|| (symbols[0].equals(bSymbol) && symbols[1].equals(cSymbol) && symbols[2].equals(aSymbol))
				|| (symbols[0].equals(cSymbol) && symbols[1].equals(aSymbol) && symbols[2].equals(bSymbol))
				|| (symbols[0].equals(cSymbol) && symbols[1].equals(bSymbol) && symbols[2].equals(aSymbol))) {
			return 30 * bet;
		} else {
			return 0;
		}

	};
	
	public Symbol getaSymbol() {
		return aSymbol;
	}

	public Symbol getbSymbol() {
		return bSymbol;
	}

	public Symbol getcSymbol() {
		return cSymbol;
	}

}
