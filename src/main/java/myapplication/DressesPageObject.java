package myapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class DressesPageObject extends BasePage{
	public DressesPageObject() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id='header_logo']/a/img")
private WebElement manu;
	public WebElement getmenu() {
		return manu;
	}
	@FindBy(xpath="//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement DressesTab;
	
	public WebElement getDressesTab() {
		return DressesTab;
	}
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a/span")
	private WebElement size;
	public WebElement getsize() {
		return size;
	}
		
		@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[2]/label/a")
		private WebElement tabsize;
		public WebElement gettabsize() {
			return tabsize;
		}
		@FindBy(xpath="//*[@id=\'ul_layered_id_attribute_group_1\']/li[3]/label/a/span")
			private WebElement textsize;
			public WebElement gettextsize() {
				return textsize;
			
	}
		
		
	}

