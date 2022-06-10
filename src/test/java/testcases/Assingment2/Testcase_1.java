package testcases.Assingment2;

import org.testng.annotations.Test;
import pageobjects.Assingment2.Pageobjects;
import testbase.Assingment2.Baseclass;

public class Testcase_1 extends Baseclass
{
	@Test
	public void goodreadbooks()
	{
		Pageobjects goodread=new Pageobjects(driver);
		goodread.clicksignin();
		goodread.clicksigninwithemail();
		goodread.enteremailid(rb.getString("email"));
		goodread.enterPassword(rb.getString("password"));
		goodread.clicksigninbutton();
		goodread.enterbook(rb.getString("bookname"));
		goodread.clicksearchbutton();
		goodread.clickwanttored();
		
		try 
		{
			goodread.clickmybookslink();
		}
		catch(Exception e)
		{
		}
		try
		{
		    goodread.clickremoveicon();
		}
		catch(Exception e)
		{
		}
		try
		{
			goodread.setswitchttoalert();
		}
		catch(Exception e)
		{
		}
		
		goodread.clickprofileicon();
		goodread.clicksignout();
	}
}
