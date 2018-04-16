package com.genesis.exams.slot;

/**
 * A symbol represents a symbol placed in a reel.
 * 
 * @author etc
 */
public class Symbol {
	private String name;
	private int weight;

	/**
	 * Creates an instance of symbol and sets its name and weight
	 * 
	 * @param symbol
	 * @param weight
	 */
	public Symbol(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	/**
	 * Method to get the name of the symbol
	 * 
	 * @return name of the symbol
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to get the weight of the symbol. Weight usually defines the
	 * probability of the symbol to come out of a slot machine.
	 * 
	 * @return
	 */
	public int getWeight() {
		return weight;
	}

	public boolean equals(Symbol symbol) {
		if (this.name.equals(symbol.getName())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Symbol [name=" + name + ", weight=" + weight + "]";
	}

}
