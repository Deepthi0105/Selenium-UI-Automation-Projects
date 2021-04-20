package test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.TcLp1002;

public class TcLp1002Test extends BaseTest{
	
	@Test
	
	public void unregisterLogin() throws IOException {
		TcLp1002 ul=PageFactory.initElements(driver, TcLp1002.class);
		ul.onClickLogin();
		ul.enterEmailID();
		ul.enterPassword();
		ul.enterLogin();
		
	}

}
