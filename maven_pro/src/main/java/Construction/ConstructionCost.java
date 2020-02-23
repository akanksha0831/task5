package Construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {

	private static final Logger LOGGER = LogManager.getLogger(ConstructionApplication.class);
	
	public double Cost(String standard_type, double area, boolean FullyAutomated) {
		
		LOGGER.info("Control entered the Cost method");
		
		double cost = area;
		if(standard_type=="standardMaterials" && FullyAutomated==false)
			cost*=1200;
		else if(standard_type=="aboveStandardMaterials" && FullyAutomated==false)
			cost*=1500;
		else if(standard_type=="highStandartMaterials" && FullyAutomated==false)
			cost*=1800;
		else if(standard_type=="highStandardsMaterials" && FullyAutomated==true)
			cost*=2500;
		
		LOGGER.info("Control exited the Cost method");
		
		return cost;
	}
	
}
