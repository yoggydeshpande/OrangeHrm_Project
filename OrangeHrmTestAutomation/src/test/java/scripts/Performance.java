package scripts;

import org.testng.annotations.Test;

import genericlibrary.WebDriverMethods;
import pages.ObjectRepository;

public class Performance  extends WebDriverMethods {
	
    public void login() {
	
	sendKeys(ObjectRepository.logInName,"admin");
	
	sendKeys(ObjectRepository.passwordText,"admin");
	
	click(ObjectRepository.logInButton);
  }
    
    @Test
    public void reviews() {
    	
    	login();
    	
    	mouseOver(ObjectRepository.performance);
    	
    	click(ObjectRepository.reviews);
    	
    	switchBetweenFrames(0);
    	
    }
    
    @Test
    public void addPerformanceReview() throws InterruptedException {
        
    	login();
    	
    	mouseOver(ObjectRepository.performance);
    	
    	click(ObjectRepository.addReview);
    	
    	switchBetweenFrames(0);
    	
    	clear(ObjectRepository.empNameAddPR);
    	
    	sendKeys(ObjectRepository.empNameAddPR,"Yogesh");
    	
    	click(ObjectRepository.autosuggestedEmpName);
    	
    	clear(ObjectRepository.reviewerNameAddPR);
    	
    	sendKeys(ObjectRepository.reviewerNameAddPR,"Yogesh Deshpande");
    	
    	click(ObjectRepository.reviewerSuggestedName);
    	
    	waitUntilElementToClickable(ObjectRepository.fromCalenderAddPR);
    	
    	click(ObjectRepository.fromCalenderAddPR);
    	
    	isSelected(ObjectRepository.fromCalenderAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.fromMonthAddPR);
    	
    	dropDownActionByValue(ObjectRepository.fromMonthAddPR,"5");
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.fromYearAddPR);
    	
    	dropDownActionByValue(ObjectRepository.fromYearAddPR,"2023");
    	
    	isSelected(ObjectRepository.fromYearAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.toCalenderAssPR);
    	
    	click(ObjectRepository.fromDateAddPR);
    	
    	isSelected(ObjectRepository.fromDateAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.toCalenderAssPR);
    	
    	click(ObjectRepository.toCalenderAssPR);
    	
    	isSelected(ObjectRepository.toCalenderAssPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.toMonthAddPR);
    	
    	dropDownActionByValue(ObjectRepository.toMonthAddPR,"7");
    	
    	isSelected(ObjectRepository.toMonthAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.toYearAddPR);
    	
    	dropDownActionByValue(ObjectRepository.toYearAddPR,"2024");
    	
    	isSelected(ObjectRepository.toYearAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.toDateAddPR);
    	
    	click(ObjectRepository.toDateAddPR);
    	
    	isSelected(ObjectRepository.toDateAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.dueDateAddPR);
    			
    	click(ObjectRepository.dueDateAddPR);
    	
    	isSelected(ObjectRepository.dueDateAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.dueMonthAddPR);
    	
    	dropDownActionByValue(ObjectRepository.dueMonthAddPR,"8");
    	
    	isSelected(ObjectRepository.dueMonthAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.dueYearAddPR);
    	
    	dropDownActionByValue(ObjectRepository.dueYearAddPR,"2025");
    	
    	isSelected(ObjectRepository.dueYearAddPR);
    	
    	//Thread.sleep(1000);
    	
    	waitUntilElementToClickable(ObjectRepository.dueDayDateAddPR);
    	
    	click(ObjectRepository.dueDayDateAddPR);
    	
    	isSelected(ObjectRepository.dueDayDateAddPR);
    	
    	click(ObjectRepository.saveBtnAddPR);
    	
    	isSelected(ObjectRepository.saveBtnAddPR);
    }
}
