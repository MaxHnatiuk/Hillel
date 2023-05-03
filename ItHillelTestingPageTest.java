import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ItHillelTestingPageTest {
    private WebDriver driver;
    private ItHillelTestingPage testingPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://ithillel.ua/courses/testing");
        testingPage = new ItHillelTestingPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testGetCourses() {
        Assert.assertEquals(3, testingPage.getCourses().size());
    }

    @Test
    public void testGetAdditionalCourses() {
        Assert.assertEquals(2, testingPage.getAdditionalCourses().size());
    }

    @Test
    public void testGetOpportunities() {
        String expectedText = "Get a unique experience";
        Assert.assertTrue(testingPage.getOpportunities().contains(expectedText),
                "Opportunities does not contain expected text: " + expectedText);
    }

    @Test
    public void testGoToCategory() {
        String expectedURL = "https://ithillel.ua/courses/programming";
        testingPage.goToCategory("Програмування");
        Assert.assertEquals(expectedURL, testingPage.getCurrentURL(),
                "Did not navigate to the expected category");
    }
}

