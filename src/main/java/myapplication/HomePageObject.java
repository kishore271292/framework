package myapplication;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	
	public HomePageObject() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement WomenTab;
	
	public WebElement getWomenTab() {
		return WomenTab;
	}
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement DressesTab;
	
	public WebElement getDressesTab() {
		return DressesTab;
	}
	
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[3]/a")
			private WebElement TshirtsTab;
	public WebElement getTshirtsTab(){
		
	return TshirtsTab;
	

	
}
	
	
	public void clickwomentab() {
		WomenTab.click();
	}
	public void DressesTab() {
		DressesTab.click();
	}
	public void TshirtsTab() {
		TshirtsTab.click();
	}
	

}
