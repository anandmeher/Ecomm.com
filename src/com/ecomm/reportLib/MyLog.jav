package com.ecomm.reportLib;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MyLog {
	
	public static void LogInfo(String infoMsg){
		DOMConfigurator.configure("src\\com\\ecomm\\reprotLib\\log4j.xml");
		Logger log = Logger.getLogger(MyLog.class.getName());		
		log.info(infoMsg);
	}
	
	
	

}
