package Construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionApplication {

	private static final Logger LOGGER = LogManager.getLogger(ConstructionApplication.class);
	
	public static void main(String[] args) {
		
		ConstructionCost house1 = new ConstructionCost();
		double output = house1.Cost("standardMaterials", 450, false);
		LOGGER.info("Cost for construction of first house is "+output);
		
		ConstructionCost house2 = new ConstructionCost();
		output = house2.Cost("highStandardsMaterials", 450, true);
		LOGGER.info("Cost for construction of second house is "+output);

	}

}
