package Construction;


import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest {

	private static final double PRECISION = 0.00001;
	
	@Test
	public void test() {
		ConstructionCost test = new ConstructionCost();
		
		double output = test.Cost("standardMaterials", 450, false);
		assertEquals(540000, output, PRECISION);
		
		output = test.Cost("highStandardsMaterials", 450, true);
		assertEquals(1125000, output, PRECISION);
		
	}

}
