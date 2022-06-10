package pageobjects.Assingment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class Pageobjects 
{
    WebDriver driver;
	
	public Pageobjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[class='gr-hyperlink'][href='/user/sign_in']")
	WebElement signin;
	
	@FindBy(css="button[class*='authPortalSignInButton']")
	WebElement signinwithemail;
	
	@FindBy(css="input[maxlength='128'][tabindex='1']")
	WebElement enteremail;
	
	@FindBy(css="input[type='password'][maxlength='1024']")
	WebElement enterpassword;
	
	@FindBy(css="input[tabindex='5'][type='submit']")
	WebElement signinbutton;
	
	@FindBy(css="input[type='text'][autocomplete='off']")
	WebElement enterbookname;
	
	@FindBy(css="button[type='submit'][class*='searchBox__icon--']")
	WebElement searchbutton;
	
	@FindBy(css="button.wtrToRead[type='submit']")
	WebElement wanttoread;
	
	@FindBy(css="a.viewShelfLink[href*='?shelf=to-read']")
	WebElement mybooks;
	
	@FindBy(css="img[title='Remove from my books'][alt='Remove from my books']")
	WebElement removeicon;
	
	@FindBy(css="img[class*='border'][alt='Vamsi Kumar']")
	WebElement profileicon;
	
	@FindBy(css="a[class*='__subNavLink'][data-method='POST']")
	WebElement signout;
	
	
	public void clicksignin()
	{
		signin.click();
	}
	public void clicksigninwithemail()
	{
		signinwithemail.click();
	}
	public void enteremailid(String email)
	{
		enteremail.sendKeys(email);
	}
	public void enterPassword(String pwd)
	{
		enterpassword.sendKeys(pwd);
	}
	public void clicksigninbutton()
	{
		signinbutton.click();
	}
	public void enterbook(String bookname)
	{
		enterbookname.sendKeys(bookname);
	}
	public void clicksearchbutton()
	{
		searchbutton.click();
	}
	public void clickwanttored()
	{
		wanttoread.click();
	}
	public void clickmybookslink()
	{
		mybooks.click();
	}
	public void clickremoveicon()
	{
		removeicon.click();
	}
	public void setswitchttoalert()
	{
		driver.switchTo().alert().accept();
	}
	public void clickprofileicon()
	{
		profileicon.click();
	}
	public void clicksignout()
	{
		signout.click();
	}
}
