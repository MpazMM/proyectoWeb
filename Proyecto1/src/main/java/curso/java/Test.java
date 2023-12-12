package curso.java;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Test {

	// Lo único que cambia es Test*
	private static final Logger logger = LogManager.getLogger(Test.class);

	public static void main(String[] args) {

		logger.trace("Traza");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warning");
		logger.error("Error");
		logger.fatal("Fatal");

	}

}
