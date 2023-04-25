package scripts;

import org.testng.annotations.Test;

import genericlibrary.WebDriverMethods;
import pages.ObjectRepository;

public class Leave extends WebDriverMethods{

	 public void login() {
		 sendKeys(ObjectRepository.logInName,"admin");
			
			sendKeys(ObjectRepository.passwordText,"admin");
			
			click(ObjectRepository.logInButton);
	 }
	 
	 @Test
	 public void selectLeaveType() throws InterruptedException {
		 
		 login();
		 
		 mouseOver(ObjectRepository.leave);
		 
		 mouseOver(ObjectRepository.leaveSummary);
		 
		 click(ObjectRepository.employeeLeaveSummary);
		 
		 switchBetweenFrames(0);
		 
		 dropDownActionByValue(ObjectRepository.yearLeaveType,"2023");
		 
		 dropDownActionByValue(ObjectRepository.empNameLeaveType,"1");
		 
		 dropDownActionByValue(ObjectRepository.leaveType,"0");
		 
		 click(ObjectRepository.onclickSelectEmployee);
		 
		 switchBetweenTab();
		 
		 Thread.sleep(1000);
		 
		 click(ObjectRepository.selectNameForLeaveType);
		 
		 switchBackToDefaultContent();
		 
		 waitUntilElementToClickable(ObjectRepository.viewEmpNameLeaveType);
		 
		 click(ObjectRepository.viewEmpNameLeaveType);
		 
		 click(ObjectRepository.editleaveSummary);
		 
		 sendKeys(ObjectRepository.casualLeaveEntitled,"10");
		 
		 sendKeys(ObjectRepository.medicalLeaveEntitled,"10");
		 
		 click(ObjectRepository.saveleaveSummary);
	 }
}
