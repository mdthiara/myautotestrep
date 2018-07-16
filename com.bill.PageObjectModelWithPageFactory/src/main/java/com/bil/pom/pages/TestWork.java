package com.bil.pom.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bill.util.BLConstants;

public class TestWork  {
    public static WebDriver driver;
	

	@FindBy(xpath="//*[@id=\'email\']")
	public static  WebElement email;
	
	@FindBy(xpath=BLConstants.LOGIN_PASSWORD)
	public static  WebElement psswd;
	
	@FindBy(xpath=BLConstants.SUBMIT_BUTTON)
	public static  WebElement submit;
	

    @FindBy(xpath="//*[@id=\"contentstart\"]/div/div[1]/bdc-dashboard/div/div[2]/bdc-dashboard-big-tabs-container/div/bdc-big-tabs-group/div/div[1]/div/div")
    public static List<WebElement> selectionButton;
	
    @FindBy(xpath="//*[@id=\'ngb-tooltip-1\']/div[2]/div[1]")
    public static  WebElement cross;
    
    
    
    @FindBy(xpath="//*[@id=\"App-theme\"]/root/div/div/bdc-frame/div[2]/div/div/section[1]/bdc-frame-leftnav/section/div/div[2]/bdc-frame-actions-btn/div/bdc-neo-in-button/button/span/span[2]")
    public static  WebElement toggleb;
    
    
    @FindBy(xpath="//*[@id=\"App-theme\"]/root/div/div/bdc-frame/div[2]/div/div/section[1]/bdc-frame-leftnav/section/div/div[2]/bdc-frame-actions-btn/div/div/ul")
    public static  WebElement dropDown;
 

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testNow();

	}
	
	
	public static void testNow() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, TestWork.class);
		driver.get(BLConstants.HOME_URL);
		email.sendKeys(BLConstants.USERNAME_EMAIL);
	    psswd.sendKeys(BLConstants.USERNAME_PASSWORD);
	    submit.click();	 
	    
	    if (cross!=null) {
	    	  cross.click();
	    }
	    	toggleb.click();
	    //	dropDown.selectByVisibleText("Pay a vendor");
	    List<WebElement> all=dropDown.findElements(By.tagName("li"));
	    for (WebElement a:all) {
	    	if(a.getText().equalsIgnoreCase("Pay a vendor"))
	    		a.click();
	    }
	    System.out.println(all.size());
	  //  System.out.println(driver.getWindowHandles().size());
	/*    System.out.println(selectionButton.size());
	    for (int i =0;i< selectionButton.size();i++) {
	    	System.out.println(selectionButton.get(i).getText());
	    	selectionButton.get(i).click();
	    }*/
		
	}

}
