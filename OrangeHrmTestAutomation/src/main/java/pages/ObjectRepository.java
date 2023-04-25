package pages;

import org.openqa.selenium.By;

public class ObjectRepository {

	public static By logInName=By.name("txtUserName");

	public static By passwordText=By.name("txtPassword");

	public static By logInButton=By.name("Submit");

	public static By invalidLogin=By.xpath("//font[text()='Invalid Login']");

	public static By clearButton=By.name("clear");

	public static By orangeHRMLink=By.xpath("//a[text()='OrangeHRM']");

	public static By searchBy=By.id("loc_code");

	public static By addButton=By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]");

	public static By deleteButton=By.xpath("(//input[@class='plainbtn'])[4]");

	public static By searchForText=By.id("loc_name");

	public static By searchButton=By.xpath("//input[@onclick='returnSearch();']");

	public static By resetButton=By.xpath("//input[@onclick='clear_form();']");

	public static By saveButton=By.id("editBtn");

	public static By companyInfoResetButton=By.xpath("//input[@value='Reset']");

	public static By employeeId =By.xpath("//a[contains(text(),'Employee Id')]");

	public static By employeeName=By.xpath("//a[text()='Employee Name ']");

	public static By  jobTitle=By.xpath("//a[text()='Job Title']");

	public static By employeeStatus=By.xpath("//a[text()='Employment status']");

	public static By subDivision=By.xpath("//a[text()='Sub-Division']");

	public static By supervisor=By.xpath("//a[text()='Supervisor']");

	public static By admin=By.id("admin");

	public static By pim=By.xpath("//span[text()='PIM']");

	public static By leave=By.xpath("//span[text()='Leave']");

	public static By time=By.xpath("//span[text()='Time']");

	public static By recruitment=By.xpath("//span[text()='Recruitment']");

	public static By performance=By.xpath("//span[text()='Performance']");

	public static By reports=By.xpath("//span[text()='Reports']");

	public static By bugTracker=By.xpath("//span[text()='Bug Tracker']");

	public static By help=By.xpath("//span[text()='Help']");

	public static By changePassword=By.xpath("//a[text()='Change Password']");

	public static By logout=By.xpath("//a[text()='Logout']");

	public static By companyinfo=By.xpath("//span[text()='Company Info']");

	public static By job=By.xpath("//span[text()='Job']");

	public static By qualification=By.xpath("//span[text()='Qualification']");

	public static By membership=By.xpath("(//span[text()='Memberships'])[1]");

	public static By nationalityAndRace=By.xpath("//span[text()='Nationality & Race']");

	public static By users=By.xpath("//span[text()='Users']");

	public static By emailNotifications=By.xpath("//span[text()='Email Notifications']");

	public static By prjectInfo=By.xpath("//span[text()='Project Info']");

	public static By dataImportExport=By.xpath("//span[text()='Data Import/Export']");

	public static By cutomFields=By.xpath("//span[text()='Custom Fields']");

	public static By employeeList=By.xpath("//span[text()='Employee List']");

	public static By addEmployee=By.xpath("//span[text()='Add Employee']");

	public static By leaveSummary=By.xpath( "//span[text()='Leave Summary']");

	public static By defineDaysOff=By.xpath("//span[text()='Define Days Off']");

	public static By defineLeaveType=By.xpath("//span[text()='Define Leave Types']");

	public static By assignLeave=By.xpath("//span[text()='Assign Leave']");

	public static By leaveList=By.xpath("//span[text()='Leave List']");

	public static By timesheets=By.xpath("//span[text()='Timesheets']");

	public static By attendance=By.xpath("//span[text()='Attendance']");

	public static By employeeReports= By.xpath("(//span[text()='Employee Reports'])[1]");

	public static By projectReport= By.xpath("//span[text()='Project Reports']");

	public static By workShifts= By.xpath("//span[text()='Work shifts']");

	public static By healthSavingsPlan=By.xpath("//span[text()='Health savings plan']");

	public static By payrollSchedule=By.xpath("//span[text()='Payroll schedule']");

	public static By jobVacancies=By.xpath("//span[text()='Job Vacancies']");

	public static By Applicants=By.xpath("//span[text()='Applicants']");

	public static By KPIList=By.xpath("//span[text()='KPI List']");

	public static By addKPI=By.xpath("//span[text()='Add KPI']");

	public static By copyKPI=By.xpath("//span[text()='Copy KPI']");

	public static By addReview=By.xpath("//span[text()='Add Review']");

	public static By reviews=By.xpath("//span[text()='Reviews']");

	public static By viewReports=By.xpath("//span[text()='View Reports']");

	public static By defineReports=By.xpath("//span[text()='Define Reports']");

	public static By helpContents=By.xpath("//span[text()='Help Contents']");

	public static By support=By.xpath("//span[text()='Support']");

	public static By forum=By.xpath("//span[text()='Forum']");

	public static By General=By.xpath("//span[text()='General']");

	public static By locations=By.xpath("//span[text()='Locations']");

	public static By companyStructure=By.xpath("//span[text()='Company Structure']");

	public static By companyProperty=By.xpath("//span[text()='Company Property']");

	public static By jobTitles=By.xpath("//span[text()='Job Titles']");

	public static By jobSpecifications=By.xpath("//span[text()='Job Specifications']");

	public static By payGrades=By.xpath("//span[text()='Pay Grades']");

	public static By employmentStatus=By.xpath("//span[text()='Employment Status']");

	public static By EEOJobCategories=By.xpath("//span[text()='EEO Job Categories']");

	public static By education=By.xpath("//span[text()='Education']");

	public static By licenses=By.xpath("//span[text()='Licenses']");

	public static By skills=By.xpath("(//span[text()='Skills'])[1]");

	public static By languages=By.xpath("//span[text()='Languages']");

	public static By membershipTypes=By.xpath("//span[text()='Membership Types']");

	public static By memberships=By.xpath("(//span[text()='Memberships'])[2]");

	public static By nationality=By.xpath("//span[text()='Nationality']");

	public static By ethnicRaces=By.xpath("//span[text()='Ethnic Races']");

	public static By HRAdminUsers=By.xpath("//span[text()='HR Admin Users']");

	public static By ESSUsers=By.xpath("//span[text()='ESS Users']");

	public static By adminUserGroups=By.xpath("//span[text()='Admin User Groups']");

	public static By configuration=By.xpath("//span[text()='Configuration']");

	public static By subscribe=By.xpath("//span[text()='Subscribe']");

	public static By customers=By.xpath("//span[text()='Customers']");

	public static By projects=By.xpath("//span[text()='Projects']");

	public static By projectActivities=By.xpath("//span[text()='Project Activities']");

	public static By defineCustomExport=By.xpath("//span[text()='Define Custom Export']");

	public static By export=By.xpath("//span[text()='Export']");

	public static By defineCustomImport=By.xpath("//span[text()='Define Custom Import']");

	public static By imports=By.xpath("//span[text()='Import']");

	public static By employeeLeaveSummary=By.xpath("//span[text()='Employee Leave Summary']");

	public static By daysOff=By.xpath("//span[text()='Days Off']");

	public static By specificHolidays=By.xpath("//span[text()='Specific Holidays']");

	public static By printTimesheets=By.xpath("//span[text()='Print Timesheets']");

	public static By employeetimesheets=By.xpath("//span[text()='Employee timesheets']");

	public static By employeeReports2=By.xpath("(//span[text()='Employee Reports'])[2]");

	public static By configuration2=By.xpath("//span[text()='Configuration']");

	public static By viewPayrollSchedule=By.xpath("//span[text()='View Payroll Schedule']");

	public static By addPayPeriod=By.xpath("//span[text()='Add Pay Period']");

	public static By defineHSP=By.xpath("//span[text()='Define HSP ']");

	public static By employeeHSPSummary=By.xpath("//span[text()='Employee HSP Summary']");

	public static By HSPPaymentsDue=By.xpath("//span[text()='HSP Payments Due']");

	public static By HSPExpenditures=By.xpath("//span[text()='HSP Expenditures']");

	public static By HSPUsed=By.xpath("//span[text()='HSP Used']a");

	public static By WelcomeAdmin=By.xpath("//li[text()='Welcome admin']");

	public static By EmpId=By.xpath("//option[text()=\"Emp. ID\"]");

	public static By editButton=By.id("editBtn");

	public static By oldPassword=By.id("txtOldPassword");

	public static By newPassword=By.id("txtNewPassword");

	public static By confirmPassword=By.id("txtConfirmPassword");

	public static By savePassword=By.xpath("(//input[@class='savebutton'])[2]");

	public static By addEmployeeCode=By.id("txtEmployeeId");

	public static By lastEmpName=By.id("txtEmpLastName");

	public static By empMiddleName=By.id("txtEmpMiddleName");

	public static By empFirstName=By.name("txtEmpFirstName");

	public static By empNickName=By.id("txtEmpNickName");

	public static By chooseFileButton=By.id("photofile");

	public static By saveEmpButton =By.id("btnEdit");

	public static By resetEmpButton =By.xpath("//input[@class='resetbutton']");

	public static By editComInfo =By.id("editBtn");

	public static By companyName =By.name("txtCompanyName");

	public static By taxId =By.name("txtTaxID");

	public static By  NAICS =By.id("txtNAICS");

	public static By phoneNo =By.id("txtPhone");

	public static By fax=By.id("txtFax");

	public static By country =By.name("cmbCountry");

	public static By address1ComInfoGeneral =By.name("txtStreet1");

	public static By address2ComInfoGeneral=By.name("txtStreet2");

	public static By city=By.name("cmbCity");

	public static By stateOrProvision =By.id("txtState");

	public static By zipCode=By.id("txtZIP");

	public static By comments=By.id("txtComments");

	public static By saveCompanyInfo =By.xpath("//input[@value='Save']");

	public static By noTimeSheetFound=By.xpath("//span[text()='No timesheet found']");

	public static By timeEmployeeName=By.name("cmbRepEmpID");

	public static By timeViewButton=By.name("btnView");

	public static By listedEmpName=By.xpath("//a[contains(text(),'Yogesh Vijay Deshpande')]");

	public static By editEmpDetails=By.name("EditMain");

	public static By ssnNo=By.name("txtNICNo");

	public static By sinNo=By.name("txtSINNo");

	public static By otherId=By.name("txtOtherID");

	public static By dobCalender=By.name("btnDOB");
	
	public static By maritalStatus=By.name("cmbMarital");
	
	public static By genderSelect=By.id("gender1");
	
	public static By driverLicense=By.name("txtLicenNo");
	
	public static By militaryService=By.name("txtMilitarySer");
	
	public static By ethnicRace=By.id("cmbEthnicRace");
	
	public static By licenseExpiry=By.name("btnLicExpDate");
	
	public static By saveEmpDetails=By.name("EditMain");
	
	public static By empNamePhoto=By.id("empname");
	
	public static By savePhoto=By.xpath("(//input [@class='savebutton'])[17]");
	
	public static By backButton=By.xpath("//input [@class='backbutton']");
	
	public static By nextMonth=By.xpath("//a[@title='Next month']");
	
	public static By previousMonth=By.xpath("//a[@title='Previous month']");
	
	public static By nextYear=By.xpath("//a[@title='Next year']");
	
	public static By previousYear=By.xpath("//a[@title='Previous year']");
	
	public static By monthYearVal=By.xpath("//div[@class='calheader']");
	
	public static By date=By.xpath("//table[@class='yui-calendar y1998']//td[contains(@class,'calcell wd0 d27 selectable calcellright ')]/a[text()=27]");
	
	public static By licenseExpCal=By.name("btnLicExpDate");
	
	public static By bugTrackerSaveBtn=By.id("saveBtn");
	
	public static By category=By.id("category_id");
	
	public static By bugModule=By.id("cmbModule");
	
	public static By priority=By.id("priority");
	
	public static By summary=By.id("summary");
	
	public static By mailBugReport=By.id("txtEmail");
	
	public static By description=By.id("txtDescription");
	
	public static By firstDayOfWeek=By.id("cmbStartDay");
	
	public static By saveTime=By.id("btnSubmit");
	
	public static By addLocation=By.xpath("//input[@value='Add']");
	
	public static By nameLocation=By.id("txtLocDescription");
	
	public static By countryLoc=By.id("cmbCountry");
	
	public static By stateLoc=By.id("txtState");
	
	public static By cityLoc=By.id("cmbDistrict");
	
	public static By addressLoc=By.id("txtAddress");
	
	public static By zipcodeLoc=By.id("txtZIP");
	
	public static By phoneLoc=By.id("txtPhone");
	
	public static By faxLoc=By.id("txtFax");
	
	public static By commentsLoc=By.id("txtComments");
	
	public static By saveLocation=By.id("editBtn");
	
	public static By clickLoc3=By.xpath("//input[@value='LOC003']");
	
	public static By clickLoc2=By.xpath("//input[@value='LOC002']");
	
	public static By deleteLocation=By.xpath("//input[@value='Delete']");
	
	public static By addCompanyStructure=By.xpath("//a[@class='add']");
	
	public static By departIdCompStruct=By.id("txtDeptId");
	
	public static By nameCompStruct=By.id("txtTitle");
	
	public static By typeCompStruct=By.id("cmbType");
	
	public static By locationCompStruct=By.id("cmbLocation");
	
	public static By descriptionCompStruct=By.id("txtDesc");
	
	public static By saveCompStruct=By.xpath("(//input[@value='Save'])[1]");
	
	public static By resetCompStruct=By.xpath("(//input[@value='Reset'])[1]");
	
	public static By hideCompStruct=By.xpath("//input[@value='Hide']");
	
	public static By addProperty=By.xpath("//input[@value='Add']");
	
	public static By propertyName=By.id("txtPropertyName");
	
	public static By saveCompProperty=By.id("saveBtn");
	
	public static By addEducation=By.xpath("//input[@value='Add']");
	
	public static By instituteName=By.id("txtUni");
	
	public static By courseEducation=By.id("txtDeg");
	
	public static By saveEducation=By.xpath("//input[@value='Save']");
	
	public static By addLicenses=By.xpath("//input[@value='Add']");
	
	public static By deleteLicenses=By.xpath("//input[@value='Delete']");
	
	public static By descriptionLicense=By.id("txtLicensesDesc");
	
	public static By saveLicenseInfo=By.id("editBtn");
	
	public static By resetLicenseInfo=By.xpath("//input[@value='Reset']");
	
	public static By addCustomExportDefinitions=By.xpath("//input[@value='Add']");
	
	public static By nameCustomExport=By.id("txtFieldName");
	
	public static By saveCustomExport=By.xpath("//input[@value='Save']");
	
	public static By resetCustomExport=By.xpath("//input[@value='Reset']");
	
	public static By addCustomExport=By.id("btnAssignField");
	
	public static By exportAsssignedFields=By.id("cmbAssignedFields");
	
	public static By removeCustomExportFields=By.id("btnRemoveField");
	
	public static By exportMoveUp=By.id("btnMoveUp");
	
	public static By exportMoveDown=By.id("btnMoveDown");
	
	public static By exportAvailableFiels=By.id("cmbAvailableFields");
	
	public static By saveCSVcustomReport=By.xpath("//input[@value='Save']");
	
	public static By selectCustomExport=By.xpath("//input[@value='3']");
	
	public static By deleteCustomExport=By.xpath("//input[@value='Delete']");
	
	public static By importFileBtn=By.id("importFile");
	
	public static By importBtn=By.id("btnImport");
	
	public static By addCustomImport=By.xpath("//input[@value='Add']");
	
	public static By deleteCustomImport=By.xpath("//input[@value='Delete']");
	
	public static By nameCustomImport=By.id("txtFieldName");
	
	public static By saveCustomImport=By.xpath("//input[@value='Save']");
	
	public static By addCustomImportFields=By.id("btnAssignField");
	
	public static By removeCustomImportFields=By.id("btnRemoveField");
	
	public static By importAvailableFields=By.id("cmbAvailableFields");
	
	public static By importAssignedFields=By.id("cmbAssignedFields");
	
	public static By importMoveUp=By.id("btnMoveUp");
	
	public static By importMoveDown=By.id("btnMoveDown");
	
	public static By selectImportType=By.id("cmbImportType");
	
	public static By selectExportType=By.id("cmbExportType");
	
	public static By exportBtn=By.id("btnExport");
	
	public static By yearLeaveType=By.name("year");
	
	public static By empNameLeaveType=By.name("cmbId");
	
	public static By leaveType=By.name("leaveTypeId");
	
	public static By viewEmpNameLeaveType=By.id("btnView");
	
	public static By onclickSelectEmployee=By.xpath("//input[@onclick='returnEmpDetail();']");
	
	public static By casualLeaveEntitled=By.name("txtLeaveEntitled[]");
	
	public static By medicalLeaveEntitled=By.name("txtLeaveEntitled[]");
	
	public static By saveleaveSummary=By.xpath("//input[@value='Save']");
	
	public static By editleaveSummary=By.xpath("//input[@value='Edit']");
	
	public static By selectNameForLeaveType=By.xpath("(//a[@href='#'])[2]");
	
	public static By fromPerformanceReview=By.id("fromButton");
	
	public static By toPerformanceReview=By.id("toButton");
	
	public static By jobTitlePerformanceReview=By.id("txtJobTitleCode");
	
	public static By subDivisionPerformanceReview=By.id("txtSubDivisionId");
	
	public static By employeePerformanceReview=By.id("txtEmpName");
	
	public static By reviewerPerformanceReview=By.id("txtReviewerName");
	
	public static By searchBtnPerformanceReview=By.id("searchButton");
	
	public static By clearBtnPerformanceReview=By.id("clearBtn");
	
	public static By selectMonthFromCalender=By.xpath("//select[@class='ui-datepicker-month']");
	
	public static By selectYearFromCalender=By.xpath("//select[@class='ui-datepicker-year']");
	
	public static By selectDateFromCalender=By.xpath("//a[text()='14']");
	
	public static By monthToCalender=By.xpath("//select[@class='ui-datepicker-month']");
	
	public static By yearToCalender=By.xpath("//select[@class='ui-datepicker-year']");
	
	public static By dateToCalender=By.xpath("//a[text()='15']");
	
	public static By empNameAddPR=By.id("txtEmpName-0");
	
	public static By reviewerNameAddPR=By.id("txtReviewerName-0");
	
	public static By fromCalenderAddPR=By.id("fromButton");
	
	public static By toCalenderAssPR=By.id("toButton");
	
	public static By dueDateAddPR=By.id("dueButton");
	
	public static By saveBtnAddPR=By.id("saveBtn");
	
	public static By clearBtnAddPR=By.id("resetBtn");
	
	public static By fromMonthAddPR=By.xpath("//select[@class='ui-datepicker-month']");
	
	public static By fromYearAddPR=By.xpath("//select[@class='ui-datepicker-year']");
	
	public static By fromDateAddPR=By.xpath("//a[text()='20']");
	
	public static By toMonthAddPR=By.xpath("//select[@class='ui-datepicker-month']");
	
	public static By toYearAddPR=By.xpath("//select[@class='ui-datepicker-year']");
	
	public static By toDateAddPR=By.xpath("//a[text()='21']");
	
	public static By dueMonthAddPR=By.xpath("//select[@class='ui-datepicker-month']");
	
	public static By dueYearAddPR=By.xpath("//select[@class='ui-datepicker-year']");
	
	public static By dueDayDateAddPR=By.xpath("//a[text()='25']");
	
	public static By autosuggestedEmpName=By.xpath("//li[@class='ac_even ac_over']");
	
	public static By reviewerSuggestedName=By.xpath("//li[@class='ac_even ac_over']");
}
