import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by seregin-av on 07.10.2016.
 */
public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) { this.driver = driver;}

    public void goToWorkPage(){
        WebElement work = driver.findElement(By.xpath("//a[@title='Работа']"));
        work.click();
    }
}

