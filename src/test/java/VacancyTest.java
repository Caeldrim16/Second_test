import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by seregin-av on 07.10.2016.
 */
public class VacancyTest {
    private WebDriver driver;

    @BeforeTest
    private void connection () throws Exception {
//        driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "Data for find", dataProviderClass = DataProviders.class)
    public void vacancyTest(String findstr) throws Exception {
        driver.get("http://www.tut.by");

        MainPage mainPage = new MainPage(driver);
        mainPage.goToWorkPage();

        WorkPage workPage = new WorkPage(driver);
        workPage.findVacancy(findstr);

        FindVacancy findVacancy = new FindVacancy(driver);
        List<WebElement> list = findVacancy.selectVacancy();

        if (list.isEmpty())
            throw new Exception("Not found vacancy");
    }

    @AfterTest
    void closeConnection() throws Exception{
        driver.quit();
    }
}
