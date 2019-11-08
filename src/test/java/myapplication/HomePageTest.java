package myapplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage{

	
	
	HomePageObject hp;
	BasePage bp;
	public HomePageTest() {
		hp=new HomePageObject();
		bp=new BasePage();
		
	}
	@Test
	

	public void verify() {
		
		Assert.assertTrue(bp.elementFound(hp.getWomenTab()));
		Assert.assertTrue(bp.elementFound(hp.getDressesTab()));
		Assert.assertTrue(bp.elementFound(hp.getTshirtsTab()));
	}
@Test
	public void verifynavigation() {
		hp.clickwomentab();
		Assert.assertTrue(bp.getTitlte().contains("Women"));
		hp.DressesTab();
		Assert.assertTrue(bp.getTitlte().contains("Dresses"));
		hp.TshirtsTab();
		Assert.assertTrue(bp.getTitlte().contains("T-shirts"));
}
	
	
	
}





