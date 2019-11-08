package myapplication;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dressespagetest extends BasePage{

  DressesPageObject ap;
  BasePage bp;
  HomePageObject hp;
  public Dressespagetest() {
	  ap=new DressesPageObject();
	  bp=new BasePage();
	  hp=new HomePageObject();
	  
	  
  }
  @Test
  public void dressseverify() {
	  hp.DressesTab();
	  Assert.assertTrue(bp.elementFound(ap.gettextsize()));
	  Assert.assertTrue(bp.elementFound(ap.gettabsize()));
	  Assert.assertTrue(bp.elementFound(ap.getsize()));
	  
	  
  }
 	

 }
		
	
	
	
	

