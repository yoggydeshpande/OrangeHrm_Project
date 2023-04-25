	package scripts;

import org.testng.annotations.Test;
import genericlibrary.WebDriverMethods;
import pages.ObjectRepository;

public class LogInTestCase extends WebDriverMethods {

	@Test
	public void loginTestCasesOne() {
		System.out.println("loginTestCasesOne");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		click(ObjectRepository.logInButton);
		getTextFromPopUp();
		acceptPopUp();
	}


	@Test
	public void loginTestCasesTwo() {
		System.out.println("loginTestCasesTwo");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		click(ObjectRepository.clearButton);
		String text = getAttribute(ObjectRepository.logInName);
		if(text.contains("admin")) {
			System.out.println("text is present in login textbox");
		}
		else {
			System.out.println("text not present in login textbox");
		}
    }
	
    @Test
	public void loginTestCasesThree() {
		System.out.println("loginTestCasesThree");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName," ");
		click(ObjectRepository.logInButton);
		getTextFromPopUp();
		acceptPopUp();
    }

	@Test
	public void loginTestCasesFour() {
		System.out.println("loginTestCasesFour");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName," ");
		click(ObjectRepository.clearButton);
		String text = getAttribute(ObjectRepository.logInName);
		if(text.contains(" ")) {
			System.out.println("text is present in login textbox");
		}
		else {
			System.out.println("text cleared in login textbox");
		}
   }

	@Test
	public void loginTestCasesFive() {
		System.out.println("loginTestCasesFive");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.logInButton);
		
		
	}

	@Test
	public void loginTestCasesSix() {
		System.out.println("loginTestCasesSix");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.clearButton);
		String text = getAttribute(ObjectRepository.logInName);
		if(text.contains(" ")) {
			System.out.println("text is present in login textbox");
		}
		else {
			System.out.println("text not present in login textbox");
		}

		String password=getAttribute(ObjectRepository.passwordText);
		if(password.contains("admin")) {
			System.out.println("password is present in pswd textbox ");
		}
		else {
			System.out.println("password cleared in pswd textbox ");
		}

	}

	@Test
	public void loginTestCasesSeven() {
		System.out.println("loginTestCasesSeven");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		sendKeys(ObjectRepository.passwordText,"hioei");
		click(ObjectRepository.logInButton);
		if(isDisplayed(ObjectRepository.invalidLogin)) {
			System.out.println("Invalid login msg will be displayed");
		}

	}

	@Test
	public void loginTestCasesEight() {
		System.out.println("loginTestCasesEight");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		sendKeys(ObjectRepository.passwordText,"nuytj");
		click(ObjectRepository.clearButton);
		String password=getAttribute(ObjectRepository.passwordText);
		if(password.contains("admin")) {
			System.out.println("password is present in pswd textbox ");
		}
		else {
			System.out.println("password cleared in pswd textbox ");
		}
	}

	@Test
	public void loginTestCasesNine() {
		System.out.println("loginTestCasesNine");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"mnbvc");
		sendKeys(ObjectRepository.passwordText,"ihgrewsz");
		click(ObjectRepository.logInButton);
		if(isDisplayed(ObjectRepository.invalidLogin)) {
			System.out.println("Invalid login msg will be displayed");
		}
	}

	@Test
	public void loginTestCasesTen() {
		System.out.println("loginTestCasesTen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"kjhgfd");
		sendKeys(ObjectRepository.passwordText,"wefghjk");
		click(ObjectRepository.clearButton);
		String password=getAttribute(ObjectRepository.passwordText);
		if(password.contains("admin")) {
			System.out.println("password is present in pswd textbox ");
		}
		else {
			System.out.println("password cleared in pswd textbox ");
		}
	}

	@Test
	public void loginTestCasesEleven() {
		System.out.println("loginTestCasesEleven");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"234567");
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.logInButton);
		if(isDisplayed(ObjectRepository.invalidLogin)) {
			System.out.println("Invalid login msg will be displayed");
		}
	}

	@Test
	public void loginTestCasesTwelve() {
		System.out.println("loginTestCasesTwelve");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"igewsc");
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.clearButton);
		String text = getAttribute(ObjectRepository.logInName);
		if(text.contains(" ")) {
			System.out.println("text is present in login textbox");
		}
		else {
			System.out.println("text cleared in login textbox");
		}

		String password=getAttribute(ObjectRepository.passwordText);
		if(password.contains("admin")) {
			System.out.println("password is present in pswd textbox ");
		}
		else {
			System.out.println("password cleared in pswd textbox ");
		}
	}

	@Test
	public void LoginTestCaseThirteen() {
		System.out.println("LoginTestCaseThirteen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();


	}

	@Test
	public void LoginTestCaseFourteen() {
		System.out.println("LoginTestCaseFourteen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.clearButton);
		String password=getAttribute(ObjectRepository.passwordText);
		if(password.contains("admin")) {
			System.out.println("password is present in pswd textbox ");
		}
		else {
			System.out.println("password cleared in pswd textbox ");
		}
	}

	@Test

	public void LoginTestCaseFifteen() {
		System.out.println("LoginTestCaseFifteen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"koiuytr");
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();

	}

	@Test

	public void LoginTestCaseSixteen() {
		System.out.println("LoginTestCaseSixteen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"xfgyuio");
		click(ObjectRepository.clearButton);
		String text = getAttribute(ObjectRepository.logInName);
		if(text.contains("xfgyuio")) {
			System.out.println("text is present in login textbox");
		}
		else {
			System.out.println("text cleared in login textbox");
		}

	}

	@Test
	public void LoginTestCaseSeventeen() {
		System.out.println("LoginTestCaseSeventeen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.passwordText,"mnbh");
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();

	}

	@Test
	public void LoginTestCaseEighteen() {
		System.out.println("LoginTestCaseEighteen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.passwordText,"kuytre");
		click(ObjectRepository.clearButton);
		String password=getAttribute(ObjectRepository.passwordText);
		if(password.contains("admin")) {
			System.out.println("password is present in pswd textbox ");
		}
		else {
			System.out.println("password cleared in pswd textbox ");
		}
    }

	@Test
	public void LoginTestCaseNineteen() {
		System.out.println("LoginTestCaseNineteen");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		sendKeys(ObjectRepository.passwordText,"admin");
		click(ObjectRepository.orangeHRMLink);
		switchBetweenTab();
		click(ObjectRepository.clearButton);
	}

	@Test
	public void LoginTestCaseTwenty() {
		System.out.println("LoginTestCaseTwenty");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"knjiuhyt");
		sendKeys(ObjectRepository.passwordText,"oijhgf");
		click(ObjectRepository.orangeHRMLink);
		switchBetweenTab();
		click(ObjectRepository.clearButton);
	
		
	}

	@Test
	public void LoginTestCaseTwentyOne() {
		System.out.println("LoginTestCaseTwentyOne");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"admin");
		sendKeys(ObjectRepository.passwordText,"oijhgf");
		click(ObjectRepository.orangeHRMLink);
		switchBetweenTab();
		click(ObjectRepository.clearButton);	
	}

	@Test
	public void LoginTestCaseTwentyTwo() {
		System.out.println("LoginTestCaseTwentyTwo");
		click(ObjectRepository.clearButton);
		sendKeys(ObjectRepository.logInName,"knjiuhyt");
		sendKeys(ObjectRepository.passwordText,"");
		click(ObjectRepository.orangeHRMLink);
		switchBetweenTab();
		click(ObjectRepository.clearButton);
	}

	@Test
	public void LoginTestCaseTwentyThree() {
		System.out.println("LoginTestCaseTwentyTwo");
		click(ObjectRepository.orangeHRMLink);
		switchBetweenTab();
		
	}
    @Test
	public void LoginTestCaseTwentyFour() {
    	System.out.println("LoginTestCaseTwentyFour");
    	click(ObjectRepository.clearButton);
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();

	}
}
