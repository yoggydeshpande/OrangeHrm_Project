package scripts;

import org.testng.annotations.Test;

import genericlibrary.WebDriverMethods;
import pages.ObjectRepository;

public class Data_Import_Export extends WebDriverMethods {

	public void login() {

		sendKeys(ObjectRepository.logInName,"admin");

		sendKeys(ObjectRepository.passwordText,"admin");

		click(ObjectRepository.logInButton);
	}

	@Test (priority = 0)
	public void defineCustomExport() throws InterruptedException {

		login();

		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.dataImportExport);

		click(ObjectRepository.defineCustomExport);

		switchBetweenFrames(0);

		click(ObjectRepository.addCustomExportDefinitions);

		sendKeys(ObjectRepository.nameCustomExport,"IPL");

		click(ObjectRepository.saveCustomExport);
				
		getTextFromPopUp();
				
		dismisPopUp();

		dropDownActions(ObjectRepository.exportAvailableFiels,"lastName");
		
		Thread.sleep(1000);

		dropDownActionByValue(ObjectRepository.exportAvailableFiels,"middleName");

		dropDownActionByValue(ObjectRepository.exportAvailableFiels,"city");

		dropDownActionByValue(ObjectRepository.exportAvailableFiels,"birthDate");

		dropDownActionByValue(ObjectRepository.exportAvailableFiels,"empId");

		click(ObjectRepository.addCustomExport);

		click(ObjectRepository.exportMoveUp); 

		click(ObjectRepository.exportMoveDown);

		click(ObjectRepository.saveCustomExport);

		click(ObjectRepository.saveCSVcustomReport);

//		click(ObjectRepository.selectCustomExport);
//
//		click(ObjectRepository.deleteCustomExport);
//
//		getTextFromPopUp();
//
//		acceptPopUp();
		
		switchBackToDefaultContent();
	}
	
	
	@Test (priority = 1)
	
	public void export (){
		
		//login();
		
		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.dataImportExport);

		click(ObjectRepository.export);
		
		switchBetweenFrames(0);
		
		dropDownActionByValue(ObjectRepository.selectExportType,"4");
		
		click(ObjectRepository.exportBtn);
		
		switchBackToDefaultContent();
		
		}


	@Test (priority = 2)
	public void defineCustomImport() throws InterruptedException {
		
		//login();

		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.dataImportExport);
		
		click(ObjectRepository.defineCustomImport);
		
		switchBetweenFrames(0);
		
		click(ObjectRepository.addCustomImport);
		
		sendKeys(ObjectRepository.nameCustomImport,"POP");
		
		dropDownActionByValue(ObjectRepository.importAvailableFields,"workStation");

		dropDownActionByValue(ObjectRepository.importAvailableFields,"MobilePhone");
		
		dropDownActionByValue(ObjectRepository.importAvailableFields,"ssn");
		
		dropDownActionByValue(ObjectRepository.importAvailableFields,"DD1AmountCode");
		
		dropDownActionByValue(ObjectRepository.importAvailableFields,"DD2AmountCode");
		
		Thread.sleep(1000);
		
		click(ObjectRepository.addCustomImportFields);

		click(ObjectRepository.importMoveUp);

		click(ObjectRepository.importMoveDown);
		
		dropDownActionByValue(ObjectRepository.importAssignedFields,"DD1AmountCode");
		
		dropDownActionByValue(ObjectRepository.importAssignedFields,"DD2AmountCode");
		
		click(ObjectRepository.removeCustomImportFields);
		
		click(ObjectRepository.saveCustomImport);
		
		switchBackToDefaultContent();
		
		}


	@Test (priority = 3)
	public void importsCSV() throws InterruptedException {

		//login();

		mouseOver(ObjectRepository.admin);

		mouseOver(ObjectRepository.dataImportExport);

		click(ObjectRepository.imports);
		
		switchBetweenFrames(0);
		
		dropDownActionByValue(ObjectRepository.selectImportType,"1");
		
		Thread.sleep(1000);

		sendKeys(ObjectRepository.importFileBtn,"E:\\Millenium Payroll Export.csv");

		click(ObjectRepository.importBtn);
		
		switchBackToDefaultContent();
		
	}
}
