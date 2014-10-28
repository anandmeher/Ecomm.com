package com.ecomm.reprotLib;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class MyLog {
		
	static Logger log;
	
	public static Logger Log(){
		DOMConfigurator.configure("src\\com\\ecomm\\reprotLib\\log4j.xml");
		log = Logger.getLogger(MyLog.class.getName());		
		return log;
	}

}
