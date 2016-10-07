import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by seregin-av on 07.10.2016.
 */
public class WorkPage {

    WebDriver driver;

    public WorkPage (WebDriver driver){this.driver = driver;}

    public void findVacancy(String findstr) {
        WebElement str = driver.findElement(By.xpath("//div[@class='bloko-control-group__main'] /child::input"));
        str.sendKeys(findstr);
        str.submit();
    }
}
