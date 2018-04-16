package com.genesis.exams.slot;


/**
 * A slot machine is composition of {@link com.genesis.exams.slot.Reel reels}.
 * Each reels is spun using {@link com.genesis.exams.slot.Spinner spinner}, the
 * result of the spin will be evaluated by
 * {@link com.genesis.exams.slot.Evaluator evaluator}.
 * 
 * @author etc
 *
 */
public class SlotMachine {

	private Reel[] reels;
	private Spinner spinner;
	private Evaluator evaluator;

	/**
	 * Creates an instance of SlotMachine using parameters: reels, spinner and
	 * evaluator
	 * 
	 * @param reels
	 *            reels of the SlotMachine
	 * @param spinner
	 *            spinner used to spin the SlotMachine
	 * @param evaluator
	 *            evaluator to be used by this SlotMachine
	 */
	public SlotMachine(Reel[] reels, Spinner spinner, Evaluator evaluator) {
		this.reels = reels;
		this.spinner = spinner;
		this.evaluator = evaluator;
	}

	/**
	 * Spins the reels in this machine using the
	 * {@link com.genesis.exams.slot.Spinner} passed to the constructor. The
	 * resulting symbols will be evaluated by
	 * {@link com.genesis.exams.slot.Evaluator evaluator} passed to the constructor.
	 * 
	 * @param bet
	 *            amount of bet
	 * @return SpinResult with the symbols and payout.
	 */
	public SpinResult spin(long bet) {
		Symbol[] symbols = new Symbol[reels.length];
		for (int i = 0; i < symbols.length; i++) {
			symbols[i] = spinner.spin(reels[i]);
		}
		long payout = evaluator.evaluate(symbols, bet);
		return new SpinResult(symbols, payout);
	}

	public static void main(String[] args) {
		Symbol aSymbol = new Symbol("A", 1);
		Symbol bSymbol = new Symbol("B", 1);
		Symbol cSymbol = new Symbol("C", 1);
		Symbol xSymbol = new Symbol("X", 2);
		Symbol ySymbol = new Symbol("Y", 3);
		Symbol zSymbol = new Symbol("Z", 4);
		Symbol[] symbols = { aSymbol, bSymbol, cSymbol, xSymbol, ySymbol, zSymbol };
		Symbol[] reverseSymbols = { zSymbol, ySymbol, xSymbol, aSymbol, bSymbol, cSymbol };
		Reel firstReel = new Reel(symbols);
		Reel secondReel = new Reel(reverseSymbols);
		Reel thirdReel = new Reel(symbols);
		Reel[] reels = { firstReel, secondReel, thirdReel };

		SlotMachine slotMachine = new SlotMachine(reels, new SpinnerImp(), new EvaluatorImp());

		for (int i = 0; i < 10000; i++) {
			SpinResult spinResult;
			
			// Only print out result when the payout is more than 0
			if ((spinResult = slotMachine.spin(100)).getPayout() > 0) {
				System.out.println(spinResult.toString());
			}
		}

	}
}
