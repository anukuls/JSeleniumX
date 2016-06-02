package testScripts.suiteD;

import projectModule.Google_Actions;
import com.testing.SeleniumX.runManager.Testcase;
import com.testing.SeleniumX.utility.Excel_Utils;
import com.testing.SeleniumX.utility.TestData_Loader;
import projectModule.Common_Actions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

public class Google_Search extends Testcase {
	
	//Instance variable driver created to use this across all methods
	public WebDriver driver;
	public Excel_Utils data;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void preScript(String browser) throws Exception {
		
		data = TestData_Loader.loadTestData(this);
		String url = data.getCellData(this, "URL");

		driver = Common_Actions.openBrowser(browser);
		driver.get(url);
	}
	
	@Test
	public void main() throws Exception {
		String search_string = data.getCellData(this, "Search_String");
		Google_Actions.googleSearch(driver, search_string);
	}
	
	@AfterMethod
	public void postScript() throws Exception {
		//Add any post conditions here
	}
	
}
