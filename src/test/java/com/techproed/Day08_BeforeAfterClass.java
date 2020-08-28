package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {

   @BeforeClass//Bu annetationa sahip method her class calismadan once calisir.
    public static void setup(){

       System.out.println("SetUp calisti");
   }
    @Test
    public void test1(){
        System.out.println("test1 calisti");
    }
    @Test
    public void test2() {
        System.out.println("test2 calisti");
    }
        @AfterClass //Bu annetationa sahip method her classtaki tester calistirildiktan sonra calisir.
    public static void tearDown(){
        System.out.println("tear Down");


    }



}
