package by.itacademy.kishkevich;

import by.itacademy.kishkevich.driver.MyDriver;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    //WebDriver driver;

    /*@BeforeEach
    public void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }*/

    @AfterEach
    public void finish(){
        MyDriver.quit();
    }
}
