package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultsPage;
import uk.co.library.testBase.BaseTest;

public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultsPage resultPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultsPage();
    }


    @Test(dataProvider = "jobSearchDataSet", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) {
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();

        verifyText(resultPage.getResultText(),result);

    }
}








