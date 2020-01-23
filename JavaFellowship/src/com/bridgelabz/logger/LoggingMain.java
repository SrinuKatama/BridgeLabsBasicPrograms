package com.bridgelabz.logger;

import java.io.IOException;
import java.util.logging.Level;

public class LoggingMain {

	public static void main(String[] args) throws IOException 
	{
		Log l=new Log("sri.txt");
		l.logger.setLevel(Level.WARNING);
		l.logger.info("info");
		l.logger.warning("warning");
		l.logger.severe("sever");
		
	}

}
