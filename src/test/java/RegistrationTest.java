import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationTest extends Data{

    //Локаторы
    private By InputLastName = By.xpath("//input[@input-label='Фамилия']");
    private By InputFirstName = By.xpath("//input[@input-label='Имя']");
    private By InputSurName = By.xpath("//input[@input-label='Отчество']");
    private By InputEmail = By.xpath("//input[@input-label='E-mail']");
    private By ChooseNumber = By.xpath("//div[@class = 'v-select__slot']");
    private By RightNumber = By.xpath("//div[@class = 'v-list-item primary--text v-list-item--active v-list-item--link theme--light']");
    private By InputNumber = By.xpath("//input[@input-label='Телефон']");
    private By InputPassword = By.xpath("//input[@input-label='Пароль']");
    private By InputAgainPassword = By.xpath("//input[@input-label='Повторите пароль']");
    private By NextButton = By.xpath("//button[@name = 'Далее']");


    private By ChooseCountry = By.xpath("//div[contains(@input-label, 'Страна')]");
    private By SelectCountry = By.xpath("//div[contains(text(),'Таиланд')]");
    private By NameOfOrganisation = By.xpath("//input[@input-label='Полное наименование организации']");
    private By ShortNameOrganisation = By.xpath("//input[@input-label='Сокращенное наименование организации']");
    private By AddressInput = By.xpath("//input[@input-label= 'Адрес']");
    private By TypeOfCompany = By.xpath("//div[contains(@input-label,'Тип компании')]");
    private By ChooseTypeOfCompany = By.xpath("//div[contains(text(),'Отправитель')]");
    private By TGNLcode = By.xpath("//input[@input-label= 'Код ТГНЛ']");
    private By INNcode = By.xpath("//input[@input-label= 'ИНН']");
    private By JobTitle = By.xpath("//input[@input-label= 'Ваша должность']");
    private By ManagerName = By.xpath("//input[@input-label= 'ФИО закрепленного менеджера']");
    private By FinishRegistration = By.xpath("//button[@class = 'v-btn v-btn--has-bg theme--light v-size--default']");

    @Test
    public void registration() throws InterruptedException{

        WebDriver driver = new FirefoxDriver();
        Data getDate = new Data();

        driver.get("https://demo.zveno.io/reg");
        driver.manage().window().maximize();
        driver.findElement(InputLastName).sendKeys(getDate.LastName);
        driver.findElement(InputFirstName).sendKeys(getDate.FirstName);
        driver.findElement(InputSurName).sendKeys(getDate.Surname);
        driver.findElement(InputEmail).sendKeys(getDate.Email);
        driver.findElement(ChooseNumber).click();
        driver.findElement(RightNumber).click();
        driver.findElement(InputNumber).sendKeys(getDate.Number);
        driver.findElement(InputPassword).sendKeys(getDate.Password);
        driver.findElement(InputAgainPassword).sendKeys(getDate.AgainPassword);
        driver.findElement(NextButton).click();


        driver.findElement(ChooseCountry).click();
        driver.findElement(SelectCountry).click();
        driver.findElement(NameOfOrganisation).sendKeys(getDate.NameOrganisation);
        driver.findElement(ShortNameOrganisation).sendKeys(getDate.ShortNameOrg);
        driver.findElement(AddressInput).sendKeys(getDate.AddressOfOrg);
        driver.findElement(TypeOfCompany).click();
        driver.findElement(ChooseTypeOfCompany).click();
        driver.findElement(TGNLcode).sendKeys(getDate.TGNLinput);
        driver.findElement(INNcode).sendKeys(getDate.INNinput);
        driver.findElement(JobTitle).sendKeys(getDate.TitleOfJob);
        driver.findElement(ManagerName).sendKeys(getDate.ManagerFIO);
        driver.findElement(FinishRegistration).click();
        Thread.sleep(5000);
        driver.quit();


    }

    }

