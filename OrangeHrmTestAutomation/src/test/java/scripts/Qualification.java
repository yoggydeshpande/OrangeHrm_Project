package scripts;

import genericlibrary.WebDriverMethods;
import org.testng.annotations.Test;
import pages.ObjectRepository;

public class Qualification extends WebDriverMethods{

	public void login() {
		
		sendKeys(ObjectRepository.logInName,"admin");
		
		sendKeys(ObjectRepository.passwordText,"admin");
		
		click(ObjectRepository.logInButton);
	}
	@Test
	public void education() throws InterruptedException {
		
		 login();
		
		 mouseOver(ObjectRepository.admin);
		 
		 mouseOver(ObjectRepository.qualification);
		 
		 click(ObjectRepository.education);
		 
		 switchBetweenFrames(0);
			
	     click(ObjectRepository.addEducation);
	     
	     sendKeys(ObjectRepository.instituteName,"GHI");
	     
	     sendKeys(ObjectRepository.courseEducation,"HR");
	     
	     click(ObjectRepository.saveEducation);
	     
	 	 Thread.sleep(1000);
	     
	     switchBackToDefaultContent();
	     
	}
	
	@Test 
	public void licenses() throws InterruptedException {
		 
		//login();
			
		 mouseOver(ObjectRepository.admin);
		 
		 mouseOver(ObjectRepository.qualification);
		 
		 click(ObjectRepository.licenses);
		 
		 switchBetweenFrames(0);
			
	     click(ObjectRepository.addLicenses);
	     
	     sendKeys(ObjectRepository.descriptionLicense,"WZS");
	     
	     click(ObjectRepository.saveLicenseInfo);
	     
	 	 Thread.sleep(1000);
		 
	     switchBackToDefaultContent();
	     
	}
}
