package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobSearchDataSet")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Bradford", " 5 miles ", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Bradford"},
                {"Automation Tester", "Leeds", " 2 miles ", "40000", "600000", "Per day", "Permanent", "Permanent Automation Tester jobs in Leeds"},
                {"Manual Tester", "Manchester", " 7 miles ", "45000", "650000", "Per month", "Permanent", "Permanent Manual Tester jobs in Manchester"},
                {"Supply Chain Administrator", "Cleckheaton", " 5 miles ", "35000", "200000", "Per month", "Part Time", "Part Time Supply Chain Administrator jobs in Cleckheaton"},
                {"Test Analyst", "Halifax", " 10 miles ", "45000", "650000", "Per day", "Contract", "Contract Test Analyst jobs in Halifax"},
                {"Customer Service advisor", "Leeds", " 5 miles ", "40000", "600000", "Per annum", "Permanent", "Permanent Customer Service advisor jobs in Leeds"}

        };
        return data;
    }
}
