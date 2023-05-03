import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ItHillelTestingPage {
    private final WebDriver driver;
    private final WebDriverWait wait = null;

    @FindBy(css = ".block-profession_list")
    private List<WebElement> courses;

    @FindBy(css = ".block-profession_group")
    private List<WebElement> additionalCourses;

    @FindBy(css = ".opportunities")
    private WebElement opportunities;

    public ItHillelTestingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getCourses() {
        return courses;
    }

    public List<WebElement> getAdditionalCourses() {
        return additionalCourses;
    }

    public String getOpportunities() {
        return opportunities.getText();
    }

    public void goToCategory(String category) {
        String link = driver.findElement(By.linkText(category)).getAttribute("href");
        driver.get(link);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}

