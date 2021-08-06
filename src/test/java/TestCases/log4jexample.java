package TestCases;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class log4jexample {
static Logger logger=Logger.getLogger(log4jexample.class);


@Test
public void logger() {
	
	
	logger.debug("debug message");
	logger.info("info message");
	logger.warn("warning message");
	logger.error("error message");
	logger.fatal("fatal message");
	
	
	
}

}
