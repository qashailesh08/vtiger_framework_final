package com.eva.webutil;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.eva.marketing.sub_module.reusable.code.Login_Page;

public class BaseTest {

	protected WebUtil util;

	@BeforeClass
	public void beforeSuiteMethod() {
		System.out.println("ExtentReports initialized");
		WebUtil.generateReport();
	}

	@BeforeTest
	public void beforeTestMethod() {
		util = WebUtil.getInstance();
		System.out.println("I am before Test Method");
	}

	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("I am before Class Method");
	}

	/*
	 * @Parameters({ "browser", "username", "password", "colortheme" })
	 * 
	 * @BeforeMethod public void beforeMethod(String browser, String username,
	 * String password, String colortheme, Method meth) {
	 * System.out.println("I am beforeMethod method"); String tcName =
	 * meth.getName(); util.createReport(tcName + " On " + browser);
	 * util.launchBrowser(browser); util.maxWindow();
	 * util.openUrl("http:/localhost:8888"); Login_Page logObj = new
	 * Login_Page(util); logObj.userCredential(username, password, colortheme);
	 * util.verifyFirstSelectedOption(logObj.getColorThemeDD(), colortheme,
	 * "Color Theme Dropdown"); logObj.loginButton();
	 * 
	 * }
	 */

	@BeforeMethod
	public void beforeMethod(Method meth) {
		System.out.println("I am beforeMethod method");
		String tcName = meth.getName();
		util.createReport(tcName + " On " + "chromebrowser");
		util.launchBrowser("chromebrowser");
		util.maxWindow();
		util.openUrl("http:/localhost:8888");
		Login_Page logObj = new Login_Page(util);
		logObj.userCredential("admin", "admin", "woodspice");
		util.verifyFirstSelectedOption(logObj.getColorThemeDD(), "woodspice", "Color Theme Dropdown");
		logObj.loginButton();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
		util.quit(2000);
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am After Class Method");
		util.flushReport();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am After Test Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println(" Destroyed ExtentReports initialized");
	}

}
