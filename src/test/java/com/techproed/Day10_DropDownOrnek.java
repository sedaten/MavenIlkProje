package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Day10_DropDownOrnek {

    static WebDriver driver; // instance variable
    // 1. Amazon.com'a gidelim.
// 2. DropDown üzerinde Software seçelim.
// 3. Arama kutusuna JAVA yazalım ve arama yapalım.
// 4. Sonuç sayısını ekrana yazdıralım.

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1() {
        driver.get("http://amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Software");

        WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
        s.sendKeys("Java"+ Keys.ENTER);
        //<div class="a-section a-spacing-small a-spacing-top-small">
        //
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucSayisi.getText());
        Assert.assertTrue(sonucSayisi.getText().contains("JAVA"));
    }
}



