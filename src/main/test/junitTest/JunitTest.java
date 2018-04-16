package junitTest;


import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;

import org.junit.Test;

import com.genesis.exams.slot.Evaluator;
import com.genesis.exams.slot.EvaluatorImp;
import com.genesis.exams.slot.Reel;
import com.genesis.exams.slot.SpinnerImp;
import com.genesis.exams.slot.Symbol;

public class JunitTest {
	
	public Symbol[] symbolParameters() {
		Symbol aSymbol = new Symbol("A", 1);
		Symbol bSymbol = new Symbol("B", 1);
		Symbol cSymbol = new Symbol("C", 1);
		Symbol xSymbol = new Symbol("X", 2);
		Symbol ySymbol = new Symbol("Y", 3);
		Symbol zSymbol = new Symbol("Z", 4);
		Symbol[] symbols = { aSymbol, bSymbol, cSymbol, xSymbol, ySymbol, zSymbol };
		return symbols;
	}

	public Reel reelParameter() {
		Symbol[] symbols = { symbolParameters()[0], symbolParameters()[1], symbolParameters()[2], symbolParameters()[3],
				symbolParameters()[4], symbolParameters()[5] };
		Reel reel = new Reel(symbols);
		return reel;
	}

	@Test
	public void testEvaluator() {
		Evaluator evaluator = new EvaluatorImp();
		try {
			Symbol[] abcSymbols = { symbolParameters()[0], symbolParameters()[1], symbolParameters()[2] };
			assertEquals(60, evaluator.evaluate(abcSymbols, 2));
			Symbol[] aaaSymbols = { symbolParameters()[0], symbolParameters()[0], symbolParameters()[0] };
			assertEquals(40, evaluator.evaluate(aaaSymbols, 2));
			Symbol[] bbbSymbols = { symbolParameters()[1], symbolParameters()[1], symbolParameters()[1] };
			assertEquals(40, evaluator.evaluate(bbbSymbols, 2));
			Symbol[] cccSymbols = { symbolParameters()[2], symbolParameters()[2], symbolParameters()[2] };
			assertEquals(40, evaluator.evaluate(cccSymbols, 2));
			System.out.println("Unit tested sccessfully");
		} catch (Exception e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testSpin() {
		SpinnerImp spinner = new SpinnerImp();
		int testCount = 8000000;
		HashMap<String, Double> test = new HashMap<String, Double>();
		for (int i = 0; i < testCount; i++) {
			Symbol symbol = spinner.spin(reelParameter());
			;
			test.put(symbol.getName(), (test.get(symbol.getName()) == null) ? (1d / testCount)
					: test.get(symbol.getName()) + 1d / testCount);
		}
		System.out.println(test.toString());	
		assertThat( 0.083, closeTo( test.get("A"), 0.005 ) );
		assertThat( 0.083, closeTo( test.get("B"), 0.005 ) );
		assertThat( 0.083, closeTo( test.get("C"), 0.005 ) );
		assertThat( 0.166, closeTo( test.get("X"), 0.005 ) );
		assertThat( 0.250, closeTo( test.get("Y"), 0.005 ) );
		assertThat( 0.333, closeTo( test.get("Z"), 0.005 ) );
		System.out.println("Unit tested sccessfully");
	}

}
