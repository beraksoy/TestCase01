package testcase01;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class TestCase01 extends TestBase {

    String name ="Bilal ERAKSOY";
    String email = "eraksoy@gmail.com";

    @Test
    public void test01(){
        //    Test Case 1: Register User
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement anasayfa = driver.findElement(By.xpath("//*[@lang='en']"));
        Assert.assertTrue(anasayfa.isDisplayed());

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        //5. Verify 'New User Signup!' is visible
        WebElement kayit = driver.findElement(By.xpath("//div[@class='signup-form']"));
        Assert.assertTrue(kayit.isDisplayed());

        //6. Enter name and email address
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
        bekle(2);
        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys(email);
        bekle(2);
        //7. Click 'Signup' button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement hesapbilgileri = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        Assert.assertTrue(hesapbilgileri.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        bekle(1);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678");
        bekle(2);
        WebElement gun =driver.findElement(By.xpath("//select[@id='days']"));
        Select select=new Select(gun);
        select.selectByVisibleText("9");
        bekle(2);
        WebElement ay =driver.findElement(By.xpath("//select[@id='months']"));
        Select select1 =new Select(ay);
        select1.selectByVisibleText("January");
        bekle(2);
        WebElement yil = driver.findElement(By.xpath("//select[@id='years']"));
        Select select2 = new Select(yil);
        select2.selectByVisibleText("2000");
        bekle(2);

        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        bekle(1);


        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        bekle(1);

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Bilal");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("ERAKSOY");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("techpro");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Meydan");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Yenerkent");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Defne");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("ANKARA");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("06500");
        bekle(1);
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("555-654-159");
        bekle(1);



        //13. Click 'Create Account button'
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


        //14. Verify that 'ACCOUNT CREATED!' is visible
       WebElement kayityapildi =driver.findElement(By.xpath("//b[text()='Account Created!']"));
    Assert.assertTrue(kayityapildi.isDisplayed());

        //15. Click 'Continue' button
      driver.findElement(By.xpath("//a[text()='Continue']")).click();

    }

}
