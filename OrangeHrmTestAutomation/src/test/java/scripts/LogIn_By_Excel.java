package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericlibrary.WebDriverMethods;
import pages.ObjectRepository;

public class LogIn_By_Excel extends WebDriverMethods {

	@Test
	public void loginTestCasesOne() throws EncryptedDocumentException, IOException {
		System.out.println("loginTestCasesOne");
		click(ObjectRepository.clearButton);
		String user = excelSheet("./LogIn_Excel.xlsx","Sheet1",1,0);
		sendKeys(ObjectRepository.logInName,user);
		click(ObjectRepository.logInButton);
		getTextFromPopUp();
		acceptPopUp();
	}
	
	 @Test
	public void loginTestCasesThree() throws EncryptedDocumentException, IOException {
		System.out.println("loginTestCasesThree");
		click(ObjectRepository.clearButton);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",2,0);
		sendKeys(ObjectRepository.logInName,password);
		click(ObjectRepository.logInButton);
		getTextFromPopUp();
		acceptPopUp();
    }

	@Test
	public void loginTestCasesFive() throws EncryptedDocumentException, IOException {
		System.out.println("loginTestCasesFive");
		click(ObjectRepository.clearButton);
		String user=excelSheet("./LogIn_Excel.xlsx","Sheet1",3,0);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",3,1);
		sendKeys(ObjectRepository.logInName,user);
		sendKeys(ObjectRepository.passwordText,password);
		getscreenshot("ss1");
		click(ObjectRepository.logInButton);
	}


	@Test
	public void loginTestCasesSeven() throws EncryptedDocumentException, IOException {
		System.out.println("loginTestCasesSeven");
		click(ObjectRepository.clearButton);
		String user=excelSheet("./LogIn_Excel.xlsx","Sheet1",4,0);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",4,1);
		sendKeys(ObjectRepository.logInName,user);
		sendKeys(ObjectRepository.passwordText,password);
		click(ObjectRepository.logInButton);
		if(isDisplayed(ObjectRepository.invalidLogin)) {
			System.out.println("Invalid login msg will be displayed");
		}
    }

	@Test
	public void loginTestCasesNine() throws EncryptedDocumentException, IOException {
		System.out.println("loginTestCasesNine");
		click(ObjectRepository.clearButton);
		String user=excelSheet("./LogIn_Excel.xlsx","Sheet1",5,0);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",5,1);
		sendKeys(ObjectRepository.logInName,user);
		sendKeys(ObjectRepository.passwordText,password);
		click(ObjectRepository.logInButton);
		if(isDisplayed(ObjectRepository.invalidLogin)) {
			System.out.println("Invalid login msg will be displayed");
		}
	}


	@Test
	public void loginTestCasesEleven() throws EncryptedDocumentException, IOException {
		System.out.println("loginTestCasesEleven");
		click(ObjectRepository.clearButton);
		String user=excelSheet("./LogIn_Excel.xlsx","Sheet1",6,0);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",6,1);
		sendKeys(ObjectRepository.logInName,user);
		sendKeys(ObjectRepository.passwordText,password);
		click(ObjectRepository.logInButton);
		if(isDisplayed(ObjectRepository.invalidLogin)) {
			System.out.println("Invalid login msg will be displayed");
		}
	}

	
	

	@Test
	public void LoginTestCaseThirteen() throws EncryptedDocumentException, IOException {
		System.out.println("LoginTestCaseThirteen");
		click(ObjectRepository.clearButton);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",7,1);
		sendKeys(ObjectRepository.passwordText,password);
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();


	}

	@Test

	public void LoginTestCaseFifteen() throws EncryptedDocumentException, IOException {
		System.out.println("LoginTestCaseFifteen");
		click(ObjectRepository.clearButton);
		String user=excelSheet("./LogIn_Excel.xlsx","Sheet1",8,0);
		sendKeys(ObjectRepository.logInName,user);
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();

	}



	@Test
	public void LoginTestCaseSeventeen() throws EncryptedDocumentException, IOException {
		System.out.println("LoginTestCaseSeventeen");
		click(ObjectRepository.clearButton);
		String password=excelSheet("./LogIn_Excel.xlsx","Sheet1",9,1);
		sendKeys(ObjectRepository.passwordText,password);
		click(ObjectRepository.logInButton);
		isAlertPresent();
		getTextFromPopUp();
		acceptPopUp();

	}


}
