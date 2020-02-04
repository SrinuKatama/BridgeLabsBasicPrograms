package com.bridgelabz.algorithmprograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;

public class Regex {

	public static void main(String[] args) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		String s=" Hello <<name>>, We have your full\n" + 
				"name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		s=s.replaceAll("<<name>>", Matcher.quoteReplacement("Sri") );
		s=s.replaceAll("<<full name>>", Matcher.quoteReplacement("Srinivasarao"));
		s=s.replaceAll("91-xxxxxxxxxx.\n", Matcher.quoteReplacement("9542526156"));
		s=s.replaceAll("01/01/2016",dtf.format(now));
		System.out.println(s);

	}

}
