package com.ecomm.reportLib;

import org.testng.Assert;

public class TestStatus {
	
	public static void fail(AssertionError e){
		
		MyLog.log().error(e.getMessage());
		Assert.fail(e.getMessage());
	}
	

}
