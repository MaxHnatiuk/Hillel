import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FrontEndBasicTeachers {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));

        driver.manage().window().maximize();

        driver.get("https://ithillel.ua/");

        WebElement programmingCourse = driver.findElement(By.cssSelector(".course-cat-bar_icon[alt='Програмування']"));

        programmingCourse.click();

        WebElement frontEndCourse = driver.findElement(By.cssSelector("a.block-profession_link[href*='front-end-basic']"));

        frontEndCourse.click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(50, TimeUnit.MILLISECONDS)
                .withTimeout(15, TimeUnit.SECONDS)
                .ignoreAll(List.of(NoSuchElementException.class, ElementClickInterceptedException.class));

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(" +
                driver.findElement(By.cssSelector(".-profession")).getLocation().x + "," +
                driver.findElement(By.cssSelector(".-profession")).getLocation().y + ")");

        WebElement coachList = wait.until(d -> {
            return driver.findElement(By.cssSelector(".coach-list"));
        });

        List<WebElement> coachListItems = coachList.findElements(By.cssSelector(".coach-list_item"));
        WebElement coachesShowAllButton = driver.findElement(By.id("coachesShowAllButton"));

        wait.until(d -> {
            ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 100)");
            return coachesShowAllButton.isEnabled();
                });

        coachesShowAllButton.click();

        List<String> coachesName = coachListItems.stream()
                .map(we -> we.findElement(By.cssSelector(".coach-card_name")))
                .map(WebElement::getText)
                .toList();

        System.out.println(coachesName);

        Thread.sleep(3000);
    }
}