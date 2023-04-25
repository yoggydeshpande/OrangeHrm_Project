package scripts;

import org.testng.annotations.Test;
import genericlibrary.WebDriverMethods;

import pages.ObjectRepository;

public class CompanyInfo extends WebDriverMethods {

	public void login() {

		sendKeys(ObjectRepository.logInName,"admin");

		sendKeys(ObjectRepository.passwordText,"admin");

		click(ObjectRepository.logInButton);
	}

	@Test
	public void companyInfoGeneral() {

		//login to website
		login();

		click(ObjectRepository.admin);

		//switch the control to the form
		switchBetweenFrames(0);

		
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

	}

	@Test
	public void companyInfoLocation() throws InterruptedException {

		//Login to the application
		login();

		Thread.sleep(1000);

		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.companyinfo);

		click(ObjectRepository.locations);		

		Thread.sleep(1000);

		switchBetweenFrames(0);

		click(ObjectRepository.addLocation);

		sendKeys(ObjectRepository.nameLocation,"HSBC");

		dropDownActions(ObjectRepository.countryLoc,"India");

		sendKeys(ObjectRepository.stateLoc,"Goa");

		sendKeys(ObjectRepository.cityLoc,"Panaji");

		sendKeys(ObjectRepository.addressLoc,"near calangute beach");

		sendKeys(ObjectRepository.zipcodeLoc,"423678");

		sendKeys(ObjectRepository.faxLoc,"92876543");

		sendKeys(ObjectRepository.phoneLoc,"209487862");

		sendKeys(ObjectRepository.commentsLoc,"good services");

		click(ObjectRepository.saveLocation);

		//		click(ObjectRepository.clickLoc2);
		//		
		//		click(ObjectRepository.clickLoc3);
		//		
		//		click(ObjectRepository.deleteLocation);

		//		Thread.sleep(1000);
	}

	@Test
	public void companyStructure() {

		login();

		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.companyinfo);

		click(ObjectRepository.companyStructure);

		switchBetweenFrames(0);

		click(ObjectRepository.addCompanyStructure);

		sendKeys(ObjectRepository.departIdCompStruct,"01");

		sendKeys(ObjectRepository.nameCompStruct,"xyz");

		dropDownActions(ObjectRepository.typeCompStruct,"Other");

		dropDownActionByValue(ObjectRepository.locationCompStruct,"LOC008");

		sendKeys(ObjectRepository.descriptionCompStruct,"well good best");

		click(ObjectRepository.saveCompStruct);
	}

	@Test
	public void companyProperty() {

		login();

		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.companyinfo);

		click(ObjectRepository.companyProperty);

		switchBetweenFrames(0);

		click(ObjectRepository.addProperty);

		sendKeys(ObjectRepository.propertyName,"GuestHouse");

		click(ObjectRepository.saveCompProperty);
	}

}
