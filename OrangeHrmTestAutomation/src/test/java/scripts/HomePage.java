package scripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import genericlibrary.WebDriverMethods;
import pages.ObjectRepository;

public class HomePage extends WebDriverMethods{

	public void login() {
		
		sendKeys(ObjectRepository.logInName,"admin");
		
		sendKeys(ObjectRepository.passwordText,"admin");
		
		click(ObjectRepository.logInButton);
	}
	@Test
	public void logoutTestCase(){
		
		login();
		
		Assert.assertEquals(true, isDisplayed(ObjectRepository.WelcomeAdmin));
		
		System.out.println("Welcome Admin is diaplayed");
		
		Assert.assertEquals(true, isDisplayed(ObjectRepository.changePassword));
		
		System.out.println("Change Password link is displayed"); 
		
		Assert.assertEquals(true, isDisplayed(ObjectRepository.logout));
		
		System.out.println("Logout link is displayed");
	}

	@Test
	public void addEmployee() throws Exception {

		login();

		click(ObjectRepository.pim);

		switchBetweenFrames(0);

		click(ObjectRepository.addButton);

		clear(ObjectRepository.addEmployeeCode);

		sendKeys(ObjectRepository.addEmployeeCode,"01");

		sendKeys(ObjectRepository.lastEmpName,"Deshpande");

		sendKeys(ObjectRepository.empMiddleName,"Vijay");

		sendKeys(ObjectRepository.empNickName,"Nanu");

		isEnabled(ObjectRepository.empFirstName);

		sendKeys(ObjectRepository.empFirstName,"Yogesh");

		sendKeys(ObjectRepository.chooseFileButton,"C:\\Users\\yoges\\Downloads\\IDphoto.png");

		click(ObjectRepository.saveEmpButton);

		click(ObjectRepository.backButton);

		click(ObjectRepository.listedEmpName);

		click( ObjectRepository.editEmpDetails);

		sendKeys(ObjectRepository.ssnNo,"123456");

		sendKeys(ObjectRepository.sinNo,"987654");

		sendKeys(ObjectRepository.otherId,"121");

		sendKeys(ObjectRepository.militaryService,"Class one Officer");

		sendKeys(ObjectRepository.driverLicense,"12341234");

		dropDownActions(ObjectRepository.maritalStatus,"Unmarried");

		click(ObjectRepository.genderSelect);

		click(ObjectRepository.dobCalender);

		waitUntilElementIsVisible(ObjectRepository.monthYearVal);

		selectDate(ObjectRepository.monthYearVal,ObjectRepository.previousYear,ObjectRepository.previousMonth,ObjectRepository.date,"September 2020","2020");
	}

	@Test 
	public void changePassword() throws IOException {
		//login to website
		login();

		//for changing password
		click(ObjectRepository.changePassword);

		//switch Control to the frame
		switchBetweenFrames(0);

		//click on edit
		click(ObjectRepository.editButton);

		//give old password
		sendKeys(ObjectRepository.oldPassword,"admin");
		
		sendKeys(ObjectRepository.newPassword,"ADMIN");
		
		sendKeys(ObjectRepository.confirmPassword,"ADMIN");
		
		click(ObjectRepository.savePassword);
		//getscreenshot("login_Screenshot");
		switchBackToDefaultContent();
	}

	@Test
	public void companyInfoGeneral() {

		//login to website
		login();

		click(ObjectRepository.admin);

		//switch the control to the form
		switchBetweenFrames(0);

		//
		click(ObjectRepository.editComInfo);

		clear(ObjectRepository.companyName);

		sendKeys(ObjectRepository.companyName,"Wipro");

		clear(ObjectRepository.taxId);

		sendKeys(ObjectRepository.taxId,"1234");

		clear(ObjectRepository.NAICS);

		sendKeys(ObjectRepository.NAICS,"890");

		clear(ObjectRepository.phoneNo);

		sendKeys(ObjectRepository.phoneNo,"7087635462");

		clear(ObjectRepository.fax);

		dropDownActions(ObjectRepository.country,"India");

		sendKeys(ObjectRepository.fax,"987654");

		clear(ObjectRepository.address1ComInfoGeneral);

		sendKeys(ObjectRepository.address1ComInfoGeneral,"ABC circle");

		clear(ObjectRepository.address2ComInfoGeneral);

		sendKeys(ObjectRepository.address2ComInfoGeneral,"shanivar peth");

		clear(ObjectRepository.city);

		sendKeys(ObjectRepository.city,"pune");

		clear(ObjectRepository.stateOrProvision);

		sendKeys(ObjectRepository.stateOrProvision,"Maharashtra");

		clear(ObjectRepository.zipCode);

		sendKeys(ObjectRepository.zipCode,"411038");

		clear(ObjectRepository.comments);

		sendKeys(ObjectRepository.comments,"good company");

		click(ObjectRepository.saveCompanyInfo);

		click(ObjectRepository.resetEmpButton);

		switchBackToDefaultContent();
	}

	@Test
	public void timeSheet() throws InterruptedException {

		login();

		click(ObjectRepository.time);
		
		switchBetweenFrames(0);

		sendKeys(ObjectRepository.timeEmployeeName,"Yogesh");
		
		Thread.sleep(1000);
		
		sendKeysArrowDown(ObjectRepository.timeEmployeeName, Keys.ARROW_DOWN );
		
		Thread.sleep(1000);
		
		sendKeysEnter(ObjectRepository.timeEmployeeName,Keys.ENTER);
		
		Thread.sleep(1000);
		
		click(ObjectRepository.timeViewButton);
		
		if(isDisplayed(ObjectRepository.noTimeSheetFound)) {
			System.out.println("No Timesheet found msg will be displayed");
		}
        switchBackToDefaultContent();
    }
	
	@Test
	public void bugTracker() {
		 
		login();
		
		click(ObjectRepository.bugTracker);
		
		switchBetweenFrames(0);
		//click(ObjectRepository.category);
		dropDownActions(ObjectRepository.category,"PHP");
		
		dropDownActions(ObjectRepository.bugModule,"Performance");
		
		dropDownActions(ObjectRepository.priority,"5 - Medium");
		
		sendKeys(ObjectRepository.summary,"Very Nice");
		
		sendKeys(ObjectRepository.mailBugReport,"yoggy05@gmail.com");
		
		sendKeys(ObjectRepository.description,"cwodfkj3f3r");
		
		click(ObjectRepository.bugTrackerSaveBtn);
	}
	
	@Test
	public void time() {
		
		//LogIn to the application
		login();
		
		//Click on time Module
		click(ObjectRepository.time);
		
		//Switch control To the Frame
		switchBetweenFrames(0);
		
		//Select day from day of week dropdown
		dropDownActions(ObjectRepository.firstDayOfWeek,"Saturday");
		
		click(ObjectRepository.saveTime);
	}
	

}
