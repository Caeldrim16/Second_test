import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by seregin-av on 07.10.2016.
 */
public class FindVacancy {

    WebDriver driver;

    public FindVacancy(WebDriver driver) {this.driver = driver;}

    public List<WebElement> selectVacancy() {
        List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'специалист') or contains(text(),'Специалист') and contains(text(),'по') and contains(text(),'тестированию')]"));
        return list;
    }
}
