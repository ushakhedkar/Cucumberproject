package com.qa.util;

public class ConfigFileReader extends TestBase{

	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the config.properties file for the Key:reportConfigPath");		
	}
}
