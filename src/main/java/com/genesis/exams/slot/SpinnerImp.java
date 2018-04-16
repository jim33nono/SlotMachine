package com.genesis.exams.slot;

public class SpinnerImp implements Spinner {
	public Symbol spin(Reel reel) {
		double totalWeight = 0.0d;
		for (Symbol s : reel.getSymbols()) {
			totalWeight += s.getWeight();
		}
		int randomIndex = -1;
		double random = Math.random() * totalWeight;
		for (int i = 0; i < reel.getSymbols().length; i++) {
			random -= reel.getSymbols()[i].getWeight();
			if (random <= 0.0d) {
				randomIndex = i;
				break;
			}
		}
		Symbol specifiedSymbol = reel.getSymbols()[randomIndex];
		return specifiedSymbol;

	}

}
