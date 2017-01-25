package com.smoke.test.agileHatsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	
	
WebDriver driver;
	
	@FindBy(id="ember592")
	WebElement emailField;
	
	@FindBy(id="ember593")
	WebElement passwordField;
	
	@FindBy(className="buttons")
	WebElement loginButton;
	
	@FindBy(css="a[href*='projects']")
	WebElement projectsLink;
	
	@FindBy(css="a[href*='projects/new")
	WebElement createProjectButton;
	
	@FindBy(css="a[href*='projects/new/funding']")
	WebElement fundingLink;

	@FindBy(xpath=".//*[@id='name']")
	WebElement projectName;
	
	@FindBy(xpath=".//*[@id='description_why']")
	WebElement why;
	
	@FindBy(xpath=".//*[@id='description_what']")
	WebElement what;
	
	@FindBy(xpath=".//*[@id='description_how']")
	WebElement how;
	
	@FindBy(css=".btn.btn-green.pull-right")
	WebElement nextButton1;
	
	@FindBy(css="input[class='autocomplete-input ember-view ember-text-field']")
	WebElement addPeople;
	
	@FindBy(xpath=".//*[contains(text(), 'Next')]")
	WebElement nextButton2;
	
	@FindBy(css="input[class='typeahead text-input autocomplete-input ember-view ember-text-field']")
	WebElement addResponsibility;
	
	@FindBy(xpath=".//*[contains(text(), 'Next')]")
	WebElement nextButton3;
	
	@FindBy(xpath="//a[contains(.,'Go to project')]")
	WebElement goToProjectButton;
	
	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setEmail(String email){
		emailField.sendKeys(email);
	}
	
	public void setPassword(String password){
		passwordField.sendKeys(password);
	}
	public void slickLoginButton(){
		loginButton.submit();
	}
	public void clickProjectsLink(){
		projectsLink.click();
	}
	public void clickCreateProjectButton(){
		createProjectButton.click();
	}
	public void clickFunding(){
		fundingLink.click();
	}
	public void setProjectName(String name){
		projectName.sendKeys(name);
	}
	public void setWhy(String pwhy){
		why.sendKeys(pwhy);		
	}
	public void setWhat(String pwhat){
		what.sendKeys(pwhat);
	}
	
	public void setHow(String phow){
		how.sendKeys(phow);
	}
	public void clickNextButton1(){
		nextButton1.click();
	}
	public void verifyAddPeople(String blank){
		addPeople.sendKeys(blank);
	}
	public void clickNextButton2(){
		nextButton2.click();
	}
	public void verifyAddResponsibility(String blank){
		addResponsibility.sendKeys(blank);
	}	
	public void clickNexButton3(){
		nextButton3.click();
	}
	public void clickGoToProjectButton(){
		goToProjectButton.click();
	}

}
