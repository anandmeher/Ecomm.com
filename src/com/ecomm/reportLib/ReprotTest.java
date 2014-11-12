package com.ecomm.reportLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.ecomm.genericLib.Driver;


public class TestReport {
	
	public static void fail(AssertionError e, String testName) {
		System.out.println(testName);
		MyLog.Log().error(e.getMessage());
		MyLog.Log().info("ScreenShot taken as " + testName + ".jpg");		
		TestReport.getScreenShot(testName+".jpg");
		Assert.fail(e.getMessage());

	}
	
public static void getScreenShot(String imgName){
		
		EventFiringWebDriver eDriver = new EventFiringWebDriver(Driver.driver);
		
		File srcImg = eDriver.getScreenshotAs(OutputType.FILE);
		
		//String screenShotFilePath = new java.io.File("").getAbsolutePath() + "\\ScreenShot" + "imgName";
		
		//String screenShotFilePath = "E:\\Selenium old\\Ecomm.com\\ScreenShot" + imgName;
		
		File dstImg = new File("E:\\Selenium old\\Ecomm.com\\ScreenShot\\" + imgName);
		
		try {
			FileUtils.copyFile(srcImg, dstImg);
		} catch (IOException e) {
			e.printStackTrace();
			MyLog.Log().info(e.toString());
		}
	}

}
