package com.smoke.test.agileHatsProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class agileHatsSmokeTest {

	private WebDriver driver;
	private String baseUrl;
	SearchPageFactory searchPage;

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.gecko.driver", "/home/anita/Desktop/geckodriver/geckodriver");
		driver = new FirefoxDriver();
		searchPage = new SearchPageFactory(driver);
		baseUrl = "http://ah-test.abhapp.com/login";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void Test() {
		
		searchPage.setEmail("blabla3@gmail.com");
		searchPage.setPassword("matejsvoboda");
		searchPage.slickLoginButton();
		searchPage.clickProjectsLink();
		searchPage.clickCreateProjectButton();
		searchPage.clickFunding();
		searchPage.setProjectName("Project Name Maven Test");
		searchPage.setWhy("This is why text...");
		searchPage.setWhat("This is what text...");
		searchPage.setHow("This is how...");
		searchPage.clickNextButton1();
		searchPage.verifyAddPeople("");
		searchPage.clickNextButton2();
		searchPage.verifyAddResponsibility("");
		searchPage.clickNexButton3();
		searchPage.clickGoToProjectButton();

	}

	@AfterTest
	public void afterTest() {

	}

}
