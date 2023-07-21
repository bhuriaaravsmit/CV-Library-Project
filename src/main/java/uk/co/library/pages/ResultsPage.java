package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultsPage extends Utility {



    @CacheLookup
        @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public WebElement getResultText() {
        return resultText;
    }
}
