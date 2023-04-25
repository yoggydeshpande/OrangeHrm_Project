package genericlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {
	PropertiesFile propertyfile=new PropertiesFile();
	WebDriver driver; // object created for ChromeDriver, opens webbrowser 
	Actions actions;
	Select select;
	WebDriverWait wait;
	int WAITFOREXPLICITWAITINSEC=5;

	public void dropDownActions(By by,String text) {
		WebElement dropdown = driver.findElement(by);
		select =new Select(dropdown);
		select.selectByVisibleText(text);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		System.out.println("No.of options: "+size);
		for(WebElement ele:list) {
			String result = ele.getText();
			System.out.println(result);
		}
	}

	public void dropDownActionByValue(By by,String value) {
		WebElement dropdown = driver.findElement(by);
		select =new Select(dropdown);
		select.selectByValue(value);
	}

	public static String[] getMonthYear(String monthYear) {
		return monthYear.split(" ");
	}

	public void selectDate(By monthyearval,By nextOrPreviousYear,By nextOrPreviousMonth,By date,String exptMonth,String exptYear) throws Exception {

		//		Calendar calendar=Calendar.getInstance();
		//		String targetDate="27-Sep-1998";
		//		SimpleDateFormat targetDateFormat=new SimpleDateFormat("dd-mmm-yyyy");
		//		Date formattedTargetDate;
		//			targetDateFormat.setLenient(false);
		//			formattedTargetDate=targetDateFormat.parse(targetDate);
		//			calendar.setTime(formattedTargetDate);
		//			int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
		//			int targetMonth=calendar.get(Calendar.MONTH);
		//			int targetYear=calendar.get(Calendar.YEAR);
		//			
		//			String actualDate=driver.findElement(monthyearval).getText();
		//			calendar.setTime(new SimpleDateFormat("mmm yyyy").parse(actualDate));
		//		
		//		  int actualMonth=calendar.get(calendar.MONTH);
		//		  int actualYear=calendar.get(calendar.YEAR);
		//		  while(targetMonth < actualMonth || targetYear < actualYear) {
		//			  driver.findElement(nextOrPreviousMonth).click();
		//			  actualDate=driver.findElement(monthyearval).getText();
		//			  calendar.setTime(new SimpleDateFormat("mmm yyyy").parse(actualDate));
		//			  
		//			  actualMonth=calendar.get(calendar.MONTH);
		//			  actualYear=calendar.get(calendar.YEAR);
		//			  driver.findElement(date).click();
		//		  }


		String monthYearVal = driver.findElement(monthyearval).getText();
		System.out.println(monthYearVal);
		while(!(getMonthYear(monthYearVal)[0].equals(exptMonth)&&
				getMonthYear(monthYearVal)[1].equals(exptYear))) {
			driver.findElement(nextOrPreviousMonth).click();
			monthYearVal=driver.findElement(monthyearval).getText();
			driver.findElement(date).click();
		}
		//driver.findElement(date).click();
	}

	public String getAttribute(By by) {
		return driver.findElement(by).getAttribute("value");
	}

	public void acceptPopUp() {
		driver.switchTo().alert().accept();
	}

	public void switchTOpopUpAlert() {
		driver.switchTo().alert();
	}

	public void dismisPopUp() {
		driver.switchTo().alert().dismiss();	
	}

	public void getTextFromPopUp() {  
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}


	public void close() {
		if(driver!=null)
			driver.close(); 
	}

	public void quit() {
		if(driver!=null)
			driver.quit();
	}

	public void clear(By by) {
		driver.findElement(by).clear();
	}

	public void clearText(By ele,String text) {
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElementValue(ele, text));
		driver.findElement(ele).clear();
	}

	public void click(By element) {
		//isEnabled(element);
		driver.findElement(element).click();
	}
	public void sendKeys(By by,String Text) {
		driver.findElement(by).sendKeys(Text);
	}
	public void isAlertPresent() {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public boolean isSelected(By by) {
		return driver.findElement(by).isSelected();
	}
	public boolean isDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}
	public boolean isEnabled(By by) {
		return driver.findElement(by).isEnabled();
	}

	public void waitUntilElementIsVisible(By by) {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitUntilElementToClickable(By by) {
		wait =new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public boolean isMultiple(By by) {
		select=new Select (driver.findElement(by));
		return select.isMultiple();
	}

	public String getTheCurrentWebPageTitle() {
		return driver.getTitle();
	}

	public String getTheCurrentWebPageUrl(){
		return driver.getCurrentUrl();
	}

	public void mouseOver(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.moveToElement(element).perform();

	}
	public void rightClick(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.contextClick(element).perform();
	}
	public void doubleClick(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}
	public void autoSuggestions(By by,String text) {
		select=new Select(driver.findElement(by));
		select.selectByVisibleText(text);
	}

	public void sendKeysArrowDown(By by,Keys arrowDown) {
		driver.findElement(by).sendKeys(arrowDown);

	}
	public void sendKeysEnter(By by,Keys enter) {
		driver.findElement(by).sendKeys(enter);
	}
	public void switchBetweenFrames(int index) {
		driver.switchTo().frame(index);
	}
	public void switchBackToDefaultContent() {
		driver.switchTo().defaultContent();
	}
	public void switchBetweenTab() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		if(child.size()==2) {
			for(String b:child) {
				if(!b.equals(parent)) {
					driver.switchTo().window(b);
					String title = driver.getTitle();
					String currentUrl = driver.getCurrentUrl();
					System.out.println(title);
					System.out.println(currentUrl);
					//close();
				}
			}
		}
		//driver.switchTo().window(parent);
	}

	public void switchBetweenTabs() {
		String targetWindowHandle=driver.getWindowHandle();
		// Get a list of all available windows
		Set<String> handles = driver.getWindowHandles();

		// Check if the window you want to interact with is still open
		if (!handles.contains(targetWindowHandle)) {
			// The window has been closed, so handle the situation accordingly
			System.out.println("Target window has been closed");
		} else {
			// Switch to the target window and interact with it
			driver.switchTo().window(targetWindowHandle);
			// Perform actions on the target window
		}
	}
	public void arrowDown(By by) {
		WebElement textbox=driver.findElement(by);
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);

	}

	public void scrollBar(By by) {
		WebElement element = driver.findElement(by);
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void navigateToBackwardOnWebPage() {
		driver.navigate().back();
	}
	public void nevigateToForwardOnWebPage() {
		driver.navigate().forward();
	}
	public void reloadWebPage() {
		driver.navigate().refresh();
	}
	public void switchWindows() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Iterator<String>itr=child.iterator();
		while(itr.hasNext()) {
			String child2 = itr.next();
			if(!parent.equalsIgnoreCase(child2)) {
				driver.switchTo().window(child2);
				String title = driver.getTitle();
				String currentUrl = driver.getCurrentUrl();
				System.out.println(title);
				System.out.println(currentUrl);
			}
		}
		//driver.switchTo().window(parent);
	}
	public void getscreenshot(String screenshotName) throws IOException
	{
		// Create a date object representing today's date
		Date today=new Date();

		// Create a SimpleDateFormat instance with the desired format
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");

		// Format the date as a string
		String formattedDate = dateFormat.format(today);

		//String currentdate = d.toString().replace(": ", "-").replace(" ",",");
		System.out.println(formattedDate);
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.photoPath+screenshotName+".png");
		FileUtils.copyFile(src,dest);
		System.out.println("Screenshot taken");
	}

	public String excelSheet(String path,String sheetName,int rowValue,int cellValue) throws EncryptedDocumentException, IOException   {
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String user = wb.getSheet(sheetName).getRow(rowValue).getCell(cellValue).getStringCellValue(); 
		return user;
	}


	@BeforeClass
	public void initApplication() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(propertyfile.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterMethod

	public void closeAppAndResult(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			getscreenshot(result.getTestName());
		}
		
	}
	@AfterClass
	public void closeApp() {
		quit();
	}
}
